package model;

import java.util.ArrayList;
import java.util.List;

public class Quadra{
    private Integer id;
    private String nome;
    private boolean coberta;
    private boolean ativa;
    private List<Esporte> esportes;

    public Quadra(String nome){
        validarNome(nome);
        this.nome = nome;

        this.coberta = false;
        this.ativa = true;
        this.esportes = new ArrayList<>();
    }

    private void validarNome(String nome){
        if(nome == null || nome.trim().isEmpty()){ //not null
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if(nome.length() > 100){ //varchar(50)
            throw new IllegalArgumentException("O nome não pode ter mais que 50 caracteres");
        }
    }

    public void adicionarEsporte(Esporte esporte){
        if(esporte == null){
            throw new IllegalArgumentException("Esporte inválido");
        }
        esportes.add(esporte);
        System.out.println(esporte.getNome() + " foi adicionado a lista de esportes disponiveis");
    }

    public void removerEsporte(Esporte esporte){
        if(esporte == null){
            throw new IllegalArgumentException("Esporte inválido");
        }

        boolean removeu = esportes.remove(esporte);

        if(removeu)
            System.out.println(esporte.getNome() + " foi removido da lista de esportes disponiveis");

        else System.out.println("O esporte " + esporte.getNome() + " não está na lista");
    }

    public void listarEsportes(){
        System.out.print("----LISTA DE ESPORTES DISPONIVEIS NA QUADRA----");
        if(esportes.isEmpty()){
            throw new IllegalArgumentException("Não há nenhum esporte listado");
        }

        for(Esporte e : esportes){
            System.out.println("----" + this.nome + "----");
            System.out.println(e.toString());
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

    public boolean isCoberta(){
        return coberta;
    }

    public void setCoberta(boolean coberta){
        this.coberta = coberta;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public List<Esporte> getEsportes(){
        return esportes;
    }
}