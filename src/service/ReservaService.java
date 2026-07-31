package service;

import java.time.Duration;
import java.time.LocalDateTime;
import model.Reserva;

public class ReservaService {

    public BigDecimal processarCancelamento(Reserva reserva) {
        LocalDateTime momentoReserva = LocalDateTime.of(reserva.getDataReserva(), reserva.getHorarioInicio());
        LocalDateTime agora = LocalDateTime.now();

        // Calcula a diferença em horas entre o momento atual e o horário reservado
        long horasRestantes = Duration.between(agora, momentoReserva).toHours();

        if (horasRestantes >= 24) {
            // Cancelamento gratuito com mais de 24h de antecedência
            reserva.setStatus("CANCELADA");[cite: 1]
            return BigDecimal.ZERO;
        } else {
            // Aplica multa de 50% caso falte menos de 24h
            reserva.setStatus("CANCELADA");[cite: 1]
            return reserva.getValorTotal().multiply(new BigDecimal("0.50"));[cite: 1]
        }
    }
}