package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Esporte;

public class EsporteDAO{
    public void salvar(Esporte esporte){
        try{
            String sql = "INSERT INTO esportes(nome) values (?)";

            Connection conexao = ConexaoFactory.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, esporte.getNome());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}