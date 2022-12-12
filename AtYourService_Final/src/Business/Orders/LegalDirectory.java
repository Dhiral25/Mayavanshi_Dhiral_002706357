/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Business.Orders;
import Business.Legal.Legal;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author shikha
 */
public class LegalDirectory {
    private ArrayList<LegalOrder> orderList;
    private String status;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private UserAccount customerDetails;
    private Legal legal;

    public ArrayList<LegalOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<LegalOrder> orderList) {
        this.orderList = orderList;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        LegalDirectory.count = count;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserAccount getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(UserAccount customerDetails) {
        this.customerDetails = customerDetails;
    }

    public Legal getLegal() {
        return legal;
    }

    public void setLegal(Legal legal) {
        this.legal = legal;
    }
    
     public LegalDirectory() {
        id = count;
        count++;
        orderList = new ArrayList();
        status = "Placed";
        comment = "";        
        isAccept = false;
    }
     

    public void deleteOrder(String name) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getItem().equals(name)) {
                orderList.remove(i);
                return;
            }
        }
    }

    public void deleteOrderAll() {
        for (int i = 0; i < orderList.size(); i++) {
            orderList.remove(i);
        }
    }

    public LegalOrder createOrder(String item, String price, String date, Legal leg, UserAccount user) {
        LegalOrder order1 = new LegalOrder();
        order1.setItem(item);
        order1.setPrice(price);
        order1.setDate(date);
        legal = leg;
        customerDetails = user;
        orderList.add(order1);
        return order1;
    }


}
