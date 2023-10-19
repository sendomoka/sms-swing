import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {

    Connect DB = new Connect();
    public Login() {
        initComponents();
        DB.main();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("loginFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        lbUsername.setFont(new java.awt.Font("Circular Std Medium", 0, 20)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername.setText("Username");
        getContentPane().add(lbUsername);
        lbUsername.setBounds(710, 170, 91, 21);

        tfUsername.setBackground(new java.awt.Color(0, 0, 0));
        tfUsername.setFont(new java.awt.Font("Circular Std Book", 0, 20)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(146, 146, 146));
        tfUsername.setMaximumSize(new java.awt.Dimension(500, 50));
        tfUsername.setMinimumSize(new java.awt.Dimension(500, 50));
        tfUsername.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(tfUsername);
        tfUsername.setBounds(710, 200, 500, 50);

        lbPassword.setFont(new java.awt.Font("Circular Std Medium", 0, 20)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("Password");
        getContentPane().add(lbPassword);
        lbPassword.setBounds(710, 290, 88, 21);

        pfPassword.setBackground(new java.awt.Color(0, 0, 0));
        pfPassword.setFont(new java.awt.Font("Circular Std Book", 0, 20)); // NOI18N
        pfPassword.setForeground(new java.awt.Color(146, 146, 146));
        pfPassword.setMaximumSize(new java.awt.Dimension(500, 50));
        pfPassword.setMinimumSize(new java.awt.Dimension(500, 50));
        pfPassword.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(pfPassword);
        pfPassword.setBounds(710, 320, 500, 50);

        btnLogin.setBackground(new java.awt.Color(30, 215, 96));
        btnLogin.setFont(new java.awt.Font("Circular Std Bold", 0, 20)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(710, 430, 500, 50);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Login.png"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = tfUsername.getText();
        String password = new String(pfPassword.getPassword());
        
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "You must fill in both username and password!");
            return;
        }

        String query = String.format("SELECT * FROM users WHERE username='%s' AND password='%s'", username, password);
        try {
            ResultSet resultSet = DB.query(query);

            if (resultSet.next()) {
                new Home().show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password provided!");
            }
        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
