package dao;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDAO {

    // Método essencial para validar conflito de horário
    public boolean existeConflito(int quadraId, LocalDate data, LocalTime inicio, LocalTime fim) throws SQLException {
        String sql = "SELECT COUNT(*) FROM reservas " +
                "WHERE quadra_id = ? " +
                "AND data_reserva = ? " +
                "AND status = 'CONFIRMADA' " +
                "AND (? < horario_fim AND ? > horario_inicio)";[cite: 1]

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, quadraId);
            stmt.setDate(2, Date.valueOf(data));
            stmt.setTime(3, Time.valueOf(inicio));
            stmt.setTime(4, Time.valueOf(fim));

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }
}
