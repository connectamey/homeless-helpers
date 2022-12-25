/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DepartmentFacilitationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rinki
 */
public class DepartmentFacilitationOrganization extends Organization {

    public DepartmentFacilitationOrganization() {
        super(Organization.Type.DepartmentFacilitation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DepartmentFacilitationRole());
        return roles;
    }

}
