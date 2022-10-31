/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DhiralM
 */
public class VitalSigns {
    
    private double bloodPressure;
    private double temperatureInF;
    private double pulseRate;
    private double respirationRate;

    
    
    

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getTemperatureInF() {
        return temperatureInF;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInF = temperatureInF;
    }

    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }
    
    @Override
    public String toString() {
        return "" + this.bloodPressure;
    }
    
    
    
}
