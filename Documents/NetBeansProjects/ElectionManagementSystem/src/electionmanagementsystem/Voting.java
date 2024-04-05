
package electionmanagementsystem;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voting extends javax.swing.JFrame {
    Connection Con=null;
    PreparedStatement Pst= null;
    ResultSet Rs =null;
    Statement St= null;

    public Voting() {
        initComponents();
        DisplaysCandidates();
        VoteCounted1.setVisible(false);
        
    }
    int VotingId;
    public Voting(int VoterId){
        initComponents();
        DisplaysCandidates();
        VoteCounted1.setVisible(false);
        VotingId = VoterId;
        //JOptionPane.showMessageDialog(this, VotingId);
    }
    private void DisplaysCandidates(){
          try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              Rs=St.executeQuery("Select * from CandidateTbl");
              CandidateTbl.setModel(DbUtils.resultSetToTableModel(Rs));  
          }catch (Exception e){
      }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTbl = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        CName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CPhoto = new javax.swing.JLabel();
        VoteBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        VoteCounted1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Welcome  in Voting  System ");

        CandidateTbl.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), new java.awt.Color(0, 0, 0), null), null));
        CandidateTbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CandidateTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        CandidateTbl.setRowHeight(28);
        CandidateTbl.setSelectionBackground(new java.awt.Color(255, 51, 0));
        CandidateTbl.setShowHorizontalLines(true);
        CandidateTbl.setShowVerticalLines(true);
        CandidateTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTbl);

        BackBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 51, 102));
        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        CName.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        CName.setForeground(new java.awt.Color(255, 51, 102));
        CName.setText("Name");

        jLabel8.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 102));
        jLabel8.setText("Your Candidates");

        CPhoto.setBackground(new java.awt.Color(255, 102, 102));
        CPhoto.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        CPhoto.setForeground(new java.awt.Color(255, 51, 102));
        CPhoto.setText("Photo");
        CPhoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        VoteBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        VoteBtn.setForeground(new java.awt.Color(51, 153, 0));
        VoteBtn.setText("VOTE");
        VoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoteBtnMouseClicked(evt);
            }
        });
        VoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 102));
        jLabel11.setText("Candidate List");

        VoteCounted1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        VoteCounted1.setForeground(new java.awt.Color(51, 255, 0));
        VoteCounted1.setText("Vote Counted!!!!!    ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(603, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(431, 431, 431)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(545, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(618, Short.MAX_VALUE)
                    .addComponent(VoteCounted1)
                    .addGap(319, 319, 319)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackBtn)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(jLabel11)
                    .addContainerGap(345, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(VoteCounted1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(522, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONLINE VOTING SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void VoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoteBtnActionPerformed
      int Key = -1;
    private ImageIcon ResizePhoto(String ImagePath,byte[] pic){
           ImageIcon MyImage = null;
            if(ImagePath != null){
            MyImage = new ImageIcon(ImagePath);
                }else{
                        MyImage = new ImageIcon(pic);
                    }
                    Image img = MyImage.getImage();
                    Image newImg = img.getScaledInstance(CPhoto.getWidth(),CPhoto.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(newImg);
                    return image;              
    }
     
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
            CPhoto.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(CPhoto.getWidth(), CPhoto.getHeight(), Image.SCALE_SMOOTH)));
            }
    }catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching photo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
     }
   
    int ElectionId;
    private void CandidateTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTblMouseClicked
        DefaultTableModel model = (DefaultTableModel)CandidateTbl.getModel();
        int MyIndex = CandidateTbl.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        CName.setText(model.getValueAt(MyIndex,1).toString());
        FetchPhoto();
        ElectionId = Integer.valueOf(model.getValueAt(MyIndex,5).toString());
        
        

    }//GEN-LAST:event_CandidateTblMouseClicked
    
    int VoteId;
    Statement St1= null;
    ResultSet Rs1=null;
      private void VCount(){
           try{
               St1 = Con.createStatement();
               Rs1= St1.executeQuery("Select MAX(VoteId) from VotesTbl");
               Rs1.next();
               VoteId= Rs1.getInt(1)+1;
           }catch(Exception Ex)
           {    
           }
      }
      int VNumber;
      private void VCheck(){
           try{
               St1 = Con.createStatement();
               Rs1= St1.executeQuery("Select Count(*) from VotesTbl where VoterId = " +VotingId+" and CandidateId = "+ElectionId+"");
               if (Rs1.next()) {
            VNumber = Rs1.getInt(1);
        } else {
            VNumber = 0;
        }
 

           }catch(Exception Ex)
           {    
               JOptionPane.showMessageDialog(this, Ex);
           }
      }
    private void VoteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoteBtnMouseClicked
        VCheck();
        if(Key == -1){
            JOptionPane.showMessageDialog(this,"Select the Candidate ");
        }
       else if(VNumber> 0){
            JOptionPane.showMessageDialog(this,"You can not vote Twice.....!!! ");
        }
        else{
            try{
                
                VCount();
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
                PreparedStatement Add=Con.prepareStatement("insert into VotesTbl values(?,?,?,?)");
                Add.setInt(1, VoteId);
                // Here we need to add the VOTERID but we will do that later since it will come from the login.
                Add.setInt(2, VotingId);
                Add.setInt(3, ElectionId);
                Add.setInt(4, Key);
                int row=Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Vote Count");
                Con.close();
                VoteBtn.setVisible(false);
                VoteCounted1.setVisible(true);
                
                DisplaysCandidates(); 
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_VoteBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CName;
    private javax.swing.JLabel CPhoto;
    private javax.swing.JTable CandidateTbl;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JLabel VoteCounted1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
