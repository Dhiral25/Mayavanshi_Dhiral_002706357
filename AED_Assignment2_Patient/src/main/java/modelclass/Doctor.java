/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author DhiralM
 */
public class Doctor {
    
    private String DoctName;
    private String HosAdd;
    private String Speciality;
    

    public String getDoctName() {
        return DoctName;
    }

    public void setDoctName(String DoctName) {
        this.DoctName = DoctName;
    }

    public String getHosAdd() {
        return HosAdd;
    }

    public void setHosAdd(String HosAdd) {
        this.HosAdd = HosAdd;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }
    @Override
    public String toString()
    {
        return this.DoctName;
    }
    
    
    
}
