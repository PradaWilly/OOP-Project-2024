package ecotrackapp;

/**
 *
 * @author cosmy
 */
public class LoginGUI extends javax.swing.JFrame {


    public LoginGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginEmail = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        loginPassword = new javax.swing.JPasswordField();
        loginPasswordLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        loginEmailLabel = new javax.swing.JLabel();
        noAccount = new javax.swing.JLabel();
        loginSignupButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmailActionPerformed(evt);
            }
        });
        getContentPane().add(loginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 220, 40));

        loginButton.setBackground(new java.awt.Color(0, 204, 153));
        loginButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 119, 38));

        loginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 220, 40));

        loginPasswordLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        loginPasswordLabel.setText("Password");
        getContentPane().add(loginPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        loginLabel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 204, 153));
        loginLabel.setText("LOGIN");
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        loginEmailLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        loginEmailLabel.setText("Email");
        getContentPane().add(loginEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        noAccount.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        noAccount.setText("I don't have an account");
        getContentPane().add(noAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 146, -1));

        loginSignupButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        loginSignupButton.setForeground(new java.awt.Color(102, 102, 255));
        loginSignupButton.setText("Sign up");
        loginSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSignupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginSignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginSignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSignupButtonActionPerformed
        RegisterGUI Register = new RegisterGUI();
        Register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginSignupButtonActionPerformed

    private void loginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordActionPerformed

    private void loginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginEmailActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JButton loginSignupButton;
    private javax.swing.JLabel noAccount;
    // End of variables declaration//GEN-END:variables
}
