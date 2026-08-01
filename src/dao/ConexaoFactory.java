package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory{
    private static final String url = "jdbc:postgresql://localhost:5432/sistema-agendamento";
    private static final String user = "postgres";
    private static final String password = "1234";

    public static Connection conectar(){
        try{
            Connection conexaoGerada = DriverManager.getConnection(url, user, password);

            System.out.println("Banco conectado com sucesso!");
            return conexaoGerada;
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}