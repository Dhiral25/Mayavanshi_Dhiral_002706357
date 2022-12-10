/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author DhiralM
 */
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import userinterface.LegalAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

public class LegalRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business);
    }
}
