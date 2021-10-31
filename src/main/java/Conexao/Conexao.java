package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexao {

    private static Connection conn;
    private static boolean erro;

    public static Connection getConexao() throws SQLException {
        if ((conn == null) || (conn.isClosed())) {
            conn = FabricaDeConexoes();
        }
        return conn;
    }

    public static Connection FabricaDeConexoes() {
        String url;
        try {

            Class.forName("org.postgresql.Driver");
            Properties props = new Properties();
            props.put("user", "postgres");
            props.put("password", "123321");
            props.put("charset", "UTF-8");
            url = "jdbc:postgresql://localhost:5432/AgendamentoConsulta";
            return DriverManager.getConnection(url, props);

        } catch (Exception e) {

        }

        return null;
    }
}
