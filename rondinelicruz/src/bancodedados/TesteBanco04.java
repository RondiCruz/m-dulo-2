package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TesteBanco04 {

  
    public static void main(String[] args) {

        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";

        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "delete from aluno where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 39);
            var numlinhasafetadas = ps.executeUpdate();

            System.out.println("Numero de linhas afetadas:" + numlinhasafetadas);

        } catch (SQLException e) {
            e.printStackTrace();
        
      }
        
    }
    
}
