/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DiseaseAnalysisOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DiseaseAnalyzerRole.DiseaseAnalyzerWorkAreaJPanel;

/**
 *
 * @author rinki
 */
// Disease analyzer inherits from role
public class DiseaseAnalyzerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DiseaseAnalyzerWorkAreaJPanel(userProcessContainer, account, (DiseaseAnalysisOrganization) organization, business, enterprise);
    }

    public String toString() {
        return "Disease Analyzer";
    }

}
