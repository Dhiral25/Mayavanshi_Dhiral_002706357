/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class DoctorDirectory {
    private ArrayList<Doctor> DoctorDirectory;

    public DoctorDirectory() {
        this.DoctorDirectory = new ArrayList<Doctor>();
    }
  
    public ArrayList<Doctor> getDoctorDirectory() {
        return DoctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
    }
      
   
     public Doctor addNewDoctor() {
        System.out.println(" add function called in DoctorDirectory  start"); 
        Doctor doctor = new Doctor();
        System.out.println(" add function called in DoctorDirectory");
        Doctor Doctor = null;
        DoctorDirectory.add(Doctor);
        return Doctor;      
    }
     
    public void DoctorDirectory(Doctor doctor){
        DoctorDirectory.remove(doctor);
    }
    
    public ArrayList<Doctor> searchDoctor(String key)
    {
        ArrayList<Doctor> searchDoctorDirectory = new ArrayList();
        for(Doctor doctor: searchDoctorDirectory)
        {
            if(doctor.getDoctName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchDoctorDirectory.add(doctor);
            }
        }
        return searchDoctorDirectory;
    }
    
}
