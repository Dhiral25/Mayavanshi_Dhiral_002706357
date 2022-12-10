/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
     public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public void deleteCustomer(String name) {
        for(int i = 0; i < customerList.size(); i ++) {
            if(customerList.get(i).getName().equals(name)) {
                customerList.remove(i);
            }
        }
    }
    
    public Customer createCustomer(String name, UserAccount ua, String phone, String address, String Email, String Network){
        Customer cust = new Customer();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        cust.setEmail(Email);
        cust.setNetwork(Network);
        customerList.add(cust);
        return cust;
    }
}
