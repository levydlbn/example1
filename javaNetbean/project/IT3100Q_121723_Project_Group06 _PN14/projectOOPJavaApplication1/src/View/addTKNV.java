/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.NVBC;
import Model.NVTV;
import Model.TK;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lê văn vỹ
 */
public class addTKNV extends javax.swing.JDialog {

    /**
     * Creates new form Manager
     */
    
    private Home home;
    private List<NVBC> NVBC;
    private List<NVTV> NVTV;
    private DefaultTableModel modelNVBC;
    private DefaultTableModel modelNVTV;
    
    public addTKNV(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        this.setTitle("Personal Statistical");
        initComponents();
        home = (Home) parent;
        NVTV = new ArrayList<>();
        NVBC = new ArrayList<>();
        NVTV.addAll(home.getListNVTV());
        NVBC.addAll(home.getListNVBC());
        modelNVBC = (DefaultTableModel) tbbc.getModel();
        modelNVTV = (DefaultTableModel) tbtv.getModel();
        showNVBC();
        showNVTV();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbc = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtv = new javax.swing.JTable();
        Refresh1 = new javax.swing.JButton();
        Refresh2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtinfonvbc = new javax.swing.JTextField();
        Search1 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtinfonvtv = new javax.swing.JTextField();
        Search2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Full Time Employee");

        jLabel2.setText("Part Time Employee");

        tbbc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Name", "Number CMT", "Time Start", "Salary"
            }
        ));
        jScrollPane1.setViewportView(tbbc);

        tbtv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Name", "Number CMT", "Time Start", "Salary"
            }
        ));
        jScrollPane2.setViewportView(tbtv);

        Refresh1.setText("Refresh");
        Refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh1ActionPerformed(evt);
            }
        });

        Refresh2.setText("Refresh");
        Refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Info NVBC");

        txtinfonvbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinfonvbcActionPerformed(evt);
            }
        });

        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel4.setText("Info NVTV");

        Search2.setText("Search");
        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(231, 231, 231))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(Refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Refresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(txtinfonvbc, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(txtinfonvtv, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh2)
                    .addComponent(Refresh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinfonvbc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinfonvtv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search1)
                    .addComponent(Search2))
                .addGap(49, 49, 49)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        // TODO add your handling code here:
        String info = txtinfonvbc.getText();
        if(info.length() > 0){
            List<NVBC> list = new ArrayList<>();
            for (NVBC nvbc : NVBC) {
                if((nvbc.getName()).matches(info) || nvbc.getSoCMT().matches(info) || nvbc.getTGBatDau().matches(info)){
                    list.add(nvbc);
                }
            }
            NVBC.clear();
            NVBC.addAll(list);
            if(list.size() == 0){
                JOptionPane.showMessageDialog(rootPane,"Employee not found");
            }else{
                this.showNVBC();
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane,"Please Fill in employee information correctly");
        }
    }//GEN-LAST:event_Search1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void Refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh1ActionPerformed
        // TODO add your handling code here:
        NVBC.clear();
        NVBC.addAll(home.getListNVBC());
        showNVBC();
    }//GEN-LAST:event_Refresh1ActionPerformed

    private void Refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh2ActionPerformed
        // TODO add your handling code here:
        NVTV.clear();
        NVTV.addAll(home.getListNVTV());
        showNVTV();
    }//GEN-LAST:event_Refresh2ActionPerformed

    private void txtinfonvbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinfonvbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinfonvbcActionPerformed

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
        // TODO add your handling code here:
        String info = txtinfonvtv.getText();
         if(info.length() > 0){
            List<NVTV> list = new ArrayList<>();
            for (NVTV nvtv : NVTV) {
                if((nvtv.getName()).matches(info) || nvtv.getSoCMT().matches(info) || nvtv.getTGBatDau().matches(info)){
                    list.add(nvtv);
                }
            }
            NVTV.clear();
            NVTV.addAll(list);
            if(list.size() == 0){
                JOptionPane.showMessageDialog(rootPane, "Employee not found");
            }else{
                this.showNVTV();
            }
         } else{
            JOptionPane.showMessageDialog(rootPane,"Please Fill in employee information correctly!");
        }
    }//GEN-LAST:event_Search2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addTKNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTKNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTKNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTKNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addTKNV dialog = new addTKNV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Refresh1;
    private javax.swing.JButton Refresh2;
    private javax.swing.JButton Search1;
    private javax.swing.JButton Search2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbbc;
    private javax.swing.JTable tbtv;
    private javax.swing.JTextField txtinfonvbc;
    private javax.swing.JTextField txtinfonvtv;
    // End of variables declaration//GEN-END:variables

   private void showNVBC(){
        modelNVBC.setRowCount(0);
        int i = 1;
        for (NVBC nvbc : NVBC) {
            modelNVBC.addRow(new Object[]{
                i++, nvbc.getName(), nvbc.getSoCMT(), nvbc.getTGBatDau(), 2000000 + nvbc.salary() + "  đ"
            });
        }
        
    }
   
   private void showNVTV(){
       modelNVTV.setRowCount(0);
       int i = 1;
       for (NVTV nvtv : NVTV) {
           modelNVTV.addRow(new Object[]{
               i++, nvtv.getName(), nvtv.getSoCMT(), nvtv.getTGBatDau(), nvtv.salary() + "  đ"
           });
       }
   }
}







