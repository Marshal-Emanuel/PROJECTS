import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class DatabaseConnection {
    private static Connection connection;

    public static void dbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stmgmtsys";
            String user = "root";
            String password = "emarshKmax";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection unsuccessful");
            e.printStackTrace();
        }
    }

   /*  public DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stmgmtsys";
            String user = "root";
            String password = "emarshKmax";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection unsuccessful");
            e.printStackTrace();
        }
    }*/
    
    public ResultSet executeQuery(String query) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        return statement.executeQuery();
    }
    
    public int executeUpdate(String query) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        return statement.executeUpdate();
    }
    
    public PreparedStatement prepareStatement(String query) throws SQLException {
        return connection.prepareStatement(query);
    }
    
    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static boolean authenticateAdmin(String adminName, String password) throws SQLException {
        dbConnection();
      PreparedStatement statement = connection.prepareStatement("SELECT * FROM admin WHERE Name = ? AND Password = ? ");
      boolean adminfound = false;
      //  String sql = "select * from admin where Name="+adminName+"and Password="+password+"";
      //Statement st = connection.createStatement();
      //ResultSet rs = st.executeQuery(sql);

        statement.setString(1, adminName);
        statement.setString(2, password);
        ResultSet rs = statement.executeQuery();
       // rs.next();
        if(rs.next()){
        String userFound =rs.getString("Name")+"  "+rs.getInt("AdminId");
        System.out.println("~~~~~User found~~~~~~");
        System.out.println("Administrator: " +userFound);      
        adminfound = true;
        }

        else{
            adminfound=false;
            System.out.println("***********user not found**********");
        }

        return adminfound;
       
           }
    
    public static void addStudent(Student student) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO student(name, regNo, parentName, parentContact, dob, sex, religion, hometown, programName, programId, unit1Name, unit1Id, unit2Name, unit2Id, unit3Name, unit3Id, unit4Name, unit4Id, unit5Name, unit5Id, spassword) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        statement.setString(1, student.getName());
        statement.setString(2, Student.getRegNo());
        statement.setString(3, student.getParentName());
        statement.setString(4, student.getParentContact());
        statement.setString(5, student.getDob());
        statement.setString(6, student.getSex());
        statement.setString(7, student.getReligion());
        statement.setString(8, student.getHometown());
        statement.setString(9, student.getProgramName());
        statement.setString(10, student.getProgramId());
        statement.setString(11, student.getUnit1Name());
        statement.setString(12, student.getUnit1Id());
        statement.setString(13, student.getUnit2Name());
        statement.setString(14, student.getUnit2Id());
        statement.setString(15, student.getUnit3Name());
        statement.setString(16, student.getUnit3Id());
        statement.setString(17, student.getUnit4Name());
        statement.setString(18, student.getUnit4Id());
        statement.setString(19, student.getUnit5Name());
        statement.setString(20, student.getUnit5Id());
        statement.setString(21, student.getSpassword());

        statement.executeUpdate();
    }
    
    public static void addLecturer(Lecturer lecturer) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO lecturer(LecturerId, Name, ProgramName, ProgramId, Unit1Name, Unit1Id, Unit2Name, Unit2Id, Unit3Name, Unit3Id, Password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        statement.setInt(1, lecturer.getLecturerId());
        statement.setString(2, lecturer.getName());
        statement.setString(3, lecturer.getProgName());
        statement.setString(4, lecturer.getProgId());
        statement.setString(5, lecturer.getUnit1name());
        statement.setString(6, lecturer.getUnit1id());
        statement.setString(7, lecturer.getUnit2name());
        statement.setString(8, lecturer.getUnit2id());
        statement.setString(9, lecturer.getUnit3name());
        statement.setString(10, lecturer.getUnit3id());
        statement.setString(11, lecturer.getPassword());
        statement.executeUpdate();
        System.out.println("\n*********Lecturer added successfuly************");
    }
    
    
    public static void addLibrarian(Librarian librarian) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("INSERT INTO librarian(LibrarianId, Name, Password) VALUES (?, ?, ?)");
        statement.setInt(1, librarian.getLibrarianId());
        statement.setString(2, librarian.getName());
        statement.setString(3, librarian.getPassword());
        statement.executeUpdate();
    }
    
    
    public static void addProgram(Program program) throws SQLException {
        dbConnection();
    PreparedStatement statement = connection.prepareStatement("INSERT INTO program(ProgramId, ProgramName, Unit1Name, Unit1Id, Unit2Name, Unit2Id, Unit3Name, Unit3Id, Unit4Name, Unit4Id, Unit5Name, Unit5Id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    statement.setString(1, program.getProgram_Id());
    statement.setString(2, program.getProgram_Name());
    statement.setString(3, program.getUnit1_Name());
    statement.setString(4, program.getUnit1_Id());
    statement.setString(5, program.getUnit2_Name());
    statement.setString(6, program.getUnit2_Id());
    statement.setString(7, program.getUnit3_Name());
    statement.setString(8, program.getUnit3_Id());
    statement.setString(9, program.getUnit4_Name());
    statement.setString(10, program.getUnit4_Id());
    statement.setString(11, program.getUnit5_Name());
    statement.setString(12, program.getUnit5_Id());
    statement.executeUpdate();
    System.out.println("Program added successfuly");
}

    
    public static void deleteStudent(String regNo) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM student WHERE regNo = ?");
        statement.setString(1, regNo);
        statement.executeUpdate();
    }
    
    public static void deleteLecturer(int lecturerId) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM lecturer WHERE LecturerId = ?");
        statement.setInt(1, lecturerId);
        statement.executeUpdate();
    }
    
    public static void deleteLibrarian(int librarianId) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM librarian WHERE LibrarianId = ?");
        statement.setInt(1, librarianId);
        statement.executeUpdate();
    }
    
    public static void deleteProgram(String program_Id) throws SQLException {
        dbConnection();
        PreparedStatement statement = connection.prepareStatement("DELETE FROM program WHERE ProgramId = ?");
        statement.setString(1, program_Id);
        statement.executeUpdate();
    }

        
          public static Student getStudentByName(String name, String spassword) throws SQLException {
            dbConnection();
           // PreparedStatement statement = connection.prepareStatement("SELECT s.id, s.name, s.age, p.id AS program_id, p.name AS program_name FROM students s JOIN programs p ON s.program_id = p.id WHERE s.username = ?");
           // statement.setString(1, name);

           // ResultSet resultSet = statement.executeQuery();
           Statement st = connection.createStatement();
           String sql = "select * from student where name='"+name+"' AND spassword='"+spassword+"'";
           ResultSet rs = st.executeQuery(sql);


            if (rs.next()) {
                String sname = rs.getString("Name");
                String regNo = rs.getString("RegNo");
                String parentName=rs.getString("ParentName");
                String parentContact=rs.getString("ParentContact");
                String dob=rs.getString("DOB");
                String sex=rs.getString("sex");
                String religion=rs.getString("Religion");
                String hometown=rs.getString("Hometown");
                String programId = rs.getString("ProgramId");
                String programName = rs.getString("ProgramName");
                String unit1Name=rs.getString("Unit1Name");
                String unit1Id=rs.getString("Unit1Id");
                String unit2Name=rs.getString("Unit2Name");
                String unit2Id=rs.getString("Unit2Id");
                String unit3Name=rs.getString("Unit3Name");
                String unit3Id=rs.getString("Unit3Id");
                String unit4Name=rs.getString("Unit4Name");
                String unit4Id=rs.getString("Unit4Id");
                String unit5Name=rs.getString("Unit5Name");
                String unit5Id=rs.getString("Unit5Id");
                String password=rs.getString("spassword");



       

               // Program program = new Program(programId, programName);
                return new Student(sname,regNo ,parentName, parentContact, dob, sex, religion, hometown, programName, programId, unit1Name, unit1Id, unit2Name, unit2Id, unit3Name, unit3Id, unit4Name, unit4Id, unit5Name, unit5Id, password);
            } else {
                return null;
            }
        }
        
        public static Lecturer getLecturerByUsername(String lname, String lpassword) throws SQLException {
            dbConnection();

            Statement st = connection.createStatement();
           String sql = "select * from lecturer where Name='"+lname+"' AND Password='"+lpassword+"'";

            
          //  PreparedStatement statement = connection.prepareStatement("SELECT l.id, l.name, l.age, l.unit FROM lecturers l JOIN users u ON l.username = u.username WHERE u.username = ?");
            //statement.setString(1, username);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {

                System.out.println("You are logged in as Lecturer");
                int lecturerId = rs.getInt("LecturerId");
                lname = rs.getString("Name");
                String  progName = rs.getString("ProgramName");
                String progId = rs.getString("ProgramId");
                String unit1name = rs.getString("Unit1Name");
                String unit1id = rs.getString("Unit1Id");
                String unit2name = rs.getString("Unit2Name");
                String unit2id = rs.getString("Unit2Id");
                String unit3name = rs.getString("Unit3Name");
                String unit3id = rs.getString("Unit3Id");
                lpassword ="";
                
                return new Lecturer(lecturerId, lname, progName, progId, unit1name, unit1id, unit2name, unit2id, unit3name, unit3id, lpassword);
            } else {
                return null;
            }
        }
        
       public static Librarian getLibrarianByUsername(String librarianName, String libpassword) throws SQLException {
            dbConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * from librarian where Name=? and Password=?");
            statement.setString(1, librarianName);
            statement.setString(2,libpassword);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("LibrarianId");
                String name = resultSet.getString("Name");
                System.out.println("\t\n******You are logged in as librarian**********");
                System.out.println("\tName: " + name);
                System.out.println("\tRegistration Number: " + id);
            
               return new Librarian(id, name);
            } else {
                return null;
            }
        }


        public static void enterStudentMarks(String regNo, int exam1, int cat1, int exam2, int cat2, int exam3, int cat3, int exam4, int cat4, int exam5, int cat5){
      //  public static void enterStudentMarks(int regNo, String programName, int program_Id, String unit1Name, int unit1_Id, String unit2Name, int unit2_Id, String unit3Name, int unit3_Id, String unit4Name, int unit4_Id, String unit5Name, int unii5_Id, double cat1, double cat2, double cat3, double cat4, double cat5, double exam1, double exam2, double exam3, double exam4, double exam5){
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            
            try{
                //establishing database connection
                //connection = DriverManager.getConnection(Marks.dbUrl, Marks.dbUsername, Marks.dbPassword);
                String url = "jdbc:mysql://localhost:3306/stmgmtsys";
                String user = "root";
                String password = "emarshKmax";
                connection = DriverManager.getConnection(url, user, password);
               dbConnection();
                
                //creating the insert statement
                String updateQuery = "UPDATE student SET Cat1=?, Cat2=?, Cat3=?, Cat4=?, Cat5=?, Exam1=?, Exam2=?, Exam3=?, Exam4=?, Exam5=? WHERE RegNo=?";
                

                
                //preparing the statement
                PreparedStatement statement = connection.prepareStatement(updateQuery);
                
                //setting the parameter values
                
                statement.setDouble(1, cat1);
                statement.setDouble(2, cat2);
                statement.setDouble(3, cat3);
                statement.setDouble(4, cat4);
                statement.setDouble(5, cat5);
                statement.setDouble(6, exam1);
                statement.setDouble(7, exam2);
                statement.setDouble(8, exam3);
                statement.setDouble(9, exam4);
                statement.setDouble(10, exam5);
                statement.setString(11, updateQuery);

                
                //executing the statement
                statement.executeUpdate();
                
                System.out.println("Student marks added successfully!");
            }
            catch(SQLException e){
                System.out.println("Error while inserting student marks: " + e.getMessage());
            }
            finally{
                try{
                    if(preparedStatement != null){
                        preparedStatement.close();
                    }
                    if(connection != null){
                        connection.close();
                    }
                }
                catch(SQLException e){
                    System.out.println("Error while closing database connection: " + e.getMessage());
                }
            }
        }
        


        public static void getResultsByStudentId(String regNo) {
            dbConnection();
            try (Statement st = connection.createStatement()) {
                String sql = "select * from student where regNo="+regNo;
                   ResultSet rs = st.executeQuery(sql);

                   if(rs.next()){

                    int cat1=rs.getInt("cat1");
                    int cat2=rs.getInt("cat2");
                    int cat3=rs.getInt("cat3");
                    int cat4=rs.getInt("cat4");
                    int cat5=rs.getInt("cat5");
                    int exam1=rs.getInt("exam1");
                    int exam2=rs.getInt("exam2");
                    int exam3=rs.getInt("exam3");
                    int exam4=rs.getInt("exam4");
                    int exam5=rs.getInt("exam5");

                    int total1 = cat1+exam1;
                    int total2 = cat2+exam2;
                    int total3 = cat3+exam3;
                    int total4 = cat1+exam4;
                    int total5 = cat5+exam5;

                    int average=((total1+total2+total3+total4+total5)/5);

                    String grade;

                    if (average > 70) {
                        grade = "A";
                    } else if (average > 60) {
                        grade = "B";
                    } else if (average > 50) {
                        grade = "C";
                    } else if (average > 40) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }


                    System.out.println("Cat1: "+cat1);
                    System.out.println("Cat2: "+cat2);
                    System.out.println("Cat3: "+cat3);
                    System.out.println("Cat4: "+cat4);
                    System.out.println("Cat5: "+cat5);
                    System.out.println("Exam1: "+exam1);
                    System.out.println("Exam2: "+exam2);
                    System.out.println("Exam3: "+exam3);
                    System.out.println("Exam4: "+exam4);
                    System.out.println("Exam5: "+exam5);
                    System.out.println("Points:" +average);
                    System.out.println("Grade:" +grade);

                   }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    
        }

        public static void getAvailableBooks() {

             Statement st;
            try {
                st = connection.createStatement();
                String sql = "select * from student";
           ResultSet rs = st.executeQuery(sql);
           if (rs.next()){
            // code to get books from the database

           }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           
           
        }
    }
        