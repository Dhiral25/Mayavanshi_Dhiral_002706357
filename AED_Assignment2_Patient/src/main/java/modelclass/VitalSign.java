/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DhiralM
 */
public class VitalSign {
    
    private double respiratoryRate;
    private double heartRate;
    private double bloodPressure;
    private double weight;
    private Date timestamp;

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
   
    

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
    
}
