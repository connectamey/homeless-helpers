/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HospitalAllocatorRole.HospitalAllocatorWorkAreaJPanel;

/**
 *
 * @author Keerthana
 */
// Hospital Allocator inherits from role class
public class HospitalAllocatorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAllocatorWorkAreaJPanel(userProcessContainer, account, (HospitalOrganization) organization, enterprise, business);
    }

    public String toString() {
        return "Hospital Allocator";
    }

}
