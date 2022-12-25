/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author amey
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Hospital.getValue())) {
            organization = new HospitalOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DepartmentFacilitation.getValue())) {
            organization = new DepartmentFacilitationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SymptomsCheck.getValue())) {
            organization = new SymptomsCheckOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CovidBloodTest.getValue())) {
            organization = new CovidBloodTestOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DiseaseAnalyzer.getValue())) {
            organization = new DiseaseAnalysisOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())) {
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ReportGeneration.getValue())) {
            organization = new ReportGenerationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Volunteer.getValue())) {
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
     public void deleteOrganization(Organization organization)
    {
        organizationList.remove(organization);
    }
    
    public void updateOrganization(Organization organization, String name)
    {
        organization.setName(name);
    }

}
