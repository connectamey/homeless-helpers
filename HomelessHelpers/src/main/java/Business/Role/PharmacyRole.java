/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Pharmacy.PharmacyWorkAreaJPanel;

/**
 *
 * @author rinki
 */
public class PharmacyRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyWorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization) organization, business, enterprise);
    }

    public String toString() {
        return "Pharmisist";
    }

}
