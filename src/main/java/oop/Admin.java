package oop;
//Tinh kế thừa
public class Admin extends User {
    private String role;

    //Constructor
    public Admin(String name, int age, String phoneNumber, String role) {
        super(name, age, phoneNumber);
        this.role = role;
    }

    //Tạo phướng thức để lấy giá trị
    public String getRole() {
        return role;
    }

    //Tạo phương thưức để update giá tri
    public void setRole(String role) {
        this.role = role;
    }

    public void showAdminInfo() {
        showInfo();
        System.out.println("Role: " + role);
    }
}
