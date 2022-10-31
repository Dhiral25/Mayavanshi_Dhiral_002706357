/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DhiralM
 */
public class Patient extends Person {
    
    private String patientId;
    
    private double heightIncms;
    private double weightInKgs;
    private EncounterHistory patientEncounterHistory;
    private String allergies;
    private String username;
    private String password;

    public String getAllergies() {
        return allergies;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public String getPatientId() {
        return patientId;
    }

    public double getHeightIncms() {
        return heightIncms;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public EncounterHistory getPatientEncounterHistory() {
        return patientEncounterHistory;
    }

    public String getReasontoVisit() {
        return allergies;
    }
    
    
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setHeightIncms(double heightIncms) {
        this.heightIncms = heightIncms;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public void setPatientEncounterHistory(EncounterHistory patientEncounterHistory) {
        this.patientEncounterHistory = patientEncounterHistory;
    }

    public void setAllergies(String allergies) {
        this.allergies= allergies;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
    
    
    
}
