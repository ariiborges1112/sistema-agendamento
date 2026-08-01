package app;

import dao.ConexaoFactory;

public class Main{
    public static void main(String[] args){
        ConexaoFactory.conectar();
    }
}