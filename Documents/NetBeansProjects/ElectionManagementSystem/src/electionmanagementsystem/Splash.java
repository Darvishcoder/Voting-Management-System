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
        ProgressBar = new javax.swing.JProgressBar();
        Loding = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        ProgressBar.setBackground(java.awt.SystemColor.controlDkShadow);
        ProgressBar.setStringPainted(true);
        jPanel1.add(ProgressBar);
        ProgressBar.setBounds(0, 220, 590, 13);

        Loding.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        Loding.setText("Please Wait.....");
        jPanel1.add(Loding);
        Loding.setBounds(10, 200, 130, 18);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DARVISH KISHOR\\Videos\\pizza party.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 590, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
