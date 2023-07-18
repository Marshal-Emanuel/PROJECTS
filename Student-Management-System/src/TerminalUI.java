import java.util.Scanner;



//import java.util.jar.Attributes.Name;
//import java.util.List;
import java.sql.SQLException;
//import java.util.ArrayList;


public class TerminalUI {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt  the user   for their type of user

        int mainMenu=0;
        while(mainMenu!=808)
        {

         System.out.println("Please select your type of user:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Lecturer");
            System.out.println("4. Librarian");
            
            int userType = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            // Authenticate the user against the database
        
                switch (userType) {
                    case 1: // Admin

                    
                // Prompt the user for their login credentials
            System.out.print("Please enter your username: ");
            String adminName = scanner.nextLine();
            
            System.out.print("Please enter your password: ");
            String password = scanner.nextLine();


                        boolean adminLogin;
                        try {
                            adminLogin = DatabaseConnection.authenticateAdmin(adminName, password);

                            System.out.println(adminLogin);

                            if (adminLogin==true) 
                        {

                            System.out.println(adminLogin);

                                int adminMenu=0;
                                while(adminMenu!=404){
                                System.out.println("\n\n************You are loged in as Admin************");
                                System.out.println("\tPlease select an option:");
                                System.out.println("1. Add a student");
                                System.out.println("2. Add a lecturer");
                                System.out.println("3. Add a librarian");
                                System.out.println("4. Add a program");
                                System.out.println("5. Delete a student");
                                System.out.println("6. Delete a lecturer");
                                System.out.println("7. Delete a librarian");
                                System.out.println("8. Delete a program");
                                System.out.println("9. Exit");
                                
                                int option = scanner.nextInt();
                                scanner.nextLine(); // Consume the newline character
                                
                                switch (option) {
                                    case 1:
                                        // Code to add a student
                                        System.out.println("******Student Registration************");
                                        System.out.print("Please enter the student name: ");
                                        String name = scanner.nextLine();
                                        
                                        System.out.print("Please enter the reg Number ");
                                        String regNo = scanner.nextLine();
                                        scanner.nextLine(); 
                                        
                                        System.out.print("Please enter the student's parent name: ");
                                        String parentName = scanner.nextLine();
                                        
                                        System.out.print("Please enter the parent contact: ");
                                        String parentContact = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the student's D.O.B (date of bith): ");
                                        String dob = scanner.nextLine();
                                        
                                        System.out.print("Please enter the student gender: ");
                                        String sex = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the student's religion: ");
                                        String religion = scanner.nextLine();
                                        
                                        System.out.print("Please enter the students hometown: ");
                                        String hometown = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the Program the student takes: ");
                                        String programName = scanner.nextLine();
                                        
                                        System.out.print("Please enter the program Id: ");
                                        String programId = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the Unit 1 name the student takes: ");
                                        String unit1Name = scanner.nextLine();
                                        
                                        System.out.print("Please enter the unit 1 id: ");
                                        String unit1Id = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the Unit 2 name the student takes: ");
                                        String unit2Name = scanner.nextLine();
                                        
                                        System.out.print("Please enter the unit 2 id: ");
                                        String unit2Id = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the Unit 3 name the student takes: ");
                                        String unit3Name = scanner.nextLine();
                                        
                                        System.out.print("Please enter the unit 3 id: ");
                                        String unit3Id = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the Unit 4 name the student takes: ");
                                        String unit4Name = scanner.nextLine();
                                        
                                        System.out.print("Please enter the unit 4 id: ");
                                        String unit4Id = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the Unit 5 name the student takes: ");
                                        String unit5Name = scanner.nextLine();
                                        
                                        System.out.print("Please enter the unit 5 id: ");
                                        String unit5Id = scanner.nextLine();
                                        scanner.nextLine();
                                        
                                        System.out.print("Please enter the password for the student login: ");
                                        String spassword = scanner.nextLine();
                                        
                                        Student student = new Student(name, regNo, parentName, parentContact, dob, sex, religion, hometown, programName, programId, unit1Name, unit1Id, unit2Name, unit2Id, unit3Name, unit3Id, unit4Name, unit4Id, unit5Name, unit5Id, spassword);
                                        try {
                                            DatabaseConnection.addStudent(student);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("~~~\t\nStudent added successfully.");
                                        System.out.println("\nChoose an option to continue");
                                        System.out.println("1.Continue");
                                        System.out.println("2. QUIT");

                                        int choice =scanner.nextInt();
                                        adminMenu = choice;
                                        mainMenu = choice;

                                        if(choice==2){
                                            System.out.println("QUITING.....");
                                            System.exit(0);
                                        }
                                        else if(choice==1){
                                            //
                                            
                                        }
                                        
                                        break;
        
        
        
                                    case 2:
                                        // Code to add a lecturer
                                        System.out.println("\t\n********Lecturer Registration*********");

                                        System.out.print("Enter the lecturer Id: ");
                                                int lecturerId = scanner.nextInt();
                                                scanner.nextLine();
                                        System.out.print("Please enter the lecturer name: ");
                                                String lname = scanner.nextLine();

                                                System.out.print("Enter the Program Name: ");
                                                String progName = scanner.nextLine();

                                                System.out.print("Enter the program ID: ");
                                                String progId = scanner.nextLine();

                                                System.out.print("Enter the Unit 1 Name: ");
                                                String unit1name = scanner.nextLine();

                                                System.out.print("Enter the Unit 1 ID: ");
                                                String unit1id = scanner.nextLine();

                                                System.out.print("Enter the Unit 2 Name: ");
                                                String unit2name = scanner.nextLine();

                                                System.out.print("Enter the Unit 2 ID: ");
                                                String unit2id = scanner.nextLine();

                                                System.out.print("Enter the Unit 3 Name: ");
                                                String unit3name = scanner.nextLine();

                                                System.out.print("Enter the Unit 3 ID: ");
                                                String unit3id = scanner.nextLine();

                                                System.out.print("Enter the Password for the lecturer's login: ");
                                                String lpassword = scanner.nextLine();

                                                Lecturer lecturer = new Lecturer(lecturerId, lname, progName, progId, unit1name, unit1id, unit2name,unit2id ,unit3name, unit3id, lpassword);

                                        try {
                                            DatabaseConnection.addLecturer(lecturer);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("\n\t******Lecturer added successfully.******");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                     choice =scanner.nextInt();
                                    adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        //
                                        
                                    }
                                        break;
                                    case 3:
                                        // Code to add a librarian
                                        System.out.println("\t\n***********Librarian Registration*************");
                                        System.out.print("Please enter the librarian name: ");
                                        String librarianName = scanner.nextLine();
                                        
                                        System.out.print("Enter the Password for the librarian's login: ");
                                        String libpassword = scanner.nextLine();
                                        
                                        System.out.println("Enter the librarian Id: ");
                                        int librarianId = scanner.nextInt();
                                        //scanner.nextLine();

                                        Librarian librarian = new Librarian(librarianName, libpassword, librarianId);

                                        try {
                                            DatabaseConnection.addLibrarian(librarian);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("Librarian added successfully.");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                    choice =scanner.nextInt();
                                    adminMenu = 404;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                      //  System.exit(0);
                                      adminMenu=404;
                                    }
                                    else if(choice==1){
                                        //
                                        
                                    }
                                        break;
                                    case 4:
                                        // Code to add a program

                                        System.out.println("\t\n*************Program Addition**********");
                                        System.out.print("Please enter the program name: ");
                                        String program_Name = scanner.nextLine();

                                            System.out.print("Please enter the program Id: ");
                                            String program_Id = scanner.nextLine();

                                            System.out.print("Please enter the Unit 1 name : ");
                                            String unit1_Name = scanner.nextLine();

                                            System.out.print("Please enter the unit 1 id: ");
                                            String  unit1_Id = scanner.nextLine();

                                            System.out.print("Please enter the Unit 2 name : ");
                                            String unit2_Name = scanner.nextLine();

                                            System.out.print("Please enter the unit 2 id: ");
                                            String  unit2_Id = scanner.nextLine();

                                            System.out.print("Please enter the Unit 3 name : ");
                                            String unit3_Name = scanner.nextLine();

                                            System.out.print("Please enter the unit 3 id: ");
                                            String  unit3_Id = scanner.nextLine();

                                            System.out.print("Please enter the Unit 4 name : ");
                                            String unit4_Name = scanner.nextLine();

                                            System.out.print("Please enter the unit 4 id: ");
                                            String  unit4_Id = scanner.nextLine();

                                            System.out.print("Please enter the Unit 5 name: ");
                                            String unit5_Name = scanner.nextLine();

                                            System.out.print("Please enter the unit 5 id: ");
                                            String  unit5_Id = scanner.nextLine();

                                            Program program = new Program(program_Name, program_Id, unit1_Name, unit1_Id, unit2_Name, unit2_Id, unit3_Name, unit3_Id, unit4_Name, unit4_Id, unit5_Name, unit5_Id);

                                        try {
                                            DatabaseConnection.addProgram(program);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("\t\n******Program added successfully.******");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                     choice =scanner.nextInt();
                                    adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        //
                                        
                                    }
                                        break;
                                    case 5:
                                        // Code to delete a student
                                        System.out.println("\t\n**********Student deletion**************");
                                        System.out.print("Please enter the student ID: ");
                                        regNo = scanner.nextLine();
                                        scanner.nextLine(); // Consume the newline character
                                        
                                        try {
                                            DatabaseConnection.deleteStudent(regNo);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("\n\t*****Student deleted successfully.****");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                     choice =scanner.nextInt();
                                    adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        //
                                        
                                    }
                                        break;
                                        case 6:
                                        // Code to delete a lecturer
                                        {
                                            System.out.println("\t\n****lecturer deletion");
                                        System.out.print("Please enter the lecturer ID: ");
                                        lecturerId = scanner.nextInt();}
                                        scanner.nextLine(); // Consume the newline character
                                        
                                        try {
                                            DatabaseConnection.deleteLecturer(lecturerId);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("******Lecturer deleted successfully.**********");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                    choice =scanner.nextInt();
                                    adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        //
                                        
                                    }
                                        break;
                                    case 7:
                                        // Code to delete a librarian
                                        System.out.println("\t\n****Librarian deletion******");
                                        System.out.print("Please enter the librarian ID: ");
                                        int librarianID = scanner.nextInt();
                                        scanner.nextLine(); // Consume the newline character
                                        
                                        try {
                                            DatabaseConnection.deleteLibrarian(librarianID);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("********Librarian deleted successfully.*******");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                    choice =scanner.nextInt();
                                    adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        //
                                    
                                    }
                                        break;
                                    case 8:
                                        // Code to delete a program
                                        System.out.println("\t\n********Program deletion*********");
                                        System.out.print("Please enter the program ID: ");
                                        program_Id = scanner.nextLine();
                                        scanner.nextLine(); // Consume the newline character
                                        
                                        try {
                                            DatabaseConnection.deleteProgram(program_Id);
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                        
                                        System.out.println("********Program deleted successfully.*********");
                                        System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                    choice =scanner.nextInt();
                                    adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        //
                                      
                                    }
                                        break;
                                    case 9:
                                        // Exit the program
                                        System.out.println("Goodbye!");
                                        System.exit(0);
                                        mainMenu=404;
                                        break;
                                    default:
                                        System.out.println("Invalid option.");
                                        break;

                                        
                                }
                            }
                                
                            }
                            else{
                                System.out.println("Or invalid login credentials");
                                mainMenu=0;
                            }
                        } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }/////*** */
                

                    case 2:
                    // Student

                        // Prompt the user for their login credentials
            System.out.println("\t\n\n******Student Login :) *****");           
            System.out.print("\tPlease enter your username: ");
            String name = scanner.nextLine();
            
            System.out.print("\tPlease enter your password: ");
            String spassword = scanner.nextLine();

         // Retrieve the student's information from the database
                        Student student;
                        try {
                            student = DatabaseConnection.getStudentByName(name, spassword);

                            System.out.println("Name: " + student.getName());
                            System.out.println("Registration Number: " + Student.getRegNo());
                            System.out.println("Registered Program: " + student.getProgramName());
                            System.out.println("Program code: " + student.getProgramId());
                            System.out.println("Unit 1 name: " + student.getUnit1Name());
                            System.out.println("Unit 2 name: " + student.getUnit2Name());
                            System.out.println("Unit 3 name: " + student.getUnit3Name());
                            System.out.println("Unit 4 name: " + student.getUnit4Name());
                            System.out.println("Unit 5 name: " + student.getUnit5Name());
                            
                        } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
         //Program program = DatabaseConnection.getProgramById(student.getProgramID());
         //List<U nit> units = DatabaseConnection.getUnitsByProgramId(program.getId());
        
         // Display the student's information
 
        

        
            // Prompt the user for an action
            System.out.println("Please select an option:");
            System.out.println("1. View Results");
            System.out.println("2. Borrow a Book");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (option) {
                case 1: // View Results


            DatabaseConnection.getResultsByStudentId(Student.getRegNo());
                // Retrieve the student's results from the database            
            
                break;

            case 2: // Borrow a Book
                // Retrieve the list of available books from the database
                DatabaseConnection.getAvailableBooks();
                
                // Display the list of available books
            System.out.println("Available Books:");
            // for (Book book : availableBooks) {
            //       System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            //  }
                
                // Prompt the user to select a book
            //  System.out.print("Please enter the title of the book you would like to borrow: ");
            // String bookTitle = scanner.nextLine();
                
                // Borrow the book from the database
                //if (DatabaseConnection.borrowBook(student.getId(), bookTitle)) {
                //  System.out.println("Book borrowed successfully.");
                //} else {
                //  System.out.println("Book not available.");
                //}
                break;
            default:
                System.out.println("Invalid option.");
                break;
                
        }
        break;

                    case 3: // Lecturer
                        // Code to display the lecturer's information and courses
                        System.out.println("\t\n\n******Lecturer login*******");           
                        System.out.print("\tPlease enter your username: ");
                        String lname = scanner.nextLine();
                        
                        System.out.print("\tPlease enter your password: ");
                        String lpassword = scanner.nextLine();
                        Lecturer lecturer;
                        try {
                            lecturer = DatabaseConnection.getLecturerByUsername(lname, lpassword);

                            System.out.println("Name: " + lecturer.getName());
                            System.out.println("Registration Number: " + lecturer.getLecturerId());
                            System.out.println("Registered Program: " + lecturer.getProgName());
                            System.out.println("Program code: " + lecturer.getProgId());
                            System.out.println("Unit 1 name: " + lecturer.getUnit1name());
                            System.out.println("Unit 2 name: " + lecturer.getUnit2name());
                            System.out.println("Unit 3 name: " + lecturer.getUnit3name());

                            System.out.println("Enter 1 to enter student marks");
                            String exammarks=scanner.nextLine();
                            

                            if(exammarks.equals("1")){

                                System.out.println("\t\n *************Marks entry***********");
                                

                                           
                                System.out.println("Enter the student registration number: ");
                                //scanner.next();
                                String regNo = scanner.nextLine();
                                
                                System.out.println("Enter cat 1 marks: ");
                                int cat1 = scanner.nextInt();
                                scanner.next();
                                
                                System.out.println("Enter cat 2 marks: ");
                                int cat2 = scanner.nextInt();
                                
                                System.out.println("Enter cat 3 marks: ");
                                int cat3 = scanner.nextInt();
                                
                                System.out.println("Enter cat 4 marks: ");
                                int cat4 = scanner.nextInt();
                                
                                System.out.println("Enter cat 5 marks: ");
                                int cat5 = scanner.nextInt();
                                
                                System.out.println("Enter exam 1 marks: ");
                                int exam1 = scanner.nextInt();
                                
                                System.out.println("Enter exam 2 marks: ");
                                int exam2 = scanner.nextInt();
                                
                                System.out.println("Enter exam 3 marks: ");
                                int exam3 = scanner.nextInt();
                                
                                System.out.println("Enter exam 4 marks: ");
                                int exam4 = scanner.nextInt();
                                
                                System.out.println("Enter exam 5 marks: ");
                                int exam5 = scanner.nextInt();

                                System.out.println(regNo+"reg number");
                                System.out.println(cat1);
                                
                                // create a new Student object with the input values
                                
                                
                                //Student marks = new Student(regNo,exam1, cat1, exam2, cat2, exam3, cat3, exam4, cat4, exam5, cat5);
                                DatabaseConnection.enterStudentMarks(regNo,exam1, cat1, exam2, cat2, exam3, cat3, exam4, cat4, exam5, cat5);



                            }
                           
                            
                        } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 4: // Librarian
                        // Code to display the librarian's information and books
                        System.out.println("\t\n\n******Librarian login*******");           
                        System.out.print("\tPlease enter your username: ");
                        String librarianName = scanner.nextLine();
                        
                        System.out.print("\tPlease enter your password: ");
                        String libpassword = scanner.nextLine();
                        Librarian librarian;

                        try{
                        librarian = DatabaseConnection.getLibrarianByUsername(librarianName, libpassword);

                           
                        }
                     catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                        break;
                    default:
                        System.out.println("Invalid user type.");
                        break;
                }

                System.out.println("\nChoose an option to continue");
                                    System.out.println("1.Continue");
                                    System.out.println("2. QUIT");

                                    int choice =scanner.nextInt();
                                    //adminMenu = choice;
                                    mainMenu = choice;

                                    if(choice==2){
                                        System.out.println("QUITING.....");
                                        System.exit(0);
                                    }
                                    else if(choice==1){
                                        
                                        
                                    }
                                    
    }   
    

    }
}
    


        
                               
    
