package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Cliente{
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDateTime data_cadastro;

    public Cliente(String nome, String cpf, String telefone){
        validarNome(nome);
        this.nome = nome;
        validarCpf(cpf);
        this.cpf = cpf;
        validarTelefone(telefone);
        this.telefone = telefone;
    }

    private void validarNome(String nome){
        if(nome == null || nome.trim().isEmpty()){ //not null
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if(nome.length() > 100){ //varchar(100)
            throw new IllegalArgumentException("O nome não pode ter mais que 100 caracteres");
        }
    }

    private void validarCpf(String cpf){
        if(cpf == null || cpf.trim().isEmpty()){ //not null
            throw new IllegalArgumentException("O cpf não pode ser vazio");
        }
        if(cpf.length() > 14){ //varchar(14)
            throw new IllegalArgumentException(("O cpf não pode ter mais que 14 caracteres"));
        }
    }

    private void validarTelefone(String telefone){
        if(telefone == null || telefone.trim().isEmpty()){ //not null
            throw new IllegalArgumentException("O telefone não pode ser vazio");
        }
        if(telefone.length() > 20){ //varchar(20)
            throw new IllegalArgumentException("O telefone não pode ter mais que 20 caracteres");
        }
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        validarNome(nome);
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        validarCpf(cpf);
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        validarTelefone(telefone);
        this.telefone = telefone;
    }

    public LocalDateTime getData_cadastro(){
        return data_cadastro;
    }
}