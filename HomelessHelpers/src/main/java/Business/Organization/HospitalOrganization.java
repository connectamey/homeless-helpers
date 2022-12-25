/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalAllocatorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author keerthana
 */
public class HospitalOrganization extends Organization {

    public HospitalOrganization() {
        super(Organization.Type.Hospital.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAllocatorRole());
        return roles;
    }

}
