/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author vikas
 */
public class createNetwork {
    ArrayList<String> network = new ArrayList<String>();

    public ArrayList<String> getNetwork() {
        return network;
    }

    public void setNetwork(ArrayList<String> network) {
        this.network = network;
    }
    
    public String createNetwork(String name){
        network.add(name);
        return name;
    }
    
    public createNetwork() {
        network = new ArrayList();
    }
}
