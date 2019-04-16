/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.GruposMusculares;
import model.dao.GruposMuscularesDAO;
import javax.swing.JTextField;

/**
 *
 * @author yanlf
 */
public class FrameGrupoMuscular extends javax.swing.JFrame {

    /**
     * Creates new form FrameGrupoMuscular
     */
    public FrameGrupoMuscular() {
        initComponents();
     
        DefaultTableModel model = (DefaultTableModel) TableGrupoMuscular.getModel();
        TableGrupoMuscular.setRowSorter(new TableRowSorter(model));
        
        readJTable();
    }
    
    public void readJTable (){
        
        DefaultTableModel model = (DefaultTableModel) TableGrupoMuscular.getModel();
        
        model.setNumRows(0);
        
        GruposMuscularesDAO gdao = new GruposMuscularesDAO();
        
        for(GruposMusculares g:gdao.read()){
            
            model.addRow(new Object[]{
                    
                    g.getDesc()
            });
        }
    }
    
    public void readPesquisa (String pesquisa){
        
        DefaultTableModel model = (DefaultTableModel) TableGrupoMuscular.getModel();
        
        model.setNumRows(0);
        
        GruposMuscularesDAO gdao = new GruposMuscularesDAO();
        
        for(GruposMusculares g:gdao.readPesquisa(pesquisa)){
            
            model.addRow(new Object[]{
                    
                    g.getDesc()
                    
            });
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableGrupoMuscular = new javax.swing.JTable();
        txtGrupoMuscular = new gym.JTextFieldHint(new JTextField(),"","Pesquisar Grupo Muscular");
        bttPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TableGrupoMuscular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableGrupoMuscular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(TableGrupoMuscular);

        txtGrupoMuscular.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtGrupoMuscular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGrupoMuscularKeyPressed(evt);
            }
        });

        bttPesquisa.setText("Pesquisar");
        bttPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(txtGrupoMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(bttPesquisa)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrupoMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttPesquisa))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPesquisaActionPerformed
        
        if("".equals(txtGrupoMuscular.getText())){
        
            readPesquisa(txtGrupoMuscular.getText());
            
        }else{
            readPesquisa(txtGrupoMuscular.getText());
        }
    }//GEN-LAST:event_bttPesquisaActionPerformed

    private void txtGrupoMuscularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrupoMuscularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoMuscularKeyPressed

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
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGrupoMuscular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGrupoMuscular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableGrupoMuscular;
    private javax.swing.JButton bttPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGrupoMuscular;
    // End of variables declaration//GEN-END:variables
}
