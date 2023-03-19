
public class Student {
    private String name;
    private static String regNo;
    private String parentName;
    private String parentContact;
    private String dob;
    private String sex;
    private String religion;
    private String hometown;
    private String programName;
    private String programId;
    private String unit1Name;
    private String unit1Id;
    private String unit2Name;
    private String unit2Id;
    private String unit3Name;
    private String unit3Id;
    private String unit4Name;
    private String unit4Id;
    private String unit5Name;
    private String unit5Id;
    private String spassword;
    
    public Student(String name, String regNo, String parentName, String parentContact, String dob, String sex,
            String religion, String hometown, String programName, String programId, String unit1Name, String unit1Id,
            String unit2Name, String unit2Id, String unit3Name, String unit3Id, String unit4Name, String unit4Id,
            String unit5Name, String unit5Id, String spassword) {
        this.name = name;
        Student.regNo = regNo;
        this.parentName = parentName;
        this.parentContact = parentContact;
        this.dob = dob;
        this.sex = sex;
        this.religion = religion;
        this.hometown = hometown;
        this.programName = programName;
        this.programId = programId;
        this.unit1Name = unit1Name;
        this.unit1Id = unit1Id;
        this.unit2Name = unit2Name;
        this.unit2Id = unit2Id;
        this.unit3Name = unit3Name;
        this.unit3Id = unit3Id;
        this.unit4Name = unit4Name;
        this.unit4Id = unit4Id;
        this.unit5Name = unit5Name;
        this.unit5Id = unit5Id;
        this.spassword = spassword;
    }

    public Student(int regNo2, int exam1, int cat1, int exam2, int cat2, int exam3, int cat3, int exam4, int cat4,
            int exam5, int cat5) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        Student.regNo = regNo;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentContact() {
        return parentContact;
    }

    public void setParentContact(String parentContact) {
        this.parentContact = parentContact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getUnit1Name() {
        return unit1Name;
    }

    public void setUnit1Name(String unit1Name) {
        this.unit1Name = unit1Name;
    }

    public String getUnit1Id() {
        return unit1Id;
    }

    public void setUnit1Id(String unit1Id) {
        this.unit1Id = unit1Id;
    }

    public String getUnit2Name() {
        return unit2Name;
    }

    public void setUnit2Name(String unit2Name) {
        this.unit2Name = unit2Name;
    }

    public String getUnit2Id() {
        return unit2Id;
    }

    public void setUnit2Id(String unit2Id) {
        this.unit2Id = unit2Id;
    }

    public String getUnit3Name() {
        return unit3Name;
    }

    public void setUnit3Name(String unit3Name) {
        this.unit3Name = unit3Name;
    }

    public String getUnit3Id() {
        return unit3Id;
    }

    public void setUnit3Id(String unit3Id) {
        this.unit3Id = unit3Id;
    }

    public String getUnit4Name() {
        return unit4Name;
    }

    public void setUnit4Name(String unit4Name) {
        this.unit4Name = unit4Name;
    }

    public String getUnit4Id() {
        return unit4Id;
    }

    public void setUnit4Id(String unit4Id) {
        this.unit4Id = unit4Id;
    }

    public String getUnit5Name() {
        return unit5Name;
    }

    public void setUnit5Name(String unit5Name) {
        this.unit5Name = unit5Name;
    }

    public String getUnit5Id() {
        return unit5Id;
    }

    public void setUnit5Id(String unit5Id) {
        this.unit5Id = unit5Id;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    
    // other methods and getters/setters here
}
