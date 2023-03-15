public class Book {
    private int bookId;
    private String bookName;
    private int yearPublished;
    private String author;
    private String ISSN;
    
    public Book(int bookId, String bookName, int yearPublished, String author, String ISSN) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.yearPublished = yearPublished;
        this.author = author;
        this.ISSN = ISSN;
    }
    
    // getters and setters
    
    public int getBookId() {
        return bookId;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getISSN() {
        return ISSN;
    }
    
    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
