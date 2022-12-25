/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CovidBloodTesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rinki
 */
public class CovidBloodTestOrganization extends Organization {

    public CovidBloodTestOrganization() {
        super(Organization.Type.CovidBloodTest.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CovidBloodTesterRole());
        return roles;
    }

}
