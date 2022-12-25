/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;

/**
 *
 * @author keerthana
 */
public class ReportGenerationOrganization extends Organization {

    public ReportGenerationOrganization() {
        super(Organization.Type.ReportGeneration.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReportCreatorRole());
        return roles;
    }
}
