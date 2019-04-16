
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {
     
    public boolean ValidaLogin(String InpCPF,String InpSenha){
        Boolean Ret = false;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT CPF,Senha FROM Cadastro WHERE CPF = ?" );
            stmt.setString(1, InpCPF);
            rs = stmt.executeQuery();
            
            rs.last(); 
            int rowcount = rs.getRow(); 
            rs.beforeFirst();
            
            if(rowcount>0) {
                while (rs.next()){
                    String strSenha = rs.getString(2);
                    if(InpSenha.equals(strSenha)){
                        Ret = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Senha incorreta");                    
                    }                
                }
            }else{
                JOptionPane.showMessageDialog(null, "CPF não encontrado ");
            }
                    
        } catch (SQLException ex) {
            ConnectionFactory.closeConnection(con, stmt, rs);            
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fazer login, contate ");
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        return Ret;
    }
}
