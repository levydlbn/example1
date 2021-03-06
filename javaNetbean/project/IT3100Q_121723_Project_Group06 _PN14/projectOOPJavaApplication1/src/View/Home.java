
package View;

import Controller.Controller;
import Controller.ControllerImp;
import Model.NVBC;
import Model.NVTV;
import Model.TK;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lê văn vỹ
 */
public class Home  extends javax.swing.JFrame implements View{

    /**
     * Creates new form home
     */
    private List<NVTV> listNVTV;
    private List<NVBC> listNVBC;
    private List<TK> listTK;
    private DefaultTableModel modelNVBC; 
    private DefaultTableModel modelNVTV;
    private DefaultTableModel modelTK;
    private ControllerImp controller;
    private int selectedIndex;
    
    public Home() {
        this.setTitle("Manage Employees of Insurance Company");
        initComponents();
        this.setLocationRelativeTo(null);
        listNVBC = new ArrayList<>();
        modelNVBC = (DefaultTableModel) tbbienche.getModel();
        listNVTV = new ArrayList<>();
        modelNVTV = (DefaultTableModel) tbthoivu.getModel();
        listTK = new ArrayList<>();
        modelTK = (DefaultTableModel) tbthongke.getModel();
        controller = new ControllerImp();
        
        showNVBC();
        showNVTV();
        showTK();
    }

    public List<NVTV> getListNVTV() {
        return listNVTV;
    }

    public List<NVBC> getListNVBC() {
        return listNVBC;
    }
    
    public List<TK> getListTK(){
        return listTK;
    }
    
    public void themNVBC(NVBC NV1){
        listNVBC.add(NV1);
        this.showData(listNVBC, modelNVBC);
        controller.writeToFile(listNVBC, "NVBC.TXT");
    }
    
    public void themNVTV(NVTV NV1){
        listNVTV.add(NV1);
        this.showData(listNVTV, modelNVTV);
        controller.writeToFile(listNVTV, "NVTV.TXT");
    }
    
