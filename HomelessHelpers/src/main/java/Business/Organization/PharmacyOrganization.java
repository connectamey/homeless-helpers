/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;

/**
 *
 * @author rinki
 */
public class PharmacyOrganization extends Organization {

    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }
}
