package model;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class Tarifa{
    private Integer id;
    private Quadra quadra;
    private DayOfWeek dia_semana;
    private LocalTime hora_inicio;
    private LocalTime hora_fim;
    private BigDecimal preco_hora;

    public Tarifa(Quadra quadra, DayOfWeek dia_semana, LocalTime hora_inicio,
                  LocalTime hora_fim, BigDecimal preco_hora){
        validarQuadra(quadra);
        this.quadra = quadra;
        validarDia_semana(dia_semana);
        this.dia_semana = dia_semana;

        checagem_horario(hora_inicio, hora_fim);
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;

        validarPreco_hora(preco_hora);
        this.preco_hora = preco_hora;
    }

    private void validarQuadra(Quadra quadra){
        if(quadra == null){
            throw new IllegalArgumentException("A quadra não pode não existir");
        }
    }

    private void validarDia_semana(DayOfWeek dia_semana){
        if(dia_semana == null){
            throw new IllegalArgumentException("O dia da semana não pode ser nulo");
        }
    }

    private void validarHora_inicio(LocalTime hora_inicio){
        if(hora_inicio == null){
            throw new IllegalArgumentException("A hora de inicio não pode ser vazia");
        }
    }

    private void validarHora_fim(LocalTime hora_fim){
        if(hora_fim == null){
            throw new IllegalArgumentException("A hora de fim não pode ser vazia");
        }
    }

    private void validarPreco_hora(BigDecimal preco_hora){
        if(preco_hora == null){
            throw new IllegalArgumentException("O preço não pode ser nulo");
        }
        if(preco_hora.compareTo(new BigDecimal("0.1")) < 0){
            throw new IllegalArgumentException("O preço não pode ser menor que 0");
        }
    }

    private void checagem_horario(LocalTime inicio, LocalTime fim){
        validarHora_inicio(inicio);
        validarHora_fim(fim);

        if(inicio.isBefore(fim)){
            throw new IllegalArgumentException("A hora de inicio não pode ser mais tarde que o horário de fim");
        }
        if(inicio.equals(fim)){
            throw new IllegalArgumentException("Os horários não podem ser idênticos");
        }
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Quadra getQuadra(){
        return quadra;
    }

    public void setQuadra(Quadra quadra){
        this.quadra = quadra;
    }

    public DayOfWeek getDia_semana(){
        return dia_semana;
    }

    public void setDia_semana(DayOfWeek dia_semana){
        this.dia_semana = dia_semana;
    }

    public LocalTime getHora_inicio(){
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio){
        this.hora_inicio = hora_inicio;
    }

    public LocalTime getHora_fim(){
        return hora_fim;
    }

    public void setHora_fim(LocalTime hora_fim){
        this.hora_fim = hora_fim;
    }

    public BigDecimal getPreco_hora(){
        return preco_hora;
    }

    public void setPreco_hora(BigDecimal preco_hora){
        this.preco_hora = preco_hora;
    }
}