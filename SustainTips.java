/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecotrackapp;

import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 *
 * @author sohei
 */
public class SustainTips extends Thread{
    protected String[] tips;
    
    
    public SustainTips(){
        tips = new String[5];
        intiTips();
    }
    
    //initilises tips text/values into each the tips String array
    public void intiTips(){
        tips[0] = "Tip: Use LED lighting throughout your home.";
        tips[1] = "Tip: Use more public transport.";
        tips[2] = "Tip: Turn off your lights when you leave a room.";
        tips[3]= "Tip: Donate your unwanted clothing to give it a second life.";
        tips[4] = "Tip: Turn off your computer before leaving work";
    }
    
    /*public void loopTips(int run, JLabel tipLbl, JSlider tipsSlide){
        int slideValue = 0;
        SustainTips myTips = new SustainTips();
        
        while(run == 1){
              synchronized(myTips){
                 try {
                    myTips.wait(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
              }
            if(tipsSlide.getValue() < 20 ){
               tipLbl.setText(myTips.getTips()[0]);
                System.out.println(tipsSlide.getValue());
            }
            else if(tipsSlide.getValue() < 40 ){
                tipLbl.setText(myTips.getTips()[1]);
            }
            else if(tipsSlide.getValue() < 60){
                tipLbl.setText(myTips.getTips()[2]);
            }
            else if(tipsSlide.getValue() < 80){
                tipLbl.setText(myTips.getTips()[3]);
            }
            else if(tipsSlide.getValue() < 100){
                tipLbl.setText(myTips.getTips()[4]);
            }
             slideValue += 1;
             tipsSlide.setValue(slideValue);
             System.out.println(tipsSlide.getValue());
        }
    }*/
    

    public String[] getTips() {
        return tips;
    }
    
    
    
    
}
