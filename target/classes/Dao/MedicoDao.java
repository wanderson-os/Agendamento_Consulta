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

/**
 *
 * @author Wanderson
 */
public class MedicoDao {

    private Connection conn;
    ArrayList<MedicoModel> medicos = null;

    public int cadastrar(MedicoModel medico) {
        try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "insert into medico(crm,nome) values (?, ?)";
        try {

            pStatement = conn.prepareStatement(sql);
            pStatement.setInt(1, medico.getCrm());
            pStatement.setString(2, medico.getNome());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
        }

        fecharConexao();
        return ret;
    }

    public int alterar(MedicoModel medico) {
        try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "update medico set crm = ?, nome = ? where crm = ?";
        try {

            pStatement = conn.prepareStatement(sql);
            pStatement.setInt(1, medico.getCrm());
            pStatement.setString(2, medico.getNome());
            pStatement.setInt(3, medico.getCrm());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
        }

        fecharConexao();
        return ret;
    }

    public int excluir(MedicoModel medico) {
    try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "delete from medico where crm = ?";
        try {

            pStatement = conn.prepareStatement(sql);
            pStatement.setInt(1, medico.getCrm());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
        }

        fecharConexao();
        return ret;

    }

    public ArrayList<MedicoModel> listar() {
    try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        boolean umaVez = true;
        sql = ("select crm, nome from medico");

        try {
            pStatement = conn.prepareStatement(sql);
            rs = pStatement.executeQuery();

            while (rs.next()) {
                if (umaVez) {
                    medicos = new ArrayList<>();
                    umaVez = false;
                }
                MedicoModel medico = new MedicoModel(rs.getInt("crm"), rs.getString("nome"));

                medicos.add(medico);

            }

        } catch (Exception e) {

        }
        fecharConexao();
        return medicos;

    }

    public void fecharConexao() {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }
}
