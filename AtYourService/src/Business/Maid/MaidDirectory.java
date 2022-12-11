/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Maid;

/**
 *
 * @author vikas
 */
import Business.MaidManager.MaidManager;
import java.util.ArrayList;

public class MaidDirectory {
    private ArrayList<Maid> MaidList;
    
    public MaidDirectory() {
        MaidList = new ArrayList();
    }

    public ArrayList<Maid> getMaidList() {
        return MaidList;
    }
    
    public Boolean deleteMaid(String name) {
        for(int i = 0; i < MaidList.size(); i ++) {
            if(MaidList.get(i).getName().equals(name)) {
                MaidList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Maid createMaid(String name, MaidManager rm, String phone, String location, String Network){
        Maid rest = new Maid();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        MaidList.add(rest);
        return rest;
    }
}
