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
import java.time.ZoneId;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import model.ConsultaModel;
import model.MedicoModel;
import model.PacienteModel;

/**
 *
 * @author Wanderson
 */
public class ConsultaDao {

    private Connection conn;
    ArrayList<ConsultaModel> consultas = null;

    public int cadastrar(ConsultaModel consulta) {

        try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }

        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "insert into consulta(crm_medico,cpf_paciente,data,hora) values (?, ?, ?, ?)";
        try {
            Date data = Date.valueOf(consulta.getData());
            pStatement = conn.prepareStatement(sql);
            pStatement.setInt(1, consulta.getMedico().getCrm());
            pStatement.setString(2, consulta.getPaciente().getCpf());
            pStatement.setDate(3, data);
            pStatement.setTime(4, Time.valueOf(consulta.getHora()));
            pStatement.execute();
            pStatement.close();
            ret = 1;
        } catch (Exception e) {
        }

        fecharConexao();
        return ret;
    }

    public int alterar(ConsultaModel consulta, int crm, String cpf) {
    try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = ("update consulta set crm_medico = ? ,cpf_paciente = ? ,data = ? ,hora = ? where crm_medico = '" + crm + "' and cpf_paciente = '" + cpf + "'");
        try {

            Date data = Date.valueOf(consulta.getData());
            pStatement = conn.prepareStatement(sql);
            pStatement.setInt(1, consulta.getMedico().getCrm());
            pStatement.setString(2, consulta.getPaciente().getCpf());
            pStatement.setDate(3, data);
            pStatement.setTime(4, Time.valueOf(consulta.getHora()));
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
        }

        fecharConexao();
        return ret;
    }

    public int excluir(ConsultaModel consulta) {
    try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        int ret = 0;
        PreparedStatement pStatement = null;
        sql = "delete from consulta where crm_medico = ? and cpf_paciente = ?";
        try {

            pStatement.setInt(1, consulta.getMedico().getCrm());
            pStatement.setString(2, consulta.getPaciente().getCpf());
            pStatement.execute();
            pStatement.close();
            ret = 1;

        } catch (Exception e) {
        }

        fecharConexao();
        return ret;

    }

    public ArrayList<ConsultaModel> listar() {
    try {
            conn = Conexao.getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql;
        PreparedStatement pStatement = null;
        ResultSet rs = null;
        boolean umaVez = true;
        sql = ("select m.nome as nome_medico, m.crm, p.nome as nome_paciente, p.cpf, c.data, c.hora from consulta c "
                + "join medico m on c.crm_medico = m.crm join paciente p on p.cpf = c.cpf_paciente");

        try {
            pStatement = conn.prepareStatement(sql);
            rs = pStatement.executeQuery();
            while (rs.next()) {
                if (umaVez) {
                    consultas = new ArrayList<>();
                    umaVez = false;
                }
                MedicoModel medico = new MedicoModel(rs.getInt("crm"), rs.getString("nome_medico"));
                PacienteModel paciente = new PacienteModel();
                paciente.setCpf(rs.getString("cpf"));
                paciente.setNome(rs.getString("nome_paciente"));
                ConsultaModel consulta = new ConsultaModel(medico, paciente,
                        rs.getDate("data").toLocalDate(), rs.getTime("hora").toLocalTime());
                consultas.add(consulta);
            }

        } catch (Exception e) {

        }
        fecharConexao();
        return consultas;

    }

    public void fecharConexao() {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }

}
