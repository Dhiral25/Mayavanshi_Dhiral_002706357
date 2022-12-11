/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MaidManager;

/**
 *
 * @author yashjain
 */
import Business.Orders.Maid1Directory;
import Business.Orders.MaidOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

public class MaidManager {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String gender;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private String address;
    private String phone;
    private String available;
    private UserAccount accountDetails;
    private HashMap<String, String> menu;
    private ArrayList<MaidOrder> orderList;
    private HashMap<String, ArrayList<MaidOrder>> orders;
    private ArrayList<Maid1Directory> orderDirectoryList;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }

    public ArrayList<MaidOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<MaidOrder> orderList) {
        this.orderList = orderList;
    }

    public HashMap<String, ArrayList<MaidOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<MaidOrder>> orders) {
        this.orders = orders;
    }

    public ArrayList<Maid1Directory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<Maid1Directory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
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
    
    public MaidManager() {
        id = count;
        count++;
        menu = new HashMap<String, String>();
        orderList = new ArrayList<MaidOrder>();
        orders = new HashMap<String, ArrayList<MaidOrder>>();
        orderDirectoryList = new ArrayList<Maid1Directory>();
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
        MaidManager.count = count;
    }
}
