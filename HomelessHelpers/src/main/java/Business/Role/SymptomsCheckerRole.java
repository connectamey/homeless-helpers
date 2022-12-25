/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SymptomsCheckOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SymptomsCheckerRole.SymptomsCheckWorkAreaJPanel;

/**
 *
 * @author Keerthana
 */
// Symtoms inherits from role
public class SymptomsCheckerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SymptomsCheckWorkAreaJPanel(userProcessContainer, account, (SymptomsCheckOrganization) organization, enterprise, business);
    }

    public String toString() {
        return "Symptoms Checker";
    }

}
