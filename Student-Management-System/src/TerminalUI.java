import java.util.Scanner;

public class TerminalUI {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("1. Register a new student");
            System.out.println("2. Register a new lecturer");
            System.out.println("3. Register a new librarian");
            System.out.println("4. Add a book");
            System.out.println("5. Enter marks for a student");
            System.out.println("6. View student marks");
            System.out.println("7. Exit");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (option) {
                case 1:
                    // Code to register a new student
                    break;
                case 2:
                    // Code to register a new lecturer
                    break;
                case 3:
                    // Code to register a new librarian
                    break;
                case 4:
                    // Code to add a book
                    break;
                case 5:
                    // Code to enter marks for a student
                    break;
                case 6:
                    // Code to view student marks
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
    
}
