package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConexao() {
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
            JOptionPane.showMessageDialog(null, "Erro na conexão !!!");
        }

        return null;
    }
}
