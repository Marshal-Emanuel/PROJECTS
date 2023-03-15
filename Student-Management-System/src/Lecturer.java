public class Lecturer {
    private int lecturerId;
    private String name;
    private String programName;
    private int programId;
    private String unit1Name;
    private int unit1Id;
    private String unit2Name;
    private int unit2Id;
    private String unit3Name;
    private int unit3Id;
    private String password;

    public Lecturer(int lecturerId, String name, String programName, int programId, String unit1Name, int unit1Id,
                    String unit2Name, int unit2Id, String unit3Name, int unit3Id, String password) {
        this.lecturerId = lecturerId;
        this.name = name;
        this.programName = programName;
        this.programId = programId;
        this.unit1Name = unit1Name;
        this.unit1Id = unit1Id;
        this.unit2Name = unit2Name;
        this.unit2Id = unit2Id;
        this.unit3Name = unit3Name;
        this.unit3Id = unit3Id;
        this.password = password;
    }

    // getters and setters

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public String getUnit1Name() {
        return unit1Name;
    }

    public void setUnit1Name(String unit1Name) {
        this.unit1Name = unit1Name;
    }

    public int getUnit1Id() {
        return unit1Id;
    }

    public void setUnit1Id(int unit1Id) {
        this.unit1Id = unit1Id;
    }

    public String getUnit2Name() {
        return unit2Name;
    }

    public void setUnit2Name(String unit2Name) {
        this.unit2Name = unit2Name;
    }

    public int getUnit2Id() {
        return unit2Id;
    }

    public void setUnit2Id(int unit2Id) {
        this.unit2Id = unit2Id;
    }

    public String getUnit3Name() {
        return unit3Name;
    }

    public void setUnit3Name(String unit3Name) {
        this.unit3Name = unit3Name;
    }

    public int getUnit3Id() {
        return unit3Id;
    }

    public void setUnit3Id(int unit3Id) {
        this.unit3Id = unit3Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String name, String password) {
        // Implement login logic here
        return this.name.equals(name) && this.password.equals(password);
    }

           public void enterMarks(Student student, Marks marks) {
            if (student.getProgramId() != programId) {
                System.out.println("Cannot enter marks for student in a different program");
                return;
            }
            if (marks.getUnit1Id() != unit1Id && marks.getUnit2Id() != unit2Id && marks.getUnit3Id() != unit3Id) {
                System.out.println("Invalid unit IDs");
                return;
            }
            // enter marks logic here
        }
    }