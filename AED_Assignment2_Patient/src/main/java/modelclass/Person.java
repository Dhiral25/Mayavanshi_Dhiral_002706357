/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

/**
 *
 * @author DhiralM
 */
public class Person {
    
    private String personName;
    private int age;
    private String gender;
    private String houseAddress;
    private String community;
    private String city;
    private int zipcode;
    private int personId;
    private String Appointdtate;

    public String getAppointdtate() {
        return Appointdtate;
    }

    public void setAppointdtate(String Appointdtate) {
        this.Appointdtate = Appointdtate;
    }
    private VitalSignDirectory vitalSign;

    private static int count = 0;

    public Person() {
        count++;
        personId = count;
        
        this.vitalSign = new VitalSignDirectory();
    }

    public VitalSignDirectory getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSignDirectory vitalSign) {
        this.vitalSign = vitalSign;
    }
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }
    
}
