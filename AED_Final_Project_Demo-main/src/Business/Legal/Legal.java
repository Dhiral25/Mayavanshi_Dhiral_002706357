/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Legal;

/**
 *
 * @author DhiralM
 */
import Business.Orders.LegalOrder;
import Business.Orders.LegalDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

public class Legal {
    private String name;
    private int id;
    private static int count = 1;
    private String managerName;
    private String address;
    private HashMap<String, String> menus;
    private String phone;
    private String Email;
    private UserAccount accountDetails = new UserAccount();
    private ArrayList<LegalOrder> orderList;
    private ArrayList<LegalDirectory> orderDirectoryList;
    private HashMap<String, ArrayList<LegalOrder>> orders;
    private String Network;

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
    }

    public HashMap<String, String> getMenus() {
        return menus;
    }

    public void setMenus(HashMap<String, String> menus) {
        this.menus = menus;
    }

    public HashMap<String, ArrayList<LegalOrder>> getOrders() {
        return orders;
    }

    public void setOrders(HashMap<String, ArrayList<LegalOrder>> orders) {
        this.orders = orders;
    }

    
    
    public HashMap<String, String> getMenu() {
        return menus;
    }

    public void setMenu(HashMap<String, String> menus) {
        this.menus = menus;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public ArrayList<LegalDirectory> getOrderDirectoryList() {
        return orderDirectoryList;
    }

    public void setOrderDirectoryList(ArrayList<LegalDirectory> orderDirectoryList) {
        this.orderDirectoryList = orderDirectoryList;
    }
    
    public ArrayList<LegalOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<LegalOrder> orderList) {
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
    
    public Legal() {
        id = count;
        count++;
        menus = new HashMap<String, String>();
        orderList = new ArrayList<LegalOrder>();
        orderDirectoryList = new ArrayList<LegalDirectory>();
    }
    
    public void setMenuItem(String name, String value) {
        menus.put(name, value);
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
        Legal.count = count;
    }
    
}