    public void themTK(TK tk1){
        listTK.add(tk1);
        this.showData(listTK, modelTK);
        controller.writeToFile(listTK, "TKL.TXT");
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNhanvien1 = new javax.swing.JTable();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Management = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbienche = new javax.swing.JTable();
        addNVBC = new javax.swing.JButton();
        editNVBC = new javax.swing.JButton();
        DeleteNVBC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        addNVTV = new javax.swing.JButton();
        editNVTV = new javax.swing.JButton();
        deleteNVTV = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbthoivu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        PersonalStatistics = new javax.swing.JButton();
        GeneralStatistics = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbthongke = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        tbNhanvien1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Số CMT", "Đơn Vị", "TG bắt đầu", "Loại Nhân Viên", "Số hợp đồng"
            }
        ));
        tbNhanvien1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbNhanvien1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbbienche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Number CMT", "Unit", "Time Start", "Employee Type", "Overtime Hours"
            }
        ));
        tbbienche.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbbienche);
        tbbienche.getAccessibleContext().setAccessibleDescription("");

        addNVBC.setText("Add Employee");
        addNVBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNVBCActionPerformed(evt);
            }
        });

        editNVBC.setText("Edit Employee");
        editNVBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNVBCActionPerformed(evt);
            }
        });

        DeleteNVBC.setText("Delete Employee");
        DeleteNVBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteNVBCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(addNVBC)
                .addGap(98, 98, 98)
                .addComponent(editNVBC)
                .addGap(100, 100, 100)
                .addComponent(DeleteNVBC)
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNVBC)
                    .addComponent(DeleteNVBC)
                    .addComponent(editNVBC))
                .addGap(27, 27, 27))
        );

        Management.addTab("FullTimeEmployee", jPanel5);

        addNVTV.setText("Add Employee");
        addNVTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNVTVActionPerformed(evt);
            }
        });

        editNVTV.setText("Edit Employee");
        editNVTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNVTVActionPerformed(evt);
            }
        });

        deleteNVTV.setText("Delete Employee");
        deleteNVTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNVTVActionPerformed(evt);
            }
        });

        tbthoivu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Number CMT", "Unit", "Time Start", "Employee Type", "Number of contracts"
            }
        ));
        jScrollPane3.setViewportView(tbthoivu);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addNVTV)
                .addGap(101, 101, 101)
                .addComponent(editNVTV)
                .addGap(99, 99, 99)
                .addComponent(deleteNVTV)
                .addGap(117, 117, 117))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNVTV)
                    .addComponent(deleteNVTV)
                    .addComponent(editNVTV))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Management.addTab("PartTimeEmployee", jPanel1);

        PersonalStatistics.setText("Personal Statistics");
        PersonalStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalStatisticsActionPerformed(evt);
            }
        });

        GeneralStatistics.setText("General Statistics");
        GeneralStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralStatisticsActionPerformed(evt);
            }
        });

        tbthongke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Averge salary of employees in the company", "Time"
            }
        ));
        jScrollPane4.setViewportView(tbthongke);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(GeneralStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(PersonalStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonalStatistics)
                    .addComponent(GeneralStatistics))
                .addGap(35, 35, 35))
        );

        Management.addTab("Company management", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Management)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Management)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeneralStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralStatisticsActionPerformed
        // lấy thời hiện tại
        LocalDateTime current = LocalDateTime.now();
        String time = current.toString();
        // tính tổng số nhân viên trong công ty
        long a = listNVBC.size() + listNVTV.size();
        // tính tổng lương của toàn công ty
        long sumtv = 0;
        long sumbc = 0;

        for (NVTV tv : listNVTV) {
            sumtv += tv.getSoHopDong()*200000;
        }
        for (NVBC bc : listNVBC) {
            sumbc += (long) (bc.getSoGioLamThem()*200000 + 2000000);
        }
        //tính lương trung bình của công ty tại thời điểm hiện tại
        long sumtb = 0;
        sumtb = (sumbc + sumtv)/a;

        TK tk1 = new TK(sumtb, time);
        listTK.add(tk1);//thêm vào listTK
        controller.writeToFile(listTK, "TKL.TXT");//ghi listTK vào file TKL.TXT
        this.showData(listTK, modelTK);// hiện dữ liệu có trong file ra bảng TK
    }//GEN-LAST:event_GeneralStatisticsActionPerformed

    private void PersonalStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalStatisticsActionPerformed

        new addTKNV(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_PersonalStatisticsActionPerformed

    private void deleteNVTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNVTVActionPerformed
        int removeIndex = tbthoivu.getSelectedRow();
        // nếu chưa nhấn vào bất kì một nhân viên nào thì sẽ hiển thị thông báo
        if(removeIndex == -1){
            JOptionPane.showMessageDialog(rootPane, "Please select a line to Delete");
            // nếu trong danh sách chưa có bất kì nhân viên nào thì sẽ hiển thị thông báo
        }else if(listNVTV.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Don't information to Delete");
        }else{
            listNVTV.remove(removeIndex);
            controller.writeToFile(listNVTV, "NVTV.TXT");
            this.showNVTV();
        }
    }//GEN-LAST:event_deleteNVTVActionPerformed

    private void editNVTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNVTVActionPerformed
        // lấy index của dòng đã được click chuột
        selectedIndex = tbthoivu.getSelectedRow();
        if(listNVTV.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Can't edit because there's no employee");
        }else if(selectedIndex == -1){
            JOptionPane.showMessageDialog(rootPane, "Please click on employee to edit ");
        }else {//chọn dòng cần sửa và nhấn
            editNVTV edit = new editNVTV(this, rootPaneCheckingEnabled);
            edit.setEditData2(listNVTV.get(selectedIndex));
            edit.setVisible(true);
        }
    }//GEN-LAST:event_editNVTVActionPerformed

    private void addNVTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNVTVActionPerformed
        // TODO add your handling code here:
        new addNVTV(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_addNVTVActionPerformed

    private void DeleteNVBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteNVBCActionPerformed

        int removeIndex = tbbienche.getSelectedRow();
        if(removeIndex == -1){
            JOptionPane.showMessageDialog(rootPane, "Please select a line to Delete");
        }else if(listNVBC.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Don't information to Delete");
        }else{
            listNVBC.remove(removeIndex);
            controller.writeToFile(listNVBC, "NVBC.TXT");
            this.showNVBC();
        }
    }//GEN-LAST:event_DeleteNVBCActionPerformed

    private void editNVBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNVBCActionPerformed
        // TODO add your handling code here:
        selectedIndex = tbbienche.getSelectedRow();
        if(listNVBC.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Can't edit because there's no employee");
        }else if(selectedIndex == -1){
            JOptionPane.showMessageDialog(rootPane, "Please click on employee to edit ");
        }else {
            editNVBC edit = new editNVBC(this, rootPaneCheckingEnabled);
            edit.setEditData1(listNVBC.get(selectedIndex));
            edit.setVisible(true);
        }

    }//GEN-LAST:event_editNVBCActionPerformed

    private void addNVBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNVBCActionPerformed

        new addNVBC(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_addNVBCActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteNVBC;
    private javax.swing.JButton GeneralStatistics;
    private javax.swing.JTabbedPane Management;
    private javax.swing.JButton PersonalStatistics;
    private javax.swing.JButton addNVBC;
    private javax.swing.JButton addNVTV;
    private javax.swing.JButton deleteNVTV;
    private javax.swing.JButton editNVBC;
    private javax.swing.JButton editNVTV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbNhanvien1;
    private javax.swing.JTable tbbienche;
    private javax.swing.JTable tbthoivu;
    private javax.swing.JTable tbthongke;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void showData(List<T> list, DefaultTableModel Model) {
        Model.setRowCount(0);
       
         for (T t : list) {
            if(t instanceof NVBC){//nếu t đối tượng thuộc lớp NVbienche
                NVBC nvbc = (NVBC)t;
                Model.addRow(new Object[]{
                nvbc.getName(), nvbc.getSoCMT(), nvbc.getDonVi(), nvbc.getTGBatDau(), "Full Time Employee", nvbc.getSoGioLamThem()
            });
            }else if(t instanceof NVTV){// nếu t là đối tượng thuộc lớp NVthoivu
                NVTV nvtv = (NVTV)t;
                Model.addRow(new Object[]{
                nvtv.getName(), nvtv.getSoCMT(), nvtv.getDonVi(), nvtv.getTGBatDau(), "Part Time Employee", nvtv.getSoHopDong()
            });
            }else if(t instanceof TK){// nếu t là đối tượng thuộc lớp TK
                TK tk1 = (TK)t;
                Model.addRow(new Object[]{
                tk1.getSalaryTB() + "  VNĐ", tk1.getTime()
            });
            }
           
        }
    } 
    
    private void showNVBC(){
        listNVBC = controller.readDataFromFile("NVBC.TXT");// đọc dữ liệu từ file
        this.showData(listNVBC, modelNVBC);// hiển thị dữ liệu ra bảng NVBC
    }
    
    private void showNVTV(){
        listNVTV = controller.readDataFromFile("NVTV.TXT");
        this.showData(listNVTV, modelNVTV);
    }
    
    private void showTK(){
        listTK = controller.readDataFromFile("TKL.TXT");
        this.showData(listTK, modelTK);
    }
   
    void editNVBC(NVBC nv1){
        listNVBC.remove(selectedIndex);//xoa nhân viên trong listNVBC có index trong bảng là selectecIndex
        this.themNVBC(nv1);
    }
    
    void editNVTV(NVTV NV1){
        listNVTV.remove(selectedIndex);
        this.themNVTV(NV1);// ghi lại dữ liệu có trong bảng sau khi đã xoá vào file và hiển thị danh sách nhân viên còn lại ra bảng NVBC
    }

}
