package model;

public class Esporte{
    private Integer id;
    private String nome;

    public Esporte(String nome){
        validarNome(nome);
        this.nome = nome;
    }

    private void validarNome(String nome){
        if(nome == null || nome.trim().isEmpty()){ //not null
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if(nome.length() > 50){ //varchar(50)
            throw new IllegalArgumentException("O nome não pode ter mais que 50 caracteres");
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

    @Override
    public String toString(){
        return "\nID: " + this.getId() +
                "\nNome: " + this.getNome();
    }
}