/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cadastro;




/**
 *
 * @author Usuario
 */
public class CadastroDAO {
// criar cadastro

    public void create(Cadastro c) {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cadastro(dataCadastro,nome,endereco,cidade,telefone,sexo,cpf,rg,nascimento,idade,email,estadocivil,objetivo)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            //stmt.setInt(1, c.getIdcadastro());
            stmt.setString(1, c.getDataCadastro());
            stmt.setString(2,c.getNome());
            stmt.setString(3,c.getEndereco());
            stmt.setString(4,c.getCidade());
            stmt.setString(5,c.getTelefone());
            stmt.setString(6,c.getSexo());
            stmt.setString(7,c.getCpf());
            stmt.setString(8,c.getRg());
            stmt.setString(9,c.getNascimento());
            stmt.setInt(10,c.getIdade());
            stmt.setString(11,c.getEmail());
            stmt.setString(12,c.getEstadocivil());
            stmt.setString(13,c.getObjetivo());
            
           

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
}
//    //ATUALIZAR
//    
//    public void update(Cadastro c) {
//        Connection con = ConnectionFactory.getConnection();
//
//        PreparedStatement stmt = null;
//
//        try {
//            stmt = con.prepareStatement("UPDATE  Cadastro SET CPF = ?,nome = ?,dataNascimento = ? ,telefone = ?,email = ?");
//            stmt.setInt(1, c.getCPF());
//            stmt.setString(2, c.getNome());
//            stmt.setDate(3, (Date) c.getDataNascimento());
//            stmt.setString(4, c.getTelefone());
//            stmt.setString(5, c.getEmail());
//            //stmt.setObject(6,c.getIdTipoUsuarios());
//            //stmt.setObject(7,c.getIdFicha());
//            //stmt.setString(6, c.getSenha());
//
//            stmt.execute();
//
//            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//
//
//    //listar 
//    public List<Cadastro> read() {
//
//        Connection con = ConnectionFactory.getConnection();
//
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        List<Cadastro> cadas = new ArrayList<>();
//
//        try {
//            stmt = con.prepareStatement("SELECT * FROM Cadastro");
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                
//                Cadastro c = new Cadastro();
//
//                c.setNome(rs.getString("nome"));
//                c.setCPF(rs.getInt("CPF"));
//                c.setDataNascimento(rs.getDate("dataNascimento"));
//                c.setTelefone(rs.getString("telefone"));
//                c.setEmail(rs.getString("email"));
//                
//                //colocaram como objetos nao estou conseguindo 
////                c.setIdTipoUsuarios((TiposUsuarios)(Object)rs.getObject());
//               // c.setIdFicha((Ficha)rs.getObject("idFicha"));
//               
//                //c.setSenha(rs.getString("senha"));
//
//                cadas.add(c);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt, rs);
//        }
//
//        return cadas;
//
//    }
//}
