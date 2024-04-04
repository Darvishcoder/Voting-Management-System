/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electionmanagementsystem;
import electionmanagementsystem.login;


public class Splash extends javax.swing.JFrame {


    public Splash() {
        
        initComponents();

    }
 
                
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        Loding = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("ONLINE VOTING SYSTEM");

        ProgressBar.setBackground(new java.awt.Color(255, 51, 102));
        ProgressBar.setStringPainted(true);

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("%");

        Loding.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        Loding.setForeground(new java.awt.Color(153, 51, 255));
        Loding.setText("Loading Modules........");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DARVISH KISHOR\\Music\\image-100x91.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Loding)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Loding, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
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


    public static void main(String args[]) {
        
            Splash sp =new Splash();
            sp.setVisible(true);

            try{
                for (int i = 1; i <= 100; i++) {
                Thread.sleep(60);
                sp.Loding.setText(Integer.toString(i)+"%");
                sp.ProgressBar.setValue(i);
                }
            }catch (Exception e){
                
            }
            sp.setVisible(false);
            sp.dispose();
             
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new login().setVisible(true);
            
            }
        });
          
            
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loding;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
