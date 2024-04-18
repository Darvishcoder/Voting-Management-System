/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electionmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DARVISH KISHOR
 */
public class HeadOfElectionCommission extends javax.swing.JFrame {

    /**
     * Creates new form HeadOfElectionCommission
     */
    public HeadOfElectionCommission() {
        initComponents();
        DisplaysState();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        StatePassword = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StateTable = new javax.swing.JTable();
        StateName = new javax.swing.JComboBox<>();
        Name1 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Name.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 51, 102));
        Name.setText("State Username");

        StatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatePasswordActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 51, 102));
        Password.setText("Password");

        StateTable.setBackground(new java.awt.Color(0, 153, 153));
        StateTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        StateTable.setForeground(new java.awt.Color(255, 153, 0));
        StateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SId", "State", "UserName", "Password"
            }
        ));
        StateTable.setRowHeight(25);
        StateTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        StateTable.setShowHorizontalLines(true);
        StateTable.setShowVerticalLines(true);
        StateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StateTable);

        StateName.setForeground(new java.awt.Color(255, 51, 51));
        StateName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State", "Andhra Pradesh\t", "Arunachal Pradesh", "Assam\t", "Bihar\t", "Chhattisgarh\t", "Goa\t", "Gujarat\t", "Haryana\t", "Himachal Pradesh\t", "Jharkhand\t", "Karnataka\t", "Kerala\t", "Madhya Pradesh\t", "Maharashtra\t", "Manipur\t", "Meghalaya\t", "Mizoram\t", "Nagaland\t", "Odisha\t", "Punjab\t", "Rajasthan\t", "Sikkim\t", "Tamil Nadu\t", "Telangana\t", "Tripura\t", "Uttar Pradesh\t", "Uttarakhand\t", "West Bengal\t", " ", "Union Territory ", " ", "Andaman and Nicobar Island\t", "Chandigarh", "Dadra and Nagar Haveli and Daman and Diu", "Delhi", "Ladakh", "Lakshadweep", "Jammu and Kashmir", "Puducherry\t" }));
        StateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateNameActionPerformed(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 51, 102));
        Name1.setText("State");

        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 102, 0));
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 102, 0));
        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 102, 0));
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 102, 0));
        Edit.setText("Edit");
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("State List ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Username, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(StateName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(Back))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Add)
                                .addGap(15, 15, 15)
                                .addComponent(Edit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Delete)
                            .addComponent(Edit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Back)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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
private void DisplaysState(){
          try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              Rs=St.executeQuery("Select * from StateTbl");
              StateTable.setModel(DbUtils.resultSetToTableModel(Rs));  
          }catch (Exception e){
      }}
    int SId;
    Statement St1= null;
    ResultSet Rs1=null;
      private void StateCount(){
           try{
               St1 = Con.createStatement();
               Rs1= St1.executeQuery("Select MAX(SId) from StateTbl");
               
               Rs1.next();
              SId= Rs1.getInt(1)+1;
           }catch(Exception Ex)
           {    
           }  
      }
    private void StatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatePasswordActionPerformed

    }//GEN-LAST:event_StatePasswordActionPerformed

    private void StateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateNameActionPerformed
    
    Connection Con=null;
    PreparedStatement Pst= null;
    ResultSet Rs =null;
    Statement St= null;
    
    
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
               StateCount(); 
        if (Username.getText().isEmpty() || StateName.getSelectedIndex() == -1 )  
    {
        JOptionPane.showMessageDialog(this,"Missing Information");
    } else {
        try 
            {
            
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db", "root", "");
            PreparedStatement Add = Con.prepareStatement("Insert into StateTbl values (?,?,?,?)");
            Add.setInt(1, SId);
            Add.setString(2, StateName.getSelectedItem().toString());
            Add.setString(3, Username.getText());
            Add.setString(4,StatePassword.getText());
            int row = Add.executeUpdate();
            Con.close();
            DisplaysState();
            JOptionPane.showMessageDialog(this, "State Registered");
            }catch(Exception ex )
            {
                JOptionPane.showMessageDialog(this, ex);
            }
    }                         
    }//GEN-LAST:event_AddMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        if(Key == -1){
            JOptionPane.showMessageDialog(this,"Select  the StateName to be Deleted");
        }else{
            try{
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                String Query = "Delete from StateTbl where SId ="+Key;
                Statement Delete= Con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "State Deleted Succesfully");
                DisplaysState();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }     
    }//GEN-LAST:event_DeleteMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed
    int Key;
    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        if (Key == -1|| Username.getText().isEmpty() || StateName.getSelectedIndex() == -1 ){
            JOptionPane.showMessageDialog(this," Missing Information ");
        }else{
            try{
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                String Query = "Update StateTbl set StateName=?,AdminUserName=?,SPassword=? where SId=?";
                
                PreparedStatement UpdateQuery= Con.prepareStatement(Query);
                
                UpdateQuery.setString(1, StateName.getSelectedItem().toString());
                UpdateQuery.setString(2, Username.getText());
                UpdateQuery.setString(3, StatePassword.getText());
                UpdateQuery.setInt(4, Key);
                UpdateQuery.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election Updated Succesfully");
                DisplaysState();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        } 
    }//GEN-LAST:event_EditMouseClicked

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void StateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StateTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)StateTable.getModel();
        int MyIndex = StateTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        StateName.setSelectedItem(model.getValueAt(MyIndex,1).toString());
        Username.setText(model.getValueAt(MyIndex,2).toString());
        StatePassword.setText(model.getValueAt(MyIndex,3).toString());

        
    }//GEN-LAST:event_StateTableMouseClicked

   
   
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
            java.util.logging.Logger.getLogger(HeadOfElectionCommission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeadOfElectionCommission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeadOfElectionCommission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeadOfElectionCommission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeadOfElectionCommission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Password;
    private javax.swing.JComboBox<String> StateName;
    private javax.swing.JTextField StatePassword;
    private javax.swing.JTable StateTable;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
