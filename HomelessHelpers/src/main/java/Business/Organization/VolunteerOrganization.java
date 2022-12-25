/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.VolunteerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author keerthana
 */
public class VolunteerOrganization extends Organization{

    public VolunteerOrganization() {
        super(Organization.Type.Volunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerRole());
        return roles;
    }
    
}
