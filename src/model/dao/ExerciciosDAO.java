
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Exercicios;
import model.bean.GruposMusculares;

public class ExerciciosDAO {
   
        public void Create (Exercicios E){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
            GruposMusculares G = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO exercicios (desc,idGrupos) VALUES (?,?)");
            stmt.setString(1, E.getDesc());
            stmt.setInt(2, E.getIdExercicios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Exercicio Cadastrado");
                    
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Casdastrar: " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void Update (Exercicios E){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE exercicios SET nome = ? WHERE idExercicios = ?");
            stmt.setString(1, E.getDesc());
            stmt.setInt(2, E.getIdExercicios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Exercicio Atualizado");
                    
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao salvar: " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void Delete (Exercicios E){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String title = "Confirmar Exclusao";
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o exercicio?", title, JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            
            try {
            stmt = con.prepareStatement("DELETE FROM exercicios WHERE idExercicios = ?");
          
            stmt.setInt(1, E.getIdExercicios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Exercicio Excluido!");
                    
            } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + ex);
            
            }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            }
        }     
    }
    
    
    public List <Exercicios> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Exercicios> exercicio = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("Select exercicios.IdExercicios,"
                                      + "       exercicios.desc as descExer, "
                                      + "       GruposMusculares.descGrupo as descGrop"
                                      + "  From exercicios "
                                      + "       inner join GruposMusculares "
                                      + "       on exercicios.idGrupos = gruposmusculares.idGrupos");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Exercicios E = new Exercicios();
                GruposMusculares G = new GruposMusculares();
                
                E.setIdExercicios(rs.getInt("idExercicios"));
                E.setDesc(rs.getString("desc"));
                G.setIdGrupos(rs.getInt("idGrupos"));
                
                exercicio.add(E);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return exercicio;
    }
    
    public List <Exercicios> readPesquisa(String pesquisa){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Exercicios> exercicio = new ArrayList<>();
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM exercicios WHERE desc LIKE ?");
            stmt.setString(1, "%"+pesquisa+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Exercicios E = new Exercicios();
                GruposMusculares G = new GruposMusculares();
                
                E.setIdExercicios(rs.getInt("idExercicios"));
                E.setDesc(rs.getString("desc"));
                G.setIdGrupos(rs.getInt("idGrupos"));

                exercicio.add(E);
                
            }
                    
        } catch (SQLException ex) {
                        
            JOptionPane.showMessageDialog(null, "Erro ao gerar lista " + ex);
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return exercicio;
    }
}
