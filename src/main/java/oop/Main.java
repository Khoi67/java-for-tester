package oop;

import oop.baitap.NhanVien;
import oop.baitap.NhanVienSanXuat;
import oop.baitap.NhanVienVanPhong;

public class Main {
    public static void main(String[] args) {
        User user = new User("Khoi", 22, "132467890");
        user.showInfo();
        user.welcomeMessage();

        Admin admin = new Admin("Ad1", 23, "0000000000", "Admin");
        admin.showAdminInfo();

        Guest guest = new Guest("Tin", 20, "123123123", "tin@gmail.com");
        guest.showInfo();
        guest.welcomeMessage();

        BaseUser user1 = new NormalUser("Nom", 18);
        user1.showMessage();

        NhanVien nvsx = new NhanVienSanXuat(20);
        NhanVien nvvp = new NhanVienVanPhong(20);
        nvsx.showMessage();
        nvvp.showMessage();

//        user.setName("Na");
//        user.setAge(21);
//        user.setPhoneNumber("0987654312");
//        user.showInfo();
    }
}
