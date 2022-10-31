/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DhiralM
 */
public class Doctor {
    private String doctorId;
    private String DoctorName;
    private int age;
    private String gender;

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Hospital getHospital() {
        return hospital;
    }
    private Hospital hospital;
    private String occupation;
    private int experience;
    private String specialization;
    private String phoneNumber;
    private String email;
    private String username;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    private String password;

    public String getDoctorId() {
        return doctorId;
    }
    
    public String getOccupation() {
        return occupation;
    }

    public int getExperience() {
        return experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public String toString() {
        return this.DoctorName;
    }
    
    
    
    
    
}
