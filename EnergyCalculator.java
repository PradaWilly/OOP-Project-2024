/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecotrackapp;

/**
 *
 * @author sohei
 */
public class EnergyCalculator {
    private double powerRating;
    private double hoursUsed;
    private String name;
    

    public EnergyCalculator(double powerRating, double hoursUsed) {
        this.powerRating = powerRating;
        this.hoursUsed = hoursUsed;
    }
    
    public EnergyCalculator(){
        powerRating = 0;
        hoursUsed = 0;
       
        name = " ";

    }
    


    public double getPowerRating() {
        return powerRating;
    }

    public double getHoursUsed() {
        return hoursUsed;
    }

    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }

    public void setHoursUsed(double hoursUsed) {
        this.hoursUsed = hoursUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
