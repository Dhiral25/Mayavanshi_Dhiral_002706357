/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelclass;

import java.util.ArrayList;

/**
 *
 * @author DhiralM
 */
public class VitalSignDirectory {
    
    private ArrayList<VitalSign> vitalSignDirectory;
    
    public VitalSignDirectory() {
        this.vitalSignDirectory = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public void setVitalSignDirectory(ArrayList<VitalSign> vitalSignDirectory) {
        this.vitalSignDirectory = vitalSignDirectory;
    }

    public VitalSign addVitalSign() {
        VitalSign vitalSign = new VitalSign();
        vitalSignDirectory.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        vitalSignDirectory.remove(vitalSign);
    }
}
