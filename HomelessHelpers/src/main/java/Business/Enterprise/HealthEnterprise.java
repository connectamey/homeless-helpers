/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amey
 */
public class HealthEnterprise extends Enterprise {

    public HealthEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Health);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Organization.Type> getSupportedOrganizationType() {

        ArrayList<Organization.Type> types = new ArrayList<>();
        types.add(Organization.Type.Hospital);
        types.add(Organization.Type.DepartmentFacilitation);
        return types;
    }

}
