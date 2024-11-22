/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecotrackapp;

/**
 *
 * @author sohei
 */
public class SustainTips {
    protected String[] tips;
    
    
    public SustainTips(){
        tips = new String[5];
    }
    
    
    public void intiTips(){
        tips[0] = "Tip: Use LED lighting throughout your home.";
        tips[1] = "Tip: Use more public transport.";
        tips[2] = "Tip: Turn off your lights when you leave a room.";
        tips[3]= "Tip: Donate your unwanted clothing to give it a second life.";
        tips[4] = "Tip: Turn off your computer before leaving work";
    }

    public String[] getTips() {
        return tips;
    }
    
    
    
    
}
