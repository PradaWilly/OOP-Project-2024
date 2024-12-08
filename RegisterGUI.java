package ecotrackapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cosmy
 */
public class RegisterGUI extends javax.swing.JFrame {

    public RegisterGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailSep = new javax.swing.JSeparator();
        passSeparaty = new javax.swing.JSeparator();
        registerEmail = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();
        registerPassword = new javax.swing.JPasswordField();
        registerRegisterLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EcoReg = new javax.swing.JLabel();
        TrackReg = new javax.swing.JLabel();
        showPassReg = new javax.swing.JToggleButton();
        alreadyUser = new javax.swing.JLabel();
        backToLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailSep.setForeground(new java.awt.Color(102, 255, 102));
        getContentPane().add(emailSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 200, 10));

        passSeparaty.setForeground(new java.awt.Color(102, 255, 102));
        getContentPane().add(passSeparaty, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 200, 10));

        registerEmail.setBackground(new java.awt.Color(242, 242, 242));
        registerEmail.setText("Email ");
        registerEmail.setBorder(null);
        registerEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerEmailFocusGained(evt);
            }
        });
        registerEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerEmailMouseClicked(evt);
            }
        });
        registerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEmailActionPerformed(evt);
            }
        });
        getContentPane().add(registerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 220, 40));

        signupButton.setBackground(new java.awt.Color(102, 255, 102));
        signupButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 119, 38));

        registerPassword.setBackground(new java.awt.Color(242, 242, 242));
        registerPassword.setText("XXXXXXXXX");
        registerPassword.setBorder(null);
        registerPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerPasswordFocusGained(evt);
            }
        });
        registerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(registerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 220, 40));

        registerRegisterLabel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        registerRegisterLabel.setForeground(new java.awt.Color(102, 255, 102));
        registerRegisterLabel.setText("REGISTER");
        getContentPane().add(registerRegisterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 170, 60));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));

        EcoReg.setFont(new java.awt.Font("Calibri", 3, 100)); // NOI18N
        EcoReg.setText("Eco");

        TrackReg.setFont(new java.awt.Font("Calibri", 3, 100)); // NOI18N
        TrackReg.setText("Track");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrackReg)
                    .addComponent(EcoReg))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(EcoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TrackReg)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 600));

        showPassReg.setText("Show Password");
        showPassReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRegActionPerformed(evt);
            }
        });
        getContentPane().add(showPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        alreadyUser.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        alreadyUser.setText("Already a user ?");
        getContentPane().add(alreadyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        backToLogin.setForeground(new java.awt.Color(102, 102, 255));
        backToLogin.setText("LOGIN");
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });
        getContentPane().add(backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEmailActionPerformed

    }//GEN-LAST:event_registerEmailActionPerformed

    private void registerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed

        //get email and password from fields
        String email = registerEmail.getText();
        String password = new String(registerPassword.getPassword());

        //create objetcs
        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        //check if fields are empty
        if (email.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Both email and password fields must be filled.");
            return;
        }

        //Message if email format isnt valid
        if (!isValidEmail(email)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please use a real email adress.");
            return;
        }

        //store info in info file
        try {
            outFile = new File("info.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);

            bw.write(email + " : " + password);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error" + e);
        }

        //redirect to login page
        LoginGUI Login = new LoginGUI();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupButtonActionPerformed

    private void showPassRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassRegActionPerformed
        if (showPassReg.isSelected()) {
            registerPassword.setEchoChar((char) 0);
        } else {
            registerPassword.setEchoChar('•');
        }

    }//GEN-LAST:event_showPassRegActionPerformed

    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        LoginGUI Login = new LoginGUI();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToLoginActionPerformed

    private void registerEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerEmailFocusGained

    }//GEN-LAST:event_registerEmailFocusGained

    private void registerPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerPasswordFocusGained
        registerPassword.setText("");
    }//GEN-LAST:event_registerPasswordFocusGained

    private void registerEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerEmailMouseClicked
        registerEmail.setText("");
    }//GEN-LAST:event_registerEmailMouseClicked

    //checks if email format is valid
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-z0-9._]+@[a-z0-9]+\\.[a-z]{2,3}$";
        return email.matches(emailRegex);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EcoReg;
    private javax.swing.JLabel TrackReg;
    private javax.swing.JLabel alreadyUser;
    private javax.swing.JButton backToLogin;
    private javax.swing.JSeparator emailSep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator passSeparaty;
    private javax.swing.JTextField registerEmail;
    private javax.swing.JPasswordField registerPassword;
    private javax.swing.JLabel registerRegisterLabel;
    private javax.swing.JToggleButton showPassReg;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
