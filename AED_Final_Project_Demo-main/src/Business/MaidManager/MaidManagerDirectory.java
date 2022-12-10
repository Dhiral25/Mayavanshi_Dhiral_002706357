/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MaidManager;

/**
 *
 * @author DhiralM
 */
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

public class MaidManagerDirectory {
    private ArrayList<MaidManager> MaidManagerList;
    
    public MaidManagerDirectory() {
        MaidManagerList = new ArrayList();
    }

    public ArrayList<MaidManager> getMaidManagerList() {
        return MaidManagerList;
    }
    
     public void setCustomerList(ArrayList<MaidManager> MaidManagerList) {
        this.MaidManagerList = MaidManagerList;
    }
    
    public Boolean deleteMaidManager(String name) {
        for(int i = 0; i < MaidManagerList.size(); i ++) {
            if(MaidManagerList.get(i).getName().equals(name)) {
                MaidManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public MaidManager createMaidManager(String name, UserAccount ua, String phone, String gender , String address, String Network){
        MaidManager cust = new MaidManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setGender(gender);
        cust.setNetwork(Network);
        MaidManagerList.add(cust);
        return cust;
    }
}
