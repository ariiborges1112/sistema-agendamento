package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private Integer id;
    private Integer clienteId;
    private Integer quadraId;
    private Integer esporteId;
    private LocalDate dataReserva;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private BigDecimal valorTotal;
    private String status; // "CONFIRMADA", "CANCELADA", "FINALIZADA"

    // Constructores, Getters e Setters


    public Integer getId() {
        return Id;
    }

    public void setId() {
        this.Id = Id;
    }

    public Integer getClienteIdId() {
        return ;
    }

    public void setId(Integer clienteId) {
        this.Id = clienteId;
    }

   //falta terminar os outros
}
