/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecotrackapp;

import javax.swing.SwingWorker;

/**
 *
 * @author sohei
 */
public class HomeGUI extends javax.swing.JFrame{

    /**
     * Creates new form EnergyCalculatorGUI
     */
    private int run;
    private int count;
    
    SustainTips myTips;
    public HomeGUI() {
        initComponents();
        run = 1;    
        myTips =  new SustainTips();
        count = 0;
        //loopTips();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        homeSectionBtn = new javax.swing.JButton();
        surveySectionBtn = new javax.swing.JButton();
        calculatorSection = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        homeIconLbl = new javax.swing.JLabel();
        tipsLbl = new javax.swing.JLabel();
        tipsSlide = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        changeTipsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EcoTrack");
        setBackground(new java.awt.Color(102, 204, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        homeTextArea.setEditable(false);
        homeTextArea.setBackground(new java.awt.Color(102, 255, 102));
        homeTextArea.setColumns(20);
        homeTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeTextArea.setRows(5);
        homeTextArea.setText("This app can be used to help you with \ntracking your electricity usage and gives an \nestimate of how much electricity is costing you. \nYou can use what you find out about  your\nelectricity costs to choose to use alternative household\n applications that are more sustainable .\n\n");
        homeTextArea.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To the EcoTrack App");

        homeSectionBtn.setBackground(new java.awt.Color(102, 255, 102));
        homeSectionBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        homeSectionBtn.setText("Home");
        homeSectionBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        homeSectionBtn.setOpaque(true);
        homeSectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeSectionBtnActionPerformed(evt);
            }
        });

        surveySectionBtn.setBackground(new java.awt.Color(102, 255, 102));
        surveySectionBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        surveySectionBtn.setText("Survey");
        surveySectionBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        surveySectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surveySectionBtnActionPerformed(evt);
            }
        });

        calculatorSection.setBackground(new java.awt.Color(102, 255, 102));
        calculatorSection.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        calculatorSection.setText("ENERGY CONSUMPTION CALCULATOR");
        calculatorSection.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        calculatorSection.setOpaque(true);
        calculatorSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorSectionActionPerformed(evt);
            }
        });

        homeIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecotrackapp/EcoTrackIcon (2).png"))); // NOI18N

        tipsLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipsLbl.setText("Tip: Opt for energy-efficient appliances. ");

        tipsSlide.setValue(0);
        tipsSlide.setEnabled(false);

        changeTipsBtn.setBackground(new java.awt.Color(204, 255, 204));
        changeTipsBtn.setText("Cycle Tips");
        changeTipsBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        changeTipsBtn.setOpaque(true);
        changeTipsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTipsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeSectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculatorSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surveySectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(homeTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(homeIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipsLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tipsSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(changeTipsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)))
                                .addGap(182, 182, 182)))))
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(calculatorSection, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(surveySectionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeSectionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipsSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeTipsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
   //Changes tips label based on count number
    private void loopTips(){
                
                switch(count){
                    case 0 :
                         tipsLbl.setText(myTips.getTips()[0]);
                         tipsSlide.setValue(20);
                         count += 1;
                         break;
                    case 1:
                        tipsLbl.setText(myTips.getTips()[1]);
                        tipsSlide.setValue(40);
                        count += 1;
                        break;
                    case 2:
                        tipsLbl.setText(myTips.getTips()[2]);
                        tipsSlide.setValue(60);
                        count += 1;
                        break;
                    case 3:
                        tipsLbl.setText(myTips.getTips()[3]);
                        tipsSlide.setValue(80);
                        count ++;
                        break;
                    case 4:
                        tipsLbl.setText(myTips.getTips()[4]);
                        tipsSlide.setValue(100);
                        count = 0;
                        break;
                }
    }
    
    private void surveySectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surveySectionBtnActionPerformed
        // TODO add your handling code here:
        ThisSurveyGUI surveyGUI = new ThisSurveyGUI();
        surveyGUI.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_surveySectionBtnActionPerformed
    
    
    private void calculatorSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorSectionActionPerformed
        EnergyCalculatorGUI ec = new EnergyCalculatorGUI();
        this.setVisible(false);
        ec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calculatorSectionActionPerformed

    private void homeSectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeSectionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeSectionBtnActionPerformed

    private void changeTipsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTipsBtnActionPerformed
        // TODO add your handling code here:
        loopTips();
    }//GEN-LAST:event_changeTipsBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatorSection;
    private javax.swing.JButton changeTipsBtn;
    private javax.swing.JLabel homeIconLbl;
    private javax.swing.JButton homeSectionBtn;
    private javax.swing.JTextArea homeTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton surveySectionBtn;
    private javax.swing.JLabel tipsLbl;
    private javax.swing.JSlider tipsSlide;
    // End of variables declaration//GEN-END:variables
}
