public class Admin extends Person {
    private String adminId;
    private String password;

    public Admin(String name, String email, String phone, String adminId, String password) {
        super(name, email, phone);
        this.adminId = adminId;
        this.password = password;
    }

    public boolean login(String adminId, String password) {
        if (this.adminId.equals(adminId) && this.password.equals(password)) {
            System.out.println("Welcome, " + this.getName() + "!");
            return true;
        } else {
            System.out.println("Incorrect admin ID or password.");
            return false;
        }
    }
}
