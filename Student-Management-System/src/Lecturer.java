public class Lecturer {
    private int lecturerId;
    private String lname;
    private String progName;
    private String progId;
    private String unit1name;
    private String unit1id;
    private String unit2name;
    private String unit2id;
    private String unit3name;
    private String unit3id;
    private String lpassword;
    


    public Lecturer(int lecturerId, String lname, String progName, String progId, String unit1name, String unit1id,
            String unit2name, String unit2id, String unit3name, String unit3id, String lpassword) {
        this.lecturerId = lecturerId;
        this.lname = lname;
        this.progName = progName;
        this.progId = progId;
        this.unit1name = unit1name;
        this.unit1id = unit1id;
        this.unit2name = unit2name;
        this.unit2id = unit2id;
        this.unit3name = unit3name;
        this.unit3id = unit3id;
        this.lpassword = lpassword;
    }




     // getters and setters





    




    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getName() {
        return lname;
    }

    public void setName(String lname) {
        this.lname = lname;
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public String getProgId() {
        return progId;
    }

    public void setProgid(String progid) {
        this.progId = progid;
    }

    public String getUnit1name() {
        return unit1name;
    }

    public void setUnit1name(String unit1name) {
        this.unit1name = unit1name;
    }

    public String getUnit1id() {
        return unit1id;
    }

    public void setUnit1id(String unit1id) {
        this.unit1id = unit1id;
    }

    public String getUnit2name() {
        return unit2name;
    }

    public void setUnit2name(String unit2name) {
        this.unit2name = unit2name;
    }

    public String getUnit2id() {
        return unit2id;
    }

    public void setUnit2id(String unit2id) {
        this.unit2id = unit2id;
    }

    public String getUnit3name() {
        return unit3name;
    }

    public void setUnit3name(String unit3name) {
        this.unit3name = unit3name;
    }

    public String getUnit3id() {
        return unit3id;
    }

    public void setUnit3id(String unit3id) {
        this.unit3id = unit3id;
    }

    public String getPassword() {
        return lpassword;
    }

    public void setPassword(String lpassword) {
        this.lpassword = lpassword;
    }

    public boolean login(String lname, String lpassword) {
        // Implement login logic here
        return this.lname.equals(lname) && this.lpassword.equals(lpassword);
    }

           public void enterMarks(Student student, Marks marks) {
            if (student.getProgramId() != progId) {
                System.out.println("Cannot enter marks for student in a different program");
                return;
            }
            if (marks.getUnit1Id() != unit1id && marks.getUnit2Id() != unit2id && marks.getUnit3Id() != unit3id) {
                System.out.println("Invalid unit IDs");
                return;
            }
            // enter marks logic here
        }

        public int getAge() {
            return 0;
        }




        public String getLecturerName() {
            return null;
        }
    }