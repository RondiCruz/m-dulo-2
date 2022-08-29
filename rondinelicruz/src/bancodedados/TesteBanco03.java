package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class TesteBanco03 {
    public static void main(String[] args) {

        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";

        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "update aluno set nome = ? where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Maga Pata da Silva");
            ps.setInt(2,39);
            var  numlinhasafetadas = ps.executeUpdate();

            System.out.println("Numero de linhas afetadas:" + numlinhasafetadas);

        } catch (SQLException e) {
            e.printStackTrace();
        
      }
    
    }
}