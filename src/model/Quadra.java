package model;

public class Quadra{
    private Integer id;
    private String nome;
    private boolean coberta;
    private boolean ativa;

    public Quadra(String nome, boolean coberta, boolean ativa){
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