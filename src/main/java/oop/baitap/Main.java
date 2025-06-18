package oop.baitap;

public class Main {
    public static void main(String[] args) {
        NhanVien nvsx = new NhanVienSanXuat(20);
        NhanVien nvvp = new NhanVienVanPhong(20);
        nvsx.showMessage();
        nvvp.showMessage();
    }
}
