/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports_club;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 260, 140, 50);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 320, 130, 40);
        getContentPane().add(txt_username);
        txt_username.setBounds(570, 270, 170, 25);

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(400, 460, 80, 30);

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(550, 460, 90, 30);

        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(710, 460, 80, 30);
        getContentPane().add(txt_password);
        txt_password.setBounds(570, 330, 170, 25);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 260, 80, 50);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 330, 70, 30);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 460, 0, 30);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 460, 0, 0);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 460, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Sports_club\\images\\gym_disks_weight_bodybuilding_118105_1920x1200 (2).jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 50, 1510, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_password.setText(null);
        txt_username.setText(null);
        
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        String password=txt_password.getText();
        String username=txt_username.getText();
        if(password.contains("dsp") && username.contains("dsp"))
        {
            txt_password.setText(null);
            txt_username.setText(null);
                       JOptionPane.showMessageDialog(null, "Password matched..successfull login!!");
                       Main_Window obj=new Main_Window();
                       obj.setVisible(true);
                       
                       
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Login credentials ...try again !!");
            
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Login().setVisible(true);
                   //System.out.println("login launched");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
