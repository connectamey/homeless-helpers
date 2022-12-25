/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SymptomsCheckerRole;
import java.util.ArrayList;

/**
 *
 * @author keerthana
 */
public class SymptomsCheckOrganization extends Organization {

    public SymptomsCheckOrganization() {
        super(Organization.Type.SymptomsCheck.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SymptomsCheckerRole());
        return roles;
    }

}
