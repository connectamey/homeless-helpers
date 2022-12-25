/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author amey
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Volunteer("Volunteer"), HospitalAllocator("Hospital Allocator"),
        DepartmentFacilitator("Department Facilitator"), SymptomsChecker("Symptoms Checker"),
        CovidBloodTester("Covid Blood Tester"), DiseaseAnalyzerRole("Disease Analyzer"), Pharmacy("Pharmacist"),
        ReportCreatorRole("Report Creator");
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

//creating abstract method
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business);

//    @Override
//    public String toString() {
//        return this.getClass().getName();
//    }
}
