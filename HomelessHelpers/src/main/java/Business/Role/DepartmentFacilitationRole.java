/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentFacilitationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DepartmentFacilitationRole.DepartmentFacilitationWorkAreaJPanel;

/**
 *
 * @author rinki
 */
 // class DepartmentFacilitationRole extends Role
public class DepartmentFacilitationRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DepartmentFacilitationWorkAreaJPanel(userProcessContainer, account, (DepartmentFacilitationOrganization) organization, enterprise, business);
    }

    public String toString() {
        return "Department Facilitator";
    }

}
