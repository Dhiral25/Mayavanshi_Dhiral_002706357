/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CovidCareAdminRole.CovidCareAdminPanel;
import javax.swing.JPanel;

/**
 *
 * @author DhiralM
 */
public class CovidCareRole extends Role{
     String type;
    
    public CovidCareRole() {
    }
      public CovidCareRole(String type) {
        this.type = type;
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CovidCareAdminPanel(userProcessContainer, account, business);
    }

    
    
}
