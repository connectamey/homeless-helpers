/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CovidBloodTestOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CovidBloodTesterRole.CovidBloodTestWorkAreaJPanel;

/**
 *
 * @author rinki
 */
 // CovidBloodTesterRole inherits from Role
public class CovidBloodTesterRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CovidBloodTestWorkAreaJPanel(userProcessContainer, account, (CovidBloodTestOrganization) organization, business, enterprise);
    }

    public String toString() {
        return "Covid Blood Tester";
    }

}
