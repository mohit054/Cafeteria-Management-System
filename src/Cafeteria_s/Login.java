/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafeteria_s;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author Mohit Kumar
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jtxtUserName = new javax.swing.JTextField();
        jbtnLogin = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 15));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Username");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(135, 103, 205, 56);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(135, 248, 190, 56);

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.add(jPassword);
        jPassword.setBounds(551, 252, 317, 52);

        jtxtUserName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jtxtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.add(jtxtUserName);
        jtxtUserName.setBounds(551, 107, 317, 52);

        jbtnLogin.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(0, 102, 255));
        jbtnLogin.setText("Login");
        jbtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnLoginMouseClicked(evt);
            }
        });
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnLogin);
        jbtnLogin.setBounds(135, 333, 195, 71);

        jbtnReset.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 102, 255));
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnReset);
        jbtnReset.setBounds(431, 333, 194, 71);

        jbtnExit.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(0, 102, 255));
        jbtnExit.setText("Exit");
        jbtnExit.setToolTipText("");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit);
        jbtnExit.setBounds(675, 333, 144, 71);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 80, 940, 460);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Login Systems");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(283, 0, 367, 97);

        setSize(new java.awt.Dimension(1064, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtUserName.setText(null);
        jPassword.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        String password=jPassword.getText();
        String username=jtxtUserName.getText();
        if(password.contains("mohit")&&(username.contains("mohit")))
        {
            jtxtUserName.setText(null);
            jPassword.setText(null);
            systemExit();
            //Restaurant o=new Restaurant();
            //o.setVisible(true);
            dispose();
            new MENU().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
            jPassword.setText(null);
            jtxtUserName.setText(null);
        }
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnLoginMouseClicked
  
    }//GEN-LAST:event_jbtnLoginMouseClicked

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables
private void systemExit()
{
    WindowEvent winCloseing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
}


}
