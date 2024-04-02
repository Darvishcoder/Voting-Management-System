/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electionmanagementsystem;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DARVISH KISHOR
 */
public class CandidatePage extends javax.swing.JFrame {
    Connection Con=null;
    PreparedStatement Pst= null;
    ResultSet Rs =null;
    Statement St= null;

    /**
     * Creates new form CandidatePage
     */
    public CandidatePage() {
        initComponents();
        GetElections();
        DisplaysCandidates();
    }
    
    private void GetElections(){
        try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              String Query="Select * From CandidateTbl";
              Rs= St.executeQuery(Query);
              //Rs=St.executeQuery("Select * from ElectionTbl");
               DefaultTableModel model = (DefaultTableModel) CandidateTbl.getModel();
              while(Rs.next()){
            String ElectId = Rs.getString("EId");
            model.addRow(new Object[]{ElectId});
//              String ElectId= Rs.getString("EId");
//              CandidateTbl.addItem(ElectId);
                }  
          }catch (Exception e){
      }
    }
    private void DisplaysCandidates(){
          try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              Rs=St.executeQuery("Select * from CandidateTbl");
              CandidateTbl.setModel(DbUtils.resultSetToTableModel(Rs));  
          }catch (Exception e){
      }}
    int CId;
    Statement St1= null;
    ResultSet Rs1=null;
      private void CandidateCount(){
           try{
               St1 = Con.createStatement();
               Rs1= St1.executeQuery("Select MAX(CId) from CandidateTbl");
               
               Rs1.next();
              CId= Rs1.getInt(1)+1;
           }catch(Exception Ex)
           {    
           }
     
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTbl = new javax.swing.JTable();
        Edit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Browse = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        ElectionList = new javax.swing.JComboBox<>();
        CImage = new javax.swing.JLabel();
        PhotoLbl = new javax.swing.JLabel();
        CName = new javax.swing.JTextField();
        CAge = new javax.swing.JTextField();
        CGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ONLINE VOTING SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(272, 272, 272))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Manage Candidate");

        CandidateTbl.setBackground(new java.awt.Color(204, 204, 204));
        CandidateTbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CandidateTbl.setForeground(new java.awt.Color(255, 102, 0));
        CandidateTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CId", "CName", "CGender", "Photo", "Age", "CElelct"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CandidateTbl.setOpaque(false);
        CandidateTbl.setRowHeight(25);
        CandidateTbl.setRowSelectionAllowed(false);
        CandidateTbl.setSelectionBackground(new java.awt.Color(204, 255, 204));
        CandidateTbl.setShowHorizontalLines(true);
        CandidateTbl.setShowVerticalLines(true);
        CandidateTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTbl);

        Edit.setBackground(new java.awt.Color(255, 51, 0));
        Edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 51, 0));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");

        Delete.setBackground(new java.awt.Color(255, 0, 0));
        Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");

        Browse.setBackground(new java.awt.Color(51, 255, 0));
        Browse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Browse.setForeground(new java.awt.Color(51, 51, 0));
        Browse.setText("Browse");
        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });

        Add.setBackground(new java.awt.Color(255, 51, 51));
        Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Name.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 51, 102));
        Name.setText("Name");

        Gender.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 51, 102));
        Gender.setText("Gender");

        Age.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 51, 102));
        Age.setText("Age");

        Name3.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        Name3.setForeground(new java.awt.Color(255, 51, 102));
        Name3.setText("Election");

        ElectionList.setForeground(new java.awt.Color(255, 51, 51));
        ElectionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National-level elections ", "State-level elections ", "District-level elections ", "Local government body elections " }));
        ElectionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionListActionPerformed(evt);
            }
        });

        CImage.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        CImage.setForeground(new java.awt.Color(255, 51, 102));
        CImage.setText("Photo");
        CImage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CImage.setOpaque(true);

        PhotoLbl.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        PhotoLbl.setForeground(new java.awt.Color(255, 51, 102));
        PhotoLbl.setText("Photo");

        CName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameActionPerformed(evt);
            }
        });

        CAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAgeActionPerformed(evt);
            }
        });

        CGender.setForeground(new java.awt.Color(255, 51, 51));
        CGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Trans...." }));
        CGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CAge, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhotoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(Gender)
                            .addComponent(Age))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name3)
                            .addComponent(PhotoLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ElectionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CImage, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(86, Short.MAX_VALUE))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
    
       // TODO add your handling code here:
       
    }//GEN-LAST:event_EditActionPerformed

    private void ElectionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionListActionPerformed

    private void CNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameActionPerformed

    private void CAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAgeActionPerformed

    private void CGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CGenderActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        if (CAge.getText().isEmpty() || CName.getText().isEmpty() || ElectionList.getSelectedIndex() == -1 || CGender.getSelectedIndex() == -1)  
    {
        JOptionPane.showMessageDialog(this,"Missing Information");
    } else {
        try 
            {
                CandidateCount();
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db", "root", "");
            PreparedStatement Add = Con.prepareStatement("Insert into CandidateTbl values (?,?,?,?,?,?)");
            InputStream img = new FileInputStream(imgpath);
            Add.setInt(1, CId);
            Add.setString(2, CName.getText());
            Add.setString(3, CGender.getSelectedItem().toString());
            Add.setBlob(4, img);
            Add.setInt(5, Integer.parseInt(CAge.getText()));
            Add.setString(6,ElectionList.getSelectedItem().toString());
            
            int row = Add.executeUpdate();
            Con.close();
            DisplaysCandidates();
            JOptionPane.showMessageDialog(this, "Candidate Registered");
            }catch(Exception ex )
            {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_AddMouseClicked
    private ImageIcon ResizePhoto(String ImagePath,byte[] pic){
           ImageIcon MyImage = null;
            if(ImagePath != null){
            MyImage = new ImageIcon(ImagePath);
                }else{
                        MyImage = new ImageIcon(pic);
                    }
                    Image img = MyImage.getImage();
                    Image newImg = img.getScaledInstance(CImage.getWidth(),CImage.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(newImg);
                    return image;              
    }
    String imgpath= null;
    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseMouseClicked
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION ){
        File SelectedImageFile = chooser.getSelectedFile();
        String selectedImagePath=SelectedImageFile.getAbsolutePath();
        CImage.setIcon(ResizePhoto(selectedImagePath,null));
        imgpath = selectedImagePath;
}
    }//GEN-LAST:event_BrowseMouseClicked
    int Key = -1;
    private void FetchPhoto(){
        String Query = "SELECT CPhoto FROM CandidateTbl WHERE CId = ?";
        ResultSet Rs;
        try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db", "root", ""); // Adjust your database name accordingly
        PreparedStatement St = Con.prepareStatement(Query);
        St.setInt(1, Key); 
        Rs = St.executeQuery();
        if (Rs.next()) {
            byte[] photoBytes = Rs.getBytes("CPhoto");
            ImageIcon imageIcon = new ImageIcon(photoBytes);
            CImage.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(CImage.getWidth(), CImage.getHeight(), Image.SCALE_SMOOTH)));
            }
    }catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching photo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
        
    }
    
    private void CandidateTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)CandidateTbl.getModel();
        int MyIndex = CandidateTbl.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        CName.setText(model.getValueAt(MyIndex,1).toString());
        CAge.setText(model.getValueAt(MyIndex,2).toString());
        CGender.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        FetchPhoto();
        ElectionList.setSelectedItem(model.getValueAt(MyIndex,5).toString());
        
    }//GEN-LAST:event_CandidateTblMouseClicked

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
            java.util.logging.Logger.getLogger(CandidatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CandidatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CandidatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandidatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CandidatePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Age;
    private javax.swing.JButton Back;
    private javax.swing.JButton Browse;
    private javax.swing.JTextField CAge;
    private javax.swing.JComboBox<String> CGender;
    private javax.swing.JLabel CImage;
    private javax.swing.JTextField CName;
    private javax.swing.JTable CandidateTbl;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JComboBox<String> ElectionList;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel PhotoLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
