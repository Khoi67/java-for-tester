package oop.baitap2;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng tài khoản: ");
        int n = scanner.nextInt();
        System.out.println("--------------");
        TaiKhoan[] danhSachTaiKhoan = new TaiKhoan[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Tài khoản thứ " + (i+1));
            System.out.println("Loại tài khoản (1 - Tiết kiệm, 2 - Thanh toán)");
            int loai = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Số tài khoản: ");
            String soTk = scanner.nextLine();

            System.out.print("Chủ tài khoản: ");
            String chuTK = scanner.nextLine();

            System.out.print("Số dư: ");
            double soDu = scanner.nextDouble();

            if(loai == 1) {
                System.out.print("Lãi suất: ");
                double ls = scanner.nextDouble() / 100;
                danhSachTaiKhoan[i] = new TaiKhoanTietKiem(soTk, chuTK, soDu, ls);
            }else {
                danhSachTaiKhoan[i] = new TaiKhoanThanhToan(soTk, chuTK, soDu);
            }
        }
        System.out.println("Thông tin tài khoản");
        for(TaiKhoan tk : danhSachTaiKhoan){
            tk.hienThiThongTin();
        }
    }
}
