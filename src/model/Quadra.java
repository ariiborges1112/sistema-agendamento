package model;

public class Quadra{
    private Integer id;
    private String nome;
    private boolean coberta;
    private boolean ativa;

    public Quadra(String nome){
        validarNome(nome);
        this.nome = nome;

        this.coberta = false;
        this.ativa = true;
    }

    private void validarNome(String nome){
        if(nome == null || nome.trim().isEmpty()){ //not null
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if(nome.length() > 100){ //varchar(50)
            throw new IllegalArgumentException("O nome não pode ter mais que 50 caracteres");
        }
    }

    public Integer getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public boolean isCoberta(){
        return coberta;
    }

    public boolean isAtiva(){
        return ativa;
    }
}