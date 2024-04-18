
package electionmanagementsystem;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voters extends javax.swing.JFrame {


    public Voters() {
        initComponents();
        GetElections();
        DisplaysVoters();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        VName = new javax.swing.JTextField();
        Age = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VotersTbl = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        VAge = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        VGender = new javax.swing.JComboBox<>();
        ElectionList = new javax.swing.JComboBox<>();
        Election = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        VPassword = new javax.swing.JTextField();
        StateList = new javax.swing.JComboBox<>();
        Name1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONLINE VOTING SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Manage Voters");

        Name.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 51, 102));
        Name.setText("Name");

        VName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNameActionPerformed(evt);
            }
        });

        Age.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 51, 102));
        Age.setText("Age");

        VotersTbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        VotersTbl.setForeground(new java.awt.Color(255, 102, 0));
        VotersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        VotersTbl.setSelectionForeground(new java.awt.Color(255, 102, 0));
        VotersTbl.setShowGrid(false);
        VotersTbl.setShowHorizontalLines(true);
        VotersTbl.setShowVerticalLines(true);
        VotersTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VotersTbl);

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

        VAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAgeActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 51, 102));
        Gender.setText("Gender");

        VGender.setForeground(new java.awt.Color(255, 51, 51));
        VGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Trans...." }));
        VGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VGenderActionPerformed(evt);
            }
        });

        ElectionList.setForeground(new java.awt.Color(255, 51, 51));
        ElectionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National-level elections ", "State-level elections ", "District-level elections ", "Local government body elections " }));
        ElectionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionListActionPerformed(evt);
            }
        });

        Election.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Election.setForeground(new java.awt.Color(255, 51, 102));
        Election.setText("Election");

        Password.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 51, 102));
        Password.setText("Password");

        VPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPasswordActionPerformed(evt);
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
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VAge, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Election, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StateList, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(513, 513, 513))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(Age)
                            .addComponent(Gender))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Name1)
                        .addGap(1, 1, 1)
                        .addComponent(StateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Election)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit)
                            .addComponent(Delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Back)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNameActionPerformed
     
    }//GEN-LAST:event_VNameActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    
    }//GEN-LAST:event_BackActionPerformed

    private void VAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAgeActionPerformed
      
    }//GEN-LAST:event_VAgeActionPerformed

    private void VGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VGenderActionPerformed
        
    }//GEN-LAST:event_VGenderActionPerformed

    private void ElectionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionListActionPerformed
        
    }//GEN-LAST:event_ElectionListActionPerformed

    private void VPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPasswordActionPerformed
       
    }//GEN-LAST:event_VPasswordActionPerformed
     int key=-1;
     private void GetElections(){
        try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              String Query="Select * From CandidateTbl";
              Rs= St.executeQuery(Query);
              DefaultTableModel model = (DefaultTableModel) ElectionList.getModel();
              while(Rs.next()){
            String ElectId = Rs.getString("VId");
            model.addRow(new Object[]{ElectId});
                }  
          }catch (Exception e){
      }
    }
    Connection Con=null;
    PreparedStatement Pst= null;
    ResultSet Rs =null;
    Statement St= null;
    private void DisplaysVoters(){
          try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              Rs=St.executeQuery("Select * from VotersTbl");
              VotersTbl.setModel(DbUtils.resultSetToTableModel(Rs));  
          }catch (Exception e){
      }}
    int VId;
    Statement St1= null;
    ResultSet Rs1=null;
      private void VotersCount(){
           try{
               St1 = Con.createStatement();
               Rs1= St1.executeQuery("Select MAX(VId) from VotersTbl");
               
               Rs1.next();
              VId= Rs1.getInt(1)+1;
           }catch(Exception Ex)
           {    
           }  
}
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
         if (VAge.getText().isEmpty() || VName.getText().isEmpty() || ElectionList.getSelectedIndex() == -1 || VGender.getSelectedIndex() == -1 || StateList.getSelectedIndex() == -1)  
    {
        JOptionPane.showMessageDialog(this,"Missing Information");
    } else {
        try 
            {
                VotersCount();
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db", "root", "");
            PreparedStatement Add = Con.prepareStatement("Insert into VotersTbl values (?,?,?,?,?,?,?)");
            Add.setInt(1, VId);
            Add.setString(2, VName.getText());
            Add.setString(3, VGender.getSelectedItem().toString());
            Add.setString(4,VPassword.getText());
            Add.setInt(5, Integer.parseInt(VAge.getText()));
            Add.setString(6,ElectionList.getSelectedItem().toString());
            Add.setString(7,ElectionList.getSelectedItem().toString());
            
            int row = Add.executeUpdate();
            Con.close();
            DisplaysVoters();
            JOptionPane.showMessageDialog(this, "Voters Registered");
            }catch(Exception ex )
            {
                JOptionPane.showMessageDialog(this, ex);
            }
    }//GEN-LAST:event_AddMouseClicked
    }
    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        if(Key == -1|| VAge.getText().isEmpty() || VName.getText().isEmpty() || ElectionList.getSelectedIndex() == -1 || VGender.getSelectedIndex() == -1 || StateList.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this," Missing Information ");
        }else{
            try{
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                String Query = "Update VotersTbl set VName=?,VGender=?,Vpassword=?,VAge=?,ElectionList=?,StateName=? where VId=?";
                
                PreparedStatement UpdateQuery= Con.prepareStatement(Query);
                UpdateQuery.setString(1, VName.getText());
                UpdateQuery.setString(2, VGender.getSelectedItem().toString());
                UpdateQuery.setString(3, VPassword.getText());
                UpdateQuery.setInt(4, Integer.valueOf(VAge.getText().toString()));
                UpdateQuery.setString(5, ElectionList.getSelectedItem().toString());
                UpdateQuery.setString(5, StateList.getSelectedItem().toString());
                UpdateQuery.setInt(6, Key);
                UpdateQuery.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election Updated Succesfully");
                DisplaysVoters();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        } 
    }//GEN-LAST:event_EditMouseClicked
    
    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
    if(Key == -1){
            JOptionPane.showMessageDialog(this,"Select  the Candidate to be Deleted");
        }else{
            try{
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                String Query = "Delete from VotersTbl where VId ="+Key;
                Statement Delete= Con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Voters Deleted Succesfully");
                DisplaysVoters();
            }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }     
    }//GEN-LAST:event_DeleteMouseClicked
        int Key = -1;
    private void VotersTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)VotersTbl.getModel();
        int MyIndex = VotersTbl.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        VName.setText(model.getValueAt(MyIndex,1).toString());
        VGender.setSelectedItem(model.getValueAt(MyIndex,2).toString());
        VPassword.setText(model.getValueAt(MyIndex,3).toString());
        VAge.setText(model.getValueAt(MyIndex,4).toString());
        ElectionList.setSelectedItem(model.getValueAt(MyIndex,5).toString());
        StateList.setSelectedItem(model.getValueAt(MyIndex,5).toString());
        
        
    }//GEN-LAST:event_VotersTblMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void StateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateListActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Age;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Election;
    private javax.swing.JComboBox<String> ElectionList;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Password;
    private javax.swing.JComboBox<String> StateList;
    private javax.swing.JTextField VAge;
    private javax.swing.JComboBox<String> VGender;
    private javax.swing.JTextField VName;
    private javax.swing.JTextField VPassword;
    private javax.swing.JTable VotersTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
