/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.HomelessPerson;

/**
 *
 * @author Keerthana
 */
public class DepartmentFacilitationWorkRequest extends WorkRequest {

    private HomelessPerson homelessPerson;
    private String hospitalToBePlaced;
    private HospitalAllocationWorkRequest allocationWorkRequest;

    public HomelessPerson getHomelessPerson() {
        return homelessPerson;
    }

    public void setHomelessPerson(HomelessPerson homelessPerson) {
        this.homelessPerson = homelessPerson;
    }

    public String gethospitalToBePlaced() {
        return hospitalToBePlaced;
    }

    public void sethospitalToBePlaced(String addressToBePlaced) {
        this.hospitalToBePlaced = addressToBePlaced;
    }

    public HospitalAllocationWorkRequest getHospitalAllocationWorkRequest() {
        return allocationWorkRequest;
    }

    public void setHospitalAllocationWorkRequest(HospitalAllocationWorkRequest allocationWorkRequest) {
        this.allocationWorkRequest = allocationWorkRequest;
    }

    @Override
    public String toString() {
        return getHomelessPerson() != null ? getHomelessPerson().getName() : "No name";
    }
}
