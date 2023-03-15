import java.util.List;

public class Librarian {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.name.equals(username) && this.password.equals(password);
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

    // other methods and getters/setters here
}
