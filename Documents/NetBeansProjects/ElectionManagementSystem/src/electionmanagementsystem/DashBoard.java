
package electionmanagementsystem;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;




public class DashBoard extends javax.swing.JFrame {
    
   
    public DashBoard() {
        initComponents();
        DisplayElections();
    }
  
  
    Connection Con=null;
    PreparedStatement Pst= null;
    ResultSet Rs =null;
    Statement St= null;
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Vote = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionTable = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        WinnerName = new javax.swing.JLabel();
        CPhoto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Winner = new javax.swing.JLabel();
        VoteCounted4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Vote.setBackground(new java.awt.Color(255, 255, 255));

        ElectionTable.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 0), new java.awt.Color(0, 0, 0), null), null));
        ElectionTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        ElectionTable.setRowHeight(28);
        ElectionTable.setSelectionBackground(new java.awt.Color(255, 51, 0));
        ElectionTable.setShowHorizontalLines(true);
        ElectionTable.setShowVerticalLines(true);
        ElectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionTable);

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

        WinnerName.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        WinnerName.setForeground(new java.awt.Color(255, 51, 102));
        WinnerName.setText("Name");

        CPhoto.setBackground(new java.awt.Color(255, 102, 102));
        CPhoto.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        CPhoto.setForeground(new java.awt.Color(255, 51, 102));
        CPhoto.setText("Photo");
        CPhoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 102));
        jLabel11.setText("Election List");

        Percentage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Percentage.setForeground(new java.awt.Color(51, 255, 0));
        Percentage.setText("Percentage");

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

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Welcome  in Voting  System ");

        Winner.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Winner.setForeground(new java.awt.Color(51, 255, 0));
        Winner.setText("Winner!!!!!    ");

        VoteCounted4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        VoteCounted4.setForeground(new java.awt.Color(51, 255, 0));
        VoteCounted4.setText("Vote");

        javax.swing.GroupLayout VoteLayout = new javax.swing.GroupLayout(Vote);
        Vote.setLayout(VoteLayout);
        VoteLayout.setHorizontalGroup(
            VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(VoteLayout.createSequentialGroup()
                .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel3))
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(VoteLayout.createSequentialGroup()
                .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WinnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VoteLayout.createSequentialGroup()
                                .addComponent(CPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VoteCounted4)
                                    .addComponent(Percentage))))))
                .addContainerGap(524, Short.MAX_VALUE))
            .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VoteLayout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(Winner)
                    .addContainerGap(852, Short.MAX_VALUE)))
        );
        VoteLayout.setVerticalGroup(
            VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VoteLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(70, 70, 70)
                .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addComponent(VoteCounted4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackBtn)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(VoteLayout.createSequentialGroup()
                        .addComponent(CPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WinnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(VoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VoteLayout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(Winner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(602, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Vote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(Vote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        private void DisplayElections(){
          try {
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              Rs=St.executeQuery("Select * from ElectionTbl");
              ElectionTable.setModel(DbUtils.resultSetToTableModel(Rs));  
          }catch (Exception e){
      }
}
        int WinnerId,Votes,Percentagee;
        private void GetWinner(){
        try{
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              String Query = "Select VoterId , Count(VoterId) from VotesTbl where ElectionList = " +Key+" Group BY VoterId ORDER BY VoterId  DESC LIMIT 1 ";
              Rs=St.executeQuery(Query);
              while(Rs.next()){
              
                  Votes=Rs.getInt(1);
                  VoteCounted4.setText(Votes+"Votes");
            }}catch (HeadlessException | SQLException e){
                  JOptionPane.showMessageDialog(this,e);
                  }
        
      }
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
     
    private void GetWinnerData(){
        String Query = "SELECT CPhoto,CName FROM CandidateTbl WHERE CId = ?";
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
            //String WinnerName.setText(Rs.getBytes("CName"));
            String candidateName = Rs.getString("CName");
            WinnerName.setText(candidateName);
            }
    }catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching photo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
     }

private void GetVotes()
        {
        try{
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              String Query = "Select Count(VoteId) from VotesTbl where VoteId = " +WinnerId;
              Rs=St.executeQuery(Query);
              while(Rs.next()){
               //JOptionPane.showMessageDialog(this,""+Rs.getInt(1));
                  WinnerId=Rs.getInt(1);
            }}catch (HeadlessException | SQLException e){
                  JOptionPane.showMessageDialog(this,e);
                  }
}
    int TotalVotes;
    double WinPercentage;
    private void GetPercentage()
        {
        try{
              Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/election.db","root","");
              St=Con.createStatement();
              String Query = "Select Count(VoteId) from VotesTbl where VoteId = " +Key;
              Rs=St.executeQuery(Query);
              while(Rs.next()){
               
                  
                //  JOptionPane.showMessageDialog(this,TotalVotes);
                  TotalVotes=Rs.getInt(1);
                  WinPercentage=(TotalVotes*100)/Votes;
                  Percentage.setText(new DecimalFormat("##.##").format(WinPercentage)+"%");
            }}catch (SQLException e){
                  JOptionPane.showMessageDialog(this,e);
                  }
}
    int Key =-1;
    private void ElectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ElectionTable.getModel();
        int MyIndex = ElectionTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
       
        GetWinnerData();
        GetWinner();
       // GetWinnerData();
        GetVotes();
        GetPercentage();
    }//GEN-LAST:event_ElectionTableMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed
    
           

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CPhoto;
    private javax.swing.JTable ElectionTable;
    private javax.swing.JLabel Percentage;
    private javax.swing.JPanel Vote;
    private javax.swing.JLabel VoteCounted4;
    private javax.swing.JLabel Winner;
    private javax.swing.JLabel WinnerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
