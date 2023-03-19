public class Admin {
    private String adminName;
    private String adminId;
    private String password;


    

    public Admin(String adminName, String adminId, String password) {
        this.adminName = adminName;
        this.adminId = adminId;
        this.password = password;
    }



    public String getAdminName() {
        return adminName;
    }




    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }




    public String getAdminId() {
        return adminId;
    }




    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }




    public String getPassword() {
        return password;
    }




    public void setPassword(String password) {
        this.password = password;
    }



    public boolean login(String adminId, String password) {
        if (this.adminId.equals(adminId) && this.password.equals(password)) {
            System.out.println("Welcome, " + this.getAdminName() + "!");
            return true;
        } else {
            System.out.println("Incorrect admin ID or password.");
            return false;
        }
    }
}
