package oop;

//Tính trừu tượng là 1 haành vi trong lớp đối tượng ch được hoàn chỉnh
public abstract class BaseUser {
    private String name;
    private int age;

    //Constructor
    public BaseUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //Định nghĩa ra phương thức trừu tuượng (Kh có nội dung, yêu cầu lớp định nghĩa)
    public abstract void showMessage();

}
