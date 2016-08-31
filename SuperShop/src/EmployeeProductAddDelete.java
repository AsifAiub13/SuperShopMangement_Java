import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishat
 */
public class EmployeeProductAddDelete extends javax.swing.JFrame {

    /**
     * Creates new form EmpProductAddDelete
     */
    public EmployeeProductAddDelete() {
        initComponents();
        getProductTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProductID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProductID = new javax.swing.JTextField();
        jTextFieldProductCategory = new javax.swing.JTextField();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldProductAvailability = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductListEdit = new javax.swing.JTable();
        jLabelProductNo = new javax.swing.JLabel();
        jTextFieldProductNo = new javax.swing.JTextField();
        jLabelProductPrice = new javax.swing.JLabel();
        jTextFieldProductPrice = new javax.swing.JTextField();
        jLabelMessage = new javax.swing.JLabel();
        jButtonProductNumber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelProductID.setText("Product ID");

        jLabel2.setText("Category");

        jLabel3.setText("Name");

        jLabel4.setText("Availability");

        jTextFieldProductCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductCategoryActionPerformed(evt);
            }
        });

        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("                    ADD or DELETE Product");

        jTableProductListEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Product ID", "Catagory", "Product Name", "Availibility", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductListEdit);

        jLabelProductNo.setText("No");

        jLabelProductPrice.setText("Price");

        jButtonProductNumber.setText("Maintain Product Number");
        jButtonProductNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonProductNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldProductAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelProductPrice))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(jTextFieldProductPrice)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelProductNo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(jTextFieldProductNo))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProductNo)
                    .addComponent(jTextFieldProductNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldProductCategory)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabelMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonProductNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getProductTableData(){
        Connection conn=null;
        Statement st=null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ssdb","root","");
            st = conn.createStatement();
            String sql="SELECT * FROM PRODUCT_LIST";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Product ID", "Category", "Product Name", "Availability", "Price"}, 0);
            while(rs.next())
            {
                String col1 = rs.getString("P_NO");
                String col2 = rs.getString("P_ID");
                String col3 = rs.getString("P_CATEGORY");                
                String col4 = rs.getString("P_NAME");             
                String col5 = rs.getString("P_AVAILABILITY");             
                String col6 = rs.getString("P_PRICE");                
                model.addRow(new Object[]{col1, col2, col3, col4, col5, col6});
            }
            jTableProductListEdit.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void theQuery(String query){
        Connection conn=null;
        Statement st=null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ssdb","root","");
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
            refreshMethod();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void refreshMethod(){
        jTextFieldProductID.setText("");
        jTextFieldProductAvailability.setText("");
        jTextFieldProductCategory.setText("");
        jTextFieldProductName.setText("");
        jTextFieldProductPrice.setText("");
        jTextFieldProductNo.setText("");
    }
    
    private void jTextFieldProductCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductCategoryActionPerformed

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try{
            jLabelMessage.setText("");
            if(!jTextFieldProductNo.getText().equals("") && !jTextFieldProductID.getText().equals("") && !jTextFieldProductCategory.getText().equals("") && !jTextFieldProductName.getText().equals("") && !jTextFieldProductAvailability.getText().equals("") && !jTextFieldProductPrice.getText().equals("")){
                DefaultTableModel model = (DefaultTableModel) jTableProductListEdit.getModel();
                model.addRow(new Object[] {jTextFieldProductNo.getText(), jTextFieldProductID.getText(), jTextFieldProductCategory.getText(), jTextFieldProductName.getText(), jTextFieldProductAvailability.getText(), jTextFieldProductPrice.getText()});
                theQuery("insert into PRODUCT_LIST(P_NO, P_ID, P_CATEGORY, P_NAME, P_AVAILABILITY, P_PRICE) values('"+jTextFieldProductNo.getText()+"', '"+jTextFieldProductID.getText()+"', '"+jTextFieldProductCategory.getText()+"', '"+jTextFieldProductName.getText()+"', '"+jTextFieldProductAvailability.getText()+"', '"+jTextFieldProductPrice.getText()+"')");
            }
            else{
                jLabelMessage.setText("You must need to fill All the things");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if(jTableProductListEdit.getSelectedRow()==-1){
            if(jTableProductListEdit.getSelectedRow()==0){
                jLabelMessage.setText("Table is empty!!");
            }
            else{
                 jLabelMessage.setText("You need to select a product.");
            }
        }

        else{
            int selectedRowIndex = jTableProductListEdit.getSelectedRow();
            theQuery("delete from PRODUCT_LIST where P_NO='"+jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 0)+"'");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        refreshMethod();
        getProductTableData();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonProductNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductNumberActionPerformed
    if(jTableProductListEdit.getSelectedRow()==-1){
        if(jTableProductListEdit.getSelectedRow()==0){
            jLabelMessage.setText("Table is empty!!");
        }
        else{
             jLabelMessage.setText("You need to select an item");
        }
    }   
    
    else{
        jTextFieldProductID.setEditable(false);
        jTextFieldProductNo.setEditable(false);
        jTextFieldProductName.setEditable(false);
        jTextFieldProductCategory.setEditable(false);
        jTextFieldProductPrice.setEditable(false);
        int selectedRowIndex = jTableProductListEdit.getSelectedRow();        
        if(jTextFieldProductAvailability.getText().equals("")){
            jTextFieldProductNo.setText(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 0).toString());
            jTextFieldProductID.setText(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 1).toString());
            jTextFieldProductCategory.setText(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 2).toString());
            jTextFieldProductName.setText(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 3).toString());
            jTextFieldProductAvailability.setText(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 4).toString());
            jTextFieldProductPrice.setText(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 5).toString());
        }
        
        else if(!jTextFieldProductAvailability.getText().equals(jTableProductListEdit.getModel().getValueAt(selectedRowIndex, 5).toString())){            
            theQuery("update product_list set P_Availability='"+jTextFieldProductAvailability.getText() +"' where P_ID="+jTextFieldProductID.getText());
            refreshMethod();
        }
        else{
            jLabelMessage.setText("You dont't update the value!!");
        }
    }
    }//GEN-LAST:event_jButtonProductNumberActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        new EmployeeHomePage().setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeProductAddDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeProductAddDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeProductAddDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeProductAddDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeProductAddDelete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonProductNumber;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelProductID;
    private javax.swing.JLabel jLabelProductNo;
    private javax.swing.JLabel jLabelProductPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductListEdit;
    private javax.swing.JTextField jTextFieldProductAvailability;
    private javax.swing.JTextField jTextFieldProductCategory;
    private javax.swing.JTextField jTextFieldProductID;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldProductNo;
    private javax.swing.JTextField jTextFieldProductPrice;
    // End of variables declaration//GEN-END:variables
}
