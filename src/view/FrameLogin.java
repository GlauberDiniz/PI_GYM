/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import gym.JPassWordFieldHint;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.dao.LoginDAO;


/**
 *
 * @author yanlf
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLogin = new gym.JTextFieldHint(new JTextField(),"","Login");
 ;
        txtSenha = new JPassWordFieldHint (new JPasswordField(), "", "Senha");
 ;
        JBLogin1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JBSair = new javax.swing.JButton();
        JLrecuperarSenha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(153, 153, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 480));

        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLoginMouseEntered(evt);
            }
        });
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        JBLogin1.setBackground(new java.awt.Color(58, 65, 84));
        JBLogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBLogin1.setForeground(new java.awt.Color(255, 255, 255));
        JBLogin1.setText("Login");
        JBLogin1.setBorderPainted(false);
        JBLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBLogin1.setFocusPainted(false);
        JBLogin1.setFocusable(false);
        JBLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBLogin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBLogin1MouseExited(evt);
            }
        });
        JBLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLogin1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 230, 118));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        JBSair.setBackground(new java.awt.Color(217, 81, 51));
        JBSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBSair.setForeground(new java.awt.Color(255, 255, 255));
        JBSair.setText("Sair");
        JBSair.setBorderPainted(false);
        JBSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBSair.setFocusPainted(false);
        JBSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBSairMouseExited(evt);
            }
        });
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        JLrecuperarSenha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        JLrecuperarSenha.setText("Recuperar");
        JLrecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLrecuperarSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLrecuperarSenhaMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Entre com suas credenciais");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Esqueceu sua senha?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLrecuperarSenha)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(63, 63, 63)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLrecuperarSenha)
                    .addComponent(jLabel5))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel3)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginMouseEntered

    private void JLrecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseEntered
        JLrecuperarSenha.setForeground(Color.red);
    }//GEN-LAST:event_JLrecuperarSenhaMouseEntered

    private void JLrecuperarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLrecuperarSenhaMouseExited
        JLrecuperarSenha.setForeground(Color.black);
    }//GEN-LAST:event_JLrecuperarSenhaMouseExited

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void JBLogin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLogin1MouseEntered
        JBLogin1.setBackground(new Color(235, 235, 235));
        JBLogin1.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_JBLogin1MouseEntered

    private void JBSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSairMouseEntered
        JBSair.setBackground(new Color(235, 235, 235));
        JBSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_JBSairMouseEntered

    private void JBSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSairMouseExited
        JBSair.setBackground(new Color(217, 81, 51));
        JBSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_JBSairMouseExited

    private void JBLogin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLogin1MouseExited
        JBLogin1.setBackground(new Color(58, 65, 84));
        JBLogin1.setForeground(Color.WHITE);
    }//GEN-LAST:event_JBLogin1MouseExited

    private void JBLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLogin1ActionPerformed
        LoginDAO Login = new LoginDAO();  
        String strSenha =  new String(txtSenha.getPassword());
        if(Login.ValidaLogin(txtLogin.getText(),strSenha) == true){
           new HomeSysGym().setVisible(true);
           this.dispose(); 
        }
        
    }//GEN-LAST:event_JBLogin1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLogin1;
    private javax.swing.JButton JBSair;
    private javax.swing.JLabel JLrecuperarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
