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

        registerEmail = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();
        registerPassword = new javax.swing.JPasswordField();
        registerPasswordLabel = new javax.swing.JLabel();
        registerRegisterLabel = new javax.swing.JLabel();
        registerEmailLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EcoReg = new javax.swing.JLabel();
        TrackReg = new javax.swing.JLabel();
        showPassReg = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER");
        setLocation(new java.awt.Point(360, 160));

        registerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEmailActionPerformed(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(102, 255, 102));
        signupButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        registerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPasswordActionPerformed(evt);
            }
        });

        registerPasswordLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        registerPasswordLabel.setText("Password");

        registerRegisterLabel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        registerRegisterLabel.setForeground(new java.awt.Color(102, 255, 102));
        registerRegisterLabel.setText("REGISTER");

        registerEmailLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        registerEmailLabel.setText("Email");

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
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(EcoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TrackReg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        showPassReg.setText("Show Password");
        showPassReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerEmailLabel)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerPasswordLabel)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerRegisterLabel)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showPassReg)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerRegisterLabel)
                .addGap(47, 47, 47)
                .addComponent(registerEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(registerPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerEmailActionPerformed

    private void registerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPasswordActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        
       //get email and passwword from fiels
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
        try{
            outFile = new File("info.txt");          
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            
            bw.write(email + " : " + password);
            bw.newLine();
            bw.close();
            
        }
        catch (IOException e){
            System.out.println("Error"+e);
        }
                    
        
        //redirect to login page
        LoginGUI Login = new LoginGUI();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupButtonActionPerformed

    private void showPassRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassRegActionPerformed
        if (showPassReg.isSelected()){
            registerPassword.setEchoChar((char)0);
        }else{
            registerPassword.setEchoChar('•');
        }
        
    }//GEN-LAST:event_showPassRegActionPerformed
       
        //checks if email format is valid
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-z0-9._]+@[a-z0-9]+\\.[a-z]{2,3}$";
        return email.matches(emailRegex);
    }
    
             
   
        
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EcoReg;
    private javax.swing.JLabel TrackReg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField registerEmail;
    private javax.swing.JLabel registerEmailLabel;
    private javax.swing.JPasswordField registerPassword;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JLabel registerRegisterLabel;
    private javax.swing.JToggleButton showPassReg;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
