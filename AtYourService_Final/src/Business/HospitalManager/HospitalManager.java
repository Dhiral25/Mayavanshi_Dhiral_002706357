/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HospitalManager;

import Business.Orders.TherapistOrder;
import Business.Orders.TherapistDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dhiral
 */
public class HospitalManager {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private UserAccount accountDetails;
    private HashMap<String, String> menu;
    private ArrayList<TherapistOrder> orderList;
    private HashMap<String, ArrayList<TherapistOrder>> orders;
    private ArrayList<TherapistDirectory> orderDirectoryList;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }
    
    public ArrayList<TherapistDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<TherapistDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
     public HashMap<String, ArrayList<TherapistOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<TherapistOrder>> orders) {
        this.orders = orders;
    }
    
    public UserAccount getAccountDetails() {
        return accountDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setAccountDetails(UserAccount accountDetails) {
        this.accountDetails = accountDetails;
    }
    
    public ArrayList<TherapistOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<TherapistOrder> orderList) {
        this.orderList = orderList;
    }
    
    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }
    
    public HospitalManager() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<TherapistOrder>();
        orders = new HashMap<String, ArrayList<TherapistOrder>>();
        orderDirectoryList = new ArrayList<TherapistDirectory>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        HospitalManager.count = count;
    }
}
