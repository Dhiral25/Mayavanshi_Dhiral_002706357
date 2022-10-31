/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public int patientCount(){
        return patientDirectory.size();
    }
    
    public Patient addPatient(){
        Patient p = new Patient();
        patientDirectory.add(p);
        return p;
    }
    
    public int patientcount(){
        return patientDirectory.size();
    }

    public Patient getPatient(String text) {
        /*
        Doctor d = new Doctor();
        for(Doctor cd : doctorDirectory){
            if(cd.getDoctorId().equals(text)){
                d = cd;
                break;
            }
        }
        return d;
        */
        Patient p = new Patient();
        for(Patient ps : patientDirectory){
            if(ps.getUsername().equals(text)){
                p = ps;
                break;
            }
        }
        return p;
    }

    public void deleteHospital(Patient h) {
        patientDirectory.remove(h);
    }
    
    
}
