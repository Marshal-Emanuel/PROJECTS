import java.util.List;

public class Librarian {
    private String librarianName;
    private String libpassword;
    private int librarianId;
    
    public Librarian(String librarianName, String libpassword, int librarianId) {
        this.librarianName = librarianName;
        this.libpassword = libpassword;
        this.librarianId=librarianId;
    }

    public Librarian(int id, String name) {
    }

    public boolean login(String librarianName, String libpassword) {
        return this.librarianName.equals(libpassword) && this.libpassword.equals(libpassword);
    }

    public void addBook(Book book) {
        // implement addBook method here
    }

    public void removeBook(Book book) {
        // implement removeBook method here
    }

    public List<Book> searchBook(String title) {
        // implement searchBook method here
        return null;
    }

    public String getName() {
        return librarianName;
    }

    public void setName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getPassword() {
        return libpassword;
    }

    public void setPassword(String libpassword) {
        this.libpassword =libpassword;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId =librarianId;
    }

    // other methods and getters/setters here
}
