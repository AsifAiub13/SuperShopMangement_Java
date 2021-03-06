import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Porag
 */
public class CustomerDetailsPage extends javax.swing.JFrame {

  
    public CustomerDetailsPage() {
        initComponents();
        getCustomerTableData();
        //setConfirmButtonVisibility(false);
    }

    private void getCustomerTableData(){
        java.sql.Connection conn=null;
        java.sql.Statement st=null;
        
        try{
            conn = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/ssdb","root","");
            st = conn.createStatement();
            String sql="SELECT * FROM CUSTOMER_REGISTRATION";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"CName", "CAddress", "COccupation", "CustomerId" ,"CUserName","CPassword"}, 0);
            while(rs.next())
            {
                String col1 = rs.getString("CName");
                String col2 = rs.getString("CAddress");
                String col3 = rs.getString("COccupation");                
                String col4 = rs.getString("CustomerId");
                String col5 = rs.getString("CUserName");
                String col6 = rs.getString("CPassword");
                
                
                model.addRow(new Object[]{col1, col2, col3, col4,col5, col6});
            }
            jTableCinfo.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void theQuery(String query){
        java.sql.Connection conn=null;
        java.sql.Statement st=null;
        try{
            conn = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/ssdb","root","");
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void refreshMethod(){
        jTextFieldUser.setEditable(true);
        jTextFieldID.setEditable(true); 
       jTextFieldName.setEditable(true);
        
        jTextFieldAddress.setText("");
        jTextFieldtOccupation.setText("");
        jTextFieldPass.setText("");
        
     
        getCustomerTableData();
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelCustomerDetails = new javax.swing.JLabel();
        jLabelCustomerName = new javax.swing.JLabel();
        jLabelCustomerAddress = new javax.swing.JLabel();
        jLabelCustomerOccupation = new javax.swing.JLabel();
        jLabelCustomerID = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldtOccupation = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jButtonEditInformation = new javax.swing.JButton();
        jButtonBackToCustomerPage = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCinfo = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCustomerDetails.setText("Customer Details");

        jLabelCustomerName.setText("Name");

        jLabelCustomerAddress.setText("Address");

        jLabelCustomerOccupation.setText("Occupation");

        jLabelCustomerID.setText("Customer ID");

        jTextFieldName.setText(" ");

        jTextFieldAddress.setText("  ");

        jTextFieldtOccupation.setText("  ");
        jTextFieldtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtOccupationActionPerformed(evt);
            }
        });

        jTextFieldID.setText("  ");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonEditInformation.setText("Edit Information");
        jButtonEditInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditInformationActionPerformed(evt);
            }
        });

        jButtonBackToCustomerPage.setText("Back");
        jButtonBackToCustomerPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackToCustomerPageActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        jTextFieldUser.setText(" ");

        jTextFieldPass.setText(" ");
        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });

        jTableCinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCinfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCustomerID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCustomerOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jTextFieldtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPass)
                                    .addComponent(jTextFieldUser)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCustomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabelCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(jTextFieldName)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBackToCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCustomerOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jButtonEditInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBackToCustomerPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(185, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackToCustomerPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackToCustomerPageActionPerformed
        this.setVisible(false);
        new CustomerHomePage().setVisible(true);
    }//GEN-LAST:event_jButtonBackToCustomerPageActionPerformed

    private void jButtonEditInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditInformationActionPerformed
       if(jTableCinfo.getSelectedRow()==-1){
            if(jTableCinfo.getSelectedRow()==0){
                JOptionPane.showMessageDialog(null, "Table is empty!!");
            }
         /*   else{
                JOptionPane.showMessageDialog(null, "You need to select an user");
            }*/
        }   
    
    else{
        jTextFieldName.setEditable(false);
        jTextFieldID.setEditable(false);
        jTextFieldUser.setEditable(false); 
        
        
        int selectedRowIndex = jTableCinfo.getSelectedRow();        
        if(jTextFieldAddress.getText().equals("") && jTextFieldtOccupation.getText().equals("") && jTextFieldPass.getText().equals("")){
           jTextFieldAddress.setText(jTableCinfo.getModel().getValueAt(selectedRowIndex, 1).toString());
            jTextFieldtOccupation.setText(jTableCinfo.getModel().getValueAt(selectedRowIndex, 2).toString());
            jTextFieldPass.setText(jTableCinfo.getModel().getValueAt(selectedRowIndex, 5).toString());
        }
            
        else if(!(jTextFieldAddress.getText().equals(jTableCinfo.getModel().getValueAt(selectedRowIndex, 1).toString())||
                !jTextFieldtOccupation.getText().equals(jTableCinfo.getModel().getValueAt(selectedRowIndex, 2).toString())||
                !jTextFieldPass.getText().equals(jTableCinfo.getModel().getValueAt(selectedRowIndex, 5).toString()))){            
                 theQuery("update customer_registration set Caddress='"+jTextFieldAddress.getText()+"'COccupation='"+jTextFieldtOccupation.getText()+"'CPassword='"+jTextFieldPass.getText());
        
        }
    /*    else{
            JOptionPane.showMessageDialog(null,"You dont't update the value!!");
        }*/
    }    
                      
    }//GEN-LAST:event_jButtonEditInformationActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        
        refreshMethod();
        getCustomerTableData();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    private void jTextFieldtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtOccupationActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBackToCustomerPage;
    private javax.swing.JButton jButtonEditInformation;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCustomerAddress;
    private javax.swing.JLabel jLabelCustomerDetails;
    private javax.swing.JLabel jLabelCustomerID;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelCustomerOccupation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCinfo;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JTextField jTextFieldtOccupation;
    // End of variables declaration//GEN-END:variables
}
