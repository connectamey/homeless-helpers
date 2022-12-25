package Business;

/**
 *
 * @author amey
 */
public class HomelessPerson {

    private int PersonID;
    private String name;
    private String dob;
    private String city;
    private String currentAddress;
    private String SSNNo;
    private String contactNo;
    private String emailAddress;
    private int dependents;
    private String qualifications;
    private String accomplishments;
    private String employmentStatus;
    private int income;
    private String gender;
    private boolean hasCriminalRecord;
    private boolean majorIllness;
    private boolean carrierDisease;
    private boolean geneticDisease;
    private String preferredLocation;
    private static int counter = 0;

    public HomelessPerson(String name, String dob, String city, String address, String SSNNo, String contactNo, String emailAddress, int dependents, String qualifications, String accomplishments, String employmentStatus, int income, String gender, boolean hasCriminalRecord, boolean majorIllness, boolean carrierDisease, boolean geneticDisease, String prefLocation) {
        this.name = name;
        this.dob = dob;
        this.city = city;
        this.currentAddress = address;
        this.SSNNo = SSNNo;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
        this.dependents = dependents;
        this.qualifications = qualifications;
        this.accomplishments = accomplishments;
        this.employmentStatus = employmentStatus;
        this.income = income;
        this.gender = gender;
        this.hasCriminalRecord = hasCriminalRecord;
        this.majorIllness = majorIllness;
        this.carrierDisease = carrierDisease;
        this.geneticDisease = geneticDisease;
        this.preferredLocation = prefLocation;
        PersonID = counter;
        ++counter;
    }

    public int getPersonID() {
        return PersonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getSSNNo() {
        return SSNNo;
    }

    public void setSSNNo(String SSNNo) {
        this.SSNNo = SSNNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getAccomplishments() {
        return accomplishments;
    }

    public void setAccomplishments(String accomplishments) {
        this.accomplishments = accomplishments;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasCriminalRecord() {
        return hasCriminalRecord;
    }

    public void setHasCriminalRecord(boolean hasCriminalRecord) {
        this.hasCriminalRecord = hasCriminalRecord;
    }

    public boolean isMajorIllness() {
        return majorIllness;
    }

    public void setMajorIllness(boolean majorIllness) {
        this.majorIllness = majorIllness;
    }

    public boolean isCarrierDisease() {
        return carrierDisease;
    }

    public void setCarrierDisease(boolean carrierDisease) {
        this.carrierDisease = carrierDisease;
    }

    public boolean isGeneticDisease() {
        return geneticDisease;
    }

    public void setGeneticDisease(boolean geneticDisease) {
        this.geneticDisease = geneticDisease;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public String toString() {
        return name;
    }

}
