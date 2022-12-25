/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DiseaseAnalyzerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rinki
 */
public class DiseaseAnalysisOrganization extends Organization {

    public DiseaseAnalysisOrganization() {
        super(Organization.Type.DiseaseAnalyzer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DiseaseAnalyzerRole());
        return roles;
    }
}
