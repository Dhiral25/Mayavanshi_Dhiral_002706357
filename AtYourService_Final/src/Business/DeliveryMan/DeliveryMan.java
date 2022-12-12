/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Orders.HotelDirectory;
import Business.Orders.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author vikas
 */
public class DeliveryMan {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private String phone;
    private boolean available;
    private UserAccount accountDetails = new UserAccount();
    private ArrayList<OrderDirectory> orderList;
    private ArrayList<HotelDirectory> orderLists;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

   

    public ArrayList<HotelDirectory> getOrderLists() {
        return orderLists;
    }

    public void setOrderLists(ArrayList<HotelDirectory> orderLists) {
        this.orderLists = orderLists;
    }

    public ArrayList<OrderDirectory> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderDirectory> orderList) {
        this.orderList = orderList;
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
    
    public DeliveryMan() {
        id = count;
        count++;
        orderList = new ArrayList<OrderDirectory>();
        orderLists = new ArrayList<HotelDirectory>();
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
        DeliveryMan.count = count;
    }
    
}
