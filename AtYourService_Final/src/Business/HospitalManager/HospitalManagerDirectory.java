/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author shikha
 */
public class HospitalManagerDirectory {
    private ArrayList<HospitalManager> hospitalManagerList;
    
    public HospitalManagerDirectory() {
        hospitalManagerList = new ArrayList();
    }

    public ArrayList<HospitalManager> getHospitalManagerList() {
        return hospitalManagerList;
    }
    
     public void setCustomerList(ArrayList<HospitalManager> hospitalManagerList) {
        this.hospitalManagerList = hospitalManagerList;
    }
    
    public void deleteHospitalManager(String name) {
        for(int i = 0; i < hospitalManagerList.size(); i ++) {
            if(hospitalManagerList.get(i).getName().equals(name)) {
//                system.getUserAccountDirectory().deleteUser(hospitalManagerList.get(i).getAccountDetails().getUsername());
                
                hospitalManagerList.remove(i);
                System.out.println(hospitalManagerList.size() + "length 1");
//                return true;
            }
        }
//        return false;
    }
    
    public HospitalManager createHospitalManager(String name, UserAccount ua, String phone, String address, String Network){
        HospitalManager cust = new HospitalManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setNetwork(Network);
        hospitalManagerList.add(cust);
        return cust;
    }
}
