
package electionmanagementsystem;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Election extends javax.swing.JFrame {

    Connection Con=null;
    PreparedStatement Pst= null;
    ResultSet Rs =null;
    Statement St= null;
    
   
    
    
            
   
    public Election() {
        initComponents();
        DisplayElections();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ElectionNameTb = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionTable = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        ElectionDate = new com.toedter.calendar.JDateChooser();
        ElectionList = new javax.swing.JComboBox<>();
        StateList = new javax.swing.JComboBox<>();
        Name1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VOTING MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Manage Election List");

        ElectionNameTb.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        ElectionNameTb.setForeground(new java.awt.Color(255, 51, 102));
        ElectionNameTb.setText("Name");

        Date.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 51, 102));
        Date.setText("Date");

        ElectionTable.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        ElectionTable.setForeground(new java.awt.Color(255, 102, 0));
        ElectionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ElectionTable.setRowHeight(24);
        ElectionTable.setShowHorizontalLines(true);
        ElectionTable.setShowVerticalLines(true);
        ElectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionTable);

        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 0, 255));
        Add.setText("ADD");
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

        Edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 51, 102));
        Edit.setText("EDIT");
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

        Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(51, 51, 255));
        Delete.setText("DELETE");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(102, 102, 255));
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        ElectionList.setForeground(new java.awt.Color(255, 51, 51));
        ElectionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National-level elections ", "State-level elections ", "District-level elections ", "Local government body elections " }));
        ElectionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionListActionPerformed(evt);
            }
        });

        StateList.setForeground(new java.awt.Color(255, 51, 51));
        StateList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State", "Andhra Pradesh\t", "Arunachal Pradesh", "Assam\t", "Bihar\t", "Chhattisgarh\t", "Goa\t", "Gujarat\t", "Haryana\t", "Himachal Pradesh\t", "Jharkhand\t", "Karnataka\t", "Kerala\t", "Madhya Pradesh\t", "Maharashtra\t", "Manipur\t", "Meghalaya\t", "Mizoram\t", "Nagaland\t", "Odisha\t", "Punjab\t", "Rajasthan\t", "Sikkim\t", "Tamil Nadu\t", "Telangana\t", "Tripura\t", "Uttar Pradesh\t", "Uttarakhand\t", "West Bengal\t", " ", "Union Territory ", " ", "Andaman and Nicobar Island\t", "Chandigarh", "Dadra and Nagar Haveli and Daman and Diu", "Delhi", "Ladakh", "Lakshadweep", "Jammu and Kashmir", "Puducherry\t" }));
        StateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateListActionPerformed(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 51, 102));
        Name1.setText("States");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ElectionNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StateList, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(Date))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ElectionNameTb)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Name1)))
                        .addGap(5, 5, 5)
                        .addComponent(StateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Edit)
                            .addComponent(Delete))
                        .addGap(18, 18, 18)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed
    int EId;
    Statement St1= null;
    ResultSet Rs1=null;
      private void ElecCount(){
           try{
               St1 = Con.createStatement();
               Rs1= St1.executeQuery("Select MAX(EId) from ElectionTbl");
               Rs1.next();
               EId= Rs1.getInt(1)+1;
           }catch(Exception Ex)
           {    
           }
     
}
      private void DisplayElections(){
          try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              Rs=St.executeQuery("Select * from ElectionTbl");
              ElectionTable.setModel(DbUtils.resultSetToTableModel(Rs));  
          }catch (Exception e){
      }}
    
    
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        if(ElectionList.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"Select the Election Name");
        }else{
            try{
                String Day=String.valueOf(ElectionDate.getDate().getDay());
                String Month=String.valueOf(ElectionDate.getDate().getMonth());
                String Year=String.valueOf(ElectionDate.getDate().getYear());
                String EDate= Day + "/" + Month + "/" + Year;
                ElecCount();
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                PreparedStatement Add=Con.prepareStatement("insert into ElectionTbl values(?,?,?,?)");
                Add.setInt(1, EId);
                Add.setString(2, ElectionList.getSelectedItem().toString());
                Add.setString(3,EDate);
                Add.setString(4, StateList.getSelectedItem().toString());
                int row=Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Election Added Succesfully");
                Con.close();
                DisplayElections(); 
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_AddMouseClicked

    int Key =-1;
    private void ElectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ElectionTable.getModel();
        int MyIndex = ElectionTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
       // name.setText(model.getValueAt(MyIndex,1).toString());
        ElectionList.setSelectedItem(model.getValueAt(MyIndex,1).toString());
        StateList.setSelectedItem(model.getValueAt(MyIndex,1).toString());
        
    }//GEN-LAST:event_ElectionTableMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        if(Key == -1){
            JOptionPane.showMessageDialog(this,"Select  the Election to be Deleted");
        }else{
            try{
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                String Query = "Delete from ElectionTbl where EId ="+Key;
                Statement Delete= Con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Election Deleted Succesfully");
                DisplayElections();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        } 
    }//GEN-LAST:event_DeleteMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        // TODO add your handling code here:
         if(Key == -1 || ElectionDate.getDate().toString().isEmpty()){
            JOptionPane.showMessageDialog(this," Missing Information ");
        }else{
            try{
                String Day=String.valueOf(ElectionDate.getDate().getDay());
                String Month=String.valueOf(ElectionDate.getDate().getMonth());
                String Year=String.valueOf(ElectionDate.getDate().getYear());
                String EDate= Day + "/" + Month + "/" + Year;
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                String Query = "Update ElectionTbl set EName=?,EDate=? , StateName=? where EId=?";
                
                PreparedStatement UpdateQuery= Con.prepareStatement(Query);
                //UpdateQuery.setString(1, name.getText());
                UpdateQuery.setString(1, ElectionList.getSelectedItem().toString());
                UpdateQuery.setString(2, EDate);
                UpdateQuery.setString(3, StateList.getSelectedItem().toString());
                UpdateQuery.setInt(4, Key);
                UpdateQuery.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election Updated Succesfully");
                DisplayElections();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        } 
    }//GEN-LAST:event_EditMouseClicked

    private void ElectionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionListActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void StateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateListActionPerformed

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
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Election.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Election().setVisible(true);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Date;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private com.toedter.calendar.JDateChooser ElectionDate;
    private javax.swing.JComboBox<String> ElectionList;
    private javax.swing.JLabel ElectionNameTb;
    private javax.swing.JTable ElectionTable;
    private javax.swing.JLabel Name1;
    private javax.swing.JComboBox<String> StateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
