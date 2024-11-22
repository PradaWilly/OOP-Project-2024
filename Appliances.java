/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecotrackapp;

/**
 *
 * @author sohei
 */
public class Appliances extends EnergyCalculator {
    private String name;

    public Appliances(String name, double powerRating, double hoursUsed) {
        super(powerRating, hoursUsed);
        this.name = name;
    }

    public Appliances() {
        name = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDetails(){
        return "Appliance Name:" + getName() + "\nPower Rating: " + getPowerRating() + "\nHours Used: " + getHoursUsed();
    }
}
