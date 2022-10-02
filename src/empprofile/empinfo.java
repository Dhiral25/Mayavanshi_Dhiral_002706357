/*l
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empprofile;

import java.util.Date;

/**
 *
 * @author DhiralM
 */
public class empinfo {
    
    private String name;
    private int empid;
    private int age;
    private String gender;
    private String level;
    private String teaminfo;
    private int startdate;
    private String positiontitle;
    private long phno;
    private String emailadd;
    private String pic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeaminfo() {
        return teaminfo;
    }

    public void setTeaminfo(String teaminfo) {
        this.teaminfo = teaminfo;
    }

    public int getStartdate() {
        return startdate;
    }

    public void setStartdate(int startdate) {
        this.startdate = startdate;
    }

    

    public String getPositiontitle() {
        return positiontitle;
    }

    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }    
         
    /**
     *
     * @return
     */
    @Override
    
    public String toString(){
        return name;
        
    }
}
