package oop;

//Tính đóng gói
public class User {
    //Thuộc tính
    private String name;
    private int age;
    private String phoneNumber;

    //Constructor duùng để khởi tạo name, age, phoneNumber
    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    //Phương thức
    //Getter và setter
    //Tạo phương thức public để lấy giá trị
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //Tao phương thức để update giá trị
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Tạo phương thức để hiển thị thông tin người dùng
    public void showInfo() {
        System.out.println("Username: " + name + "; Age: " + age + "; Phone number: " + phoneNumber);
    }
    public void welcomeMessage(){
        System.out.println("Welcome, " + name + "! Thanks for coming.");
    }
}
