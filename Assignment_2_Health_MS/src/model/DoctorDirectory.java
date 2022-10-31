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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        doctorDirectory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addDoctor(){
        Doctor d = new Doctor();
        doctorDirectory.add(d);
        return d;
    }
    
    public int doctorCount(){
        return doctorDirectory.size();
    }

    public Doctor getDoctor(String text) {
        Doctor d = new Doctor();
        for(Doctor cd : doctorDirectory){
            if(cd.getDoctorId().equals(text)){
                d = cd;
                break;
            }
        }
        return d;
    }

    public void deleteDoctor(Doctor d) {
        doctorDirectory.remove(d);
    }
    
    
    
    
}
