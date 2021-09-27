/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.MedicoModel;
import model.PacienteModel;

/**
 *
 * @author Wanderson
 */
public class PacienteDao {

    private Connection conn;
    ArrayList<PacienteModel> pacientes = null;

    public int cadastrar(PacienteModel paciente) {
        conn = Conexao.getConexao();
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "insert into paciente(cpf,nome,endereco,telefone) values (?, ?, ?, ?)";
        try {

            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, paciente.getCpf());
            pStatement.setString(2, paciente.getNome());
            pStatement.setString(3, paciente.getEndereco());
            pStatement.setString(4, paciente.getTelefone());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir");
        }

        fecharConexao();
        return ret;
    }

    public int alterar(PacienteModel paciente) {
        conn = Conexao.getConexao();
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "update paciente set nome = ?, endereco = ?, telefone = ? where cpf = ?";
        try {

            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, paciente.getNome());
            pStatement.setString(2, paciente.getEndereco());
            pStatement.setString(3, paciente.getTelefone());
            pStatement.setString(4, paciente.getCpf());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar");
        }

        fecharConexao();
        return ret;
    }

    public int excluir(PacienteModel paciente) {
        conn = Conexao.getConexao();
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "delete from paciente where cpf = ?";
        try {

            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, paciente.getCpf());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir");
        }

        fecharConexao();
        return ret;

    }

    public ArrayList<PacienteModel> listar() {
        conn = Conexao.getConexao();
        String sql;
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        boolean umaVez = true;
        sql = ("select nome, cpf, endereco, telefone from paciente");

        try {
            pStatement = conn.prepareStatement(sql);
            rs = pStatement.executeQuery();

            while (rs.next()) {
                if (umaVez) {
                    pacientes = new ArrayList<>();
                    umaVez = false;
                }
                PacienteModel paciente = new PacienteModel(rs.getString("cpf"),
                        rs.getString("nome"), rs.getString("endereco"), rs.getString("telefone"));
                pacientes.add(paciente);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar!");

        }
        fecharConexao();
        return pacientes;

    }

    public void fecharConexao() {
        try {
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão");
        }
    }

}
