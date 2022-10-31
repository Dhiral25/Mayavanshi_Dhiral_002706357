/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author DhiralM
 */
public class Encounter {
    private String encounterId;
    
    private Doctor doctor;
    private Patient patient;
    
    

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }
    
    
    private VitalSigns vitalSign;
    private String date;

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    

    

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public String getDate() {
        return date;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return this.encounterId;
    }
    
    
    
    
}
