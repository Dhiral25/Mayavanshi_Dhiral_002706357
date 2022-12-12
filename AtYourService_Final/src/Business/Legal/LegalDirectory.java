/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Legal;

/**
 *
 * @author vikas
 */
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
public class LegalDirectory {
    private ArrayList<Legal> legalList;
    
    public LegalDirectory() {
        legalList = new ArrayList();
    }

    public ArrayList<Legal> getLegalList() {
        return legalList;
    }
    
     public void setLegalList(ArrayList<Legal> legalList) {
        this.legalList = legalList;
    }
    
    public void deleteLegal(String name) {
        for(int i = 0; i < legalList.size(); i ++) {
            if(legalList.get(i).getName().equals(name)) {
                legalList.remove(i);
            }
        }
    }
    
    public Legal createLegal(String name, UserAccount ua, String phone, String address, String Email, String Network){
        Legal cust = new Legal();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setEmail(Email);
        cust.setNetwork(Network);
        legalList.add(cust);
        return cust;
    }
}
