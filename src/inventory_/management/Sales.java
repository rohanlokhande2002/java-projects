/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory_.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Sales extends javax.swing.JFrame {

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        edtBillNo = new javax.swing.JTextField();
        edtCusName = new javax.swing.JTextField();
        edtDate = new javax.swing.JTextField();
        edtSearch = new rojerusan.RSMaterialButtonRectangle();
        btnBack = new rojerusan.RSMaterialButtonRectangle();
        edtShowDetails = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusDetails = new rojeru_san.complementos.RSTableMetro();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CusPD = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edtBillNo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        edtBillNo.setText("BILL NO");
        edtBillNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(0, 153, 153)));
        edtBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBillNoActionPerformed(evt);
            }
        });
        jPanel2.add(edtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, 50));

        edtCusName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        edtCusName.setText("Customer Name");
        edtCusName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(0, 153, 153)));
        jPanel2.add(edtCusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 270, 50));

        edtDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        edtDate.setText("Date");
        edtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(0, 153, 153)));
        jPanel2.add(edtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 270, 50));

        edtSearch.setBackground(new java.awt.Color(0, 102, 255));
        edtSearch.setText("Search");
        edtSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        edtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSearchActionPerformed(evt);
            }
        });
        jPanel2.add(edtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 255));
        btnBack.setText("BACK");
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 350, -1));

        edtShowDetails.setBackground(new java.awt.Color(0, 102, 255));
        edtShowDetails.setText("show Details");
        edtShowDetails.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        edtShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtShowDetailsActionPerformed(evt);
            }
        });
        jPanel2.add(edtShowDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 170, 70));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("TRACK ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 210, 60));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 53)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("SALES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 730));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cutomer's Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        CusDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Customer Name", "Total Amount", "Date"
            }
        ));
        CusDetails.setColorBackgoundHead(new java.awt.Color(0, 51, 255));
        CusDetails.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        CusDetails.setColorBordeHead(new java.awt.Color(255, 255, 255));
        CusDetails.setColorFilasBackgound2(new java.awt.Color(0, 204, 204));
        CusDetails.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        CusDetails.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        CusDetails.setGridColor(new java.awt.Color(255, 255, 255));
        CusDetails.setRowHeight(30);
        CusDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CusDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CusDetails);

        jPanel4.add(jScrollPane1);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 760, 260));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Purchase Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 22), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        CusPD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod ID", "Prod Name", "Prod Price", "Quantity", "Total Amt"
            }
        ));
        CusPD.setColorBackgoundHead(new java.awt.Color(0, 51, 255));
        CusPD.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        CusPD.setColorBordeHead(new java.awt.Color(255, 255, 255));
        CusPD.setRowHeight(30);
        jScrollPane2.setViewportView(CusPD);

        jPanel5.add(jScrollPane2);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 760, 280));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 980, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBillNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtBillNoActionPerformed

    private void edtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSearchActionPerformed
        // TODO add your handling code here:
        
        CusPD();
        
    }//GEN-LAST:event_edtSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Dashboard Back = new Dashboard();
        Back.show();
        dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void edtShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtShowDetailsActionPerformed
        // TODO add your handling code here:
        
         
        DefaultTableModel model = (DefaultTableModel) CusDetails.getModel();
        
        model.setRowCount(0);
        
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Rohan@2002");

            Statement stmt = con.createStatement();
            String query = "select CustomerID,CustomerName,TotalAmount,Date from customerpurchase";
            try (ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String bill_no = rs.getString("CustomerID");
                    String customer_name = rs.getString("CustomerName");
                    String total_amt = rs.getString("TotalAmount");
                    String date = rs.getString("Date");
                    
                    model.addRow(new Object[] {bill_no,customer_name,total_amt,date});
                }
                 }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
        
    }//GEN-LAST:event_edtShowDetailsActionPerformed

    private void CusDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CusDetailsMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tblmodel = (DefaultTableModel)CusDetails.getModel();
        
        String tblbill_no = tblmodel.getValueAt(CusDetails.getSelectedRow(),0).toString();
        String tblcustomer_Name = tblmodel.getValueAt(CusDetails.getSelectedRow(),1).toString();
        String tbldate = tblmodel.getValueAt(CusDetails.getSelectedRow(),3).toString();
        
        
        edtBillNo.setText(tblbill_no);
        edtCusName.setText(tblcustomer_Name);
        edtDate.setText(tbldate);
        
    }//GEN-LAST:event_CusDetailsMouseClicked

    
    
    public void CusPD(){
        
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Rohan@2002");

            int identity = 1;
            int i = Integer.parseInt(edtBillNo.getText());
            Statement st = con.createStatement();    
            String query4 = "SELECT SUM(TypeObjCnt) from customerpurchase where ('"+identity+"'<= CustomerID) and (CustomerID< '"+i+"')";
            ResultSet rs3 = st.executeQuery(query4);
            rs3.next();
            int cartRowcnt = rs3.getInt(1);
            System.out.println(cartRowcnt);
            String j = Integer.toString(cartRowcnt);
             System.out.println(j);
            
            String query5 = "SELECT SUM(TypeObjCnt) from customerpurchase where ('"+identity+"'<= CustomerID) and (CustomerID<='"+i+"')";
            ResultSet rs4 = st.executeQuery(query5);
            rs4.next();
            int cartRowcnt1 = rs4.getInt(1);
            
            System.out.println(cartRowcnt1);
            String k = Integer.toString(cartRowcnt1);
             System.out.println(k);
            
            
           
            
            
            try {
                
            DefaultTableModel model = (DefaultTableModel) CusPD.getModel();
            model.setRowCount(0);
            
            Class.forName("java.sql.DriverManager");
            Connection con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Rohan@2002");

            Statement stmt = con1.createStatement();
//            var query = "select from prodpurchase where  ('"+cartRowcnt+"' < Index)  and ('"+cartRowcnt1+"' <= Index ) ";
            String query = "select* from prodpurchase WHERE Index BETWEEN ('"+cartRowcnt+"') AND ('"+cartRowcnt1+") ";
//              String query = "select* from prodpurchase WHERE Index BETWEEN '"+j+"' AND '"+k+"' ";
            try (ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String id = rs.getString("ProdID");
                    String name = rs.getString("ProdName");
                    String price = rs.getString("ProdPrice");
                    String qun = rs.getString("Quantity");
                    String total = rs.getString("Amount");
                   
                    
                    model.addRow(new Object[] {id,name,qun,price,total});
                }
                
                }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
            
            
            
            
            
            } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //e.printStackTrace();
        }
        
    
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro CusDetails;
    private rojeru_san.complementos.RSTableMetro CusPD;
    private rojerusan.RSMaterialButtonRectangle btnBack;
    private javax.swing.JTextField edtBillNo;
    private javax.swing.JTextField edtCusName;
    private javax.swing.JTextField edtDate;
    private rojerusan.RSMaterialButtonRectangle edtSearch;
    private rojerusan.RSMaterialButtonRectangle edtShowDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
