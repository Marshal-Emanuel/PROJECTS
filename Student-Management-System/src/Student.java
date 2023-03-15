import java.util.Date;

public class Student {
    private int regNo;
    private String name;
    private String parentName;
    private String parentContact;
    private Date dob;
    private String sex;
    private String religion;
    private String hometown;
    private String programName;
    private int programId;
    private String unit1Name;
    private int unit1Id;
    private String unit2Name;
    private int unit2Id;
    private String unit3Name;
    private int unit3Id;
    private String unit4Name;
    private int unit4Id;
    private String unit5Name;
    private int unit5Id;
    private String password;

    public Student(int regNo, String name, String parentName, String parentContact, Date dob,
                   String sex, String religion, String hometown, String programName, int programId,
                   String unit1Name, int unit1Id, String unit2Name, int unit2Id, String unit3Name,
                   int unit3Id, String unit4Name, int unit4Id, String unit5Name, int unit5Id,
                   String password) {
        this.regNo = regNo;
        this.name = name;
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
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.name.equals(username) && this.password.equals(password);
    }

    public void enterMarks(String unitName, int unitId, int marks) {
        // implement enterMarks method here
    }

    public void viewMarks() {
        // implement viewMarks method here
    }

    public int getProgramId() {
        return 0;
    }

    // other methods and getters/setters here
}
