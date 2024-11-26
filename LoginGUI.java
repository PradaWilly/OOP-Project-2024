package ecotrackapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        showPassLog = new javax.swing.JToggleButton();
        loginSignupButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TrackLog = new javax.swing.JLabel();
        EcoLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setLocation(new java.awt.Point(360, 160));
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

        loginButton.setBackground(new java.awt.Color(102, 255, 102));
        loginButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
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
        loginLabel.setForeground(new java.awt.Color(102, 255, 102));
        loginLabel.setText("LOGIN");
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        loginEmailLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        loginEmailLabel.setText("Email");
        getContentPane().add(loginEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        noAccount.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        noAccount.setText("Need an account ?");
        getContentPane().add(noAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 100, -1));

        showPassLog.setText("Show Password");
        showPassLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassLogActionPerformed(evt);
            }
        });
        getContentPane().add(showPassLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        loginSignupButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        loginSignupButton.setForeground(new java.awt.Color(102, 102, 255));
        loginSignupButton.setText("SIGN UP");
        loginSignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSignupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginSignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));

        TrackLog.setFont(new java.awt.Font("Calibri", 3, 100)); // NOI18N
        TrackLog.setText("Track");

        EcoLog.setFont(new java.awt.Font("Calibri", 3, 100)); // NOI18N
        EcoLog.setText("Eco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrackLog)
                    .addComponent(EcoLog))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(EcoLog, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TrackLog)
                .addContainerGap(143, Short.MAX_VALUE))
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

    }//GEN-LAST:event_loginPasswordActionPerformed

    private void loginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailActionPerformed
        
    }//GEN-LAST:event_loginEmailActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //get email and password from fields
        String mail = loginEmail.getText();
        String pas = new String(loginPassword.getPassword());

        //check if either field is empty
        if (mail.isEmpty() || pas.isEmpty()) {      
            javax.swing.JOptionPane.showMessageDialog(null, "Email and password are required.");
        } else {       
            checkLoginInfo(mail, pas);
        }
        
    
    }//GEN-LAST:event_loginButtonActionPerformed

    private void showPassLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassLogActionPerformed
        if (showPassLog.isSelected()){
            loginPassword.setEchoChar((char)0);
        }else{
            loginPassword.setEchoChar('•');
        }

    }//GEN-LAST:event_showPassLogActionPerformed
    private void checkLoginInfo(String mail, String pas) {
    //read details from info.txt
    try {
        BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
        String checkLine;
        boolean loginSuccess = false;   
        
        //read each line
        while ((checkLine = reader.readLine()) != null) {
            String[] userInfo = checkLine.split(" : ");     
            //check if email and password match
            if (userInfo[0].equals(mail) && userInfo[1].equals(pas)) {
                loginSuccess = true;
                break;
            }
        }
        
        if (loginSuccess) {
            javax.swing.JOptionPane.showMessageDialog(null, "Login successful!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid email or password.");
        }
    } catch (IOException e) {
        System.out.println("Error: " + e);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EcoLog;
    private javax.swing.JLabel TrackLog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JButton loginSignupButton;
    private javax.swing.JLabel noAccount;
    private javax.swing.JToggleButton showPassLog;
    // End of variables declaration//GEN-END:variables
}
