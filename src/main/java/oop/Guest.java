package oop;

//Tính đa hình: có nhìu hình thái, cùng 1 phương thức nhưng có nhiều cách xử lý khác nhau
public class Guest extends User {
    private String email;

    public Guest(String name, int age, String phoneNumber, String email) {
        super(name, age, phoneNumber);
        this.email = email;
    }
    @Override
    public void showInfo() {
        System.out.println("Email: " + email);
    }
    public void welcomeMessage() {
        System.out.println("Welcome Guest " + getName() + " limit features access!");
    }
}
