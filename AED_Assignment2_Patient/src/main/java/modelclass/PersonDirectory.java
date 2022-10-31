/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DhiralM
 */
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<Person>();
    }
  
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
      
   
     public Person addNewPerson() {
        System.out.println(" add function called in personDirectory  start"); 
        Person person = new Person();
        System.out.println(" add function called in personDirectory");
        personDirectory.add(person);
        return person;      
    }
     
    public void removePerson(Person person){
        personDirectory.remove(person);
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
    
    
    public void uploadData() {
        System.out.println("inside Upload");
        Person person1 = new Person();     
        person1.setPersonName("Kinjal");
        person1.setAge(28);
        person1.setGender("Female");
        person1.setHouseAddress("2 Wigglesworth");
        person1.setCommunity("MissionMain");
        person1.setCity("Boston");
        person1.setZipcode(02120);
        person1.setPersonId(1);
        personDirectory.add(person1);
        
        Person person2 = new Person();     
        person2.setPersonName("Foram");
        person2.setAge(26);
        person2.setGender("Female");
        person2.setHouseAddress("2 Wigglesworth");
        person2.setCommunity("MissionMain");
        person2.setCity("Boston");
        person2.setZipcode(02120);
        person2.setPersonId(2);
        personDirectory.add(person2);
        
        Person person3 = new Person();     
        person3.setPersonName("Nikita");
        person3.setAge(26);
        person3.setGender("Female");
        person3.setHouseAddress("2 Wigglesworth");
        person3.setCommunity("MissionMain");
        person3.setCity("Boston");
        person3.setZipcode(02120);
        person3.setPersonId(3);
        personDirectory.add(person3);
        
        Person person4 = new Person();     
        person4.setPersonName("Pankti");
        person4.setAge(26);
        person4.setGender("Female");
        person4.setHouseAddress("2 Worthington");
        person4.setCommunity("HuntingtonAvenue");
        person4.setCity("Boston");
        person4.setZipcode(02120);
        person4.setPersonId(4);
        personDirectory.add(person4);
        
        
    }  
    
}
