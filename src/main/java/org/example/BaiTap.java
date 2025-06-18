package org.example;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        //Viet chhuong trinh tinh luong cho phep nguoi dung nhap ten, luong 1 ngay, tong so ngay lam, in ra man hinh
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Họ và tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tiền lương 1 ngày: ");
        int salaryInDay = scanner.nextInt();
        System.out.print("Nhập tổng số ngày làm: ");
        int days = scanner.nextInt();

        System.out.println("Lương của " + name + " trong " + days + " ngày làm là: " + days * salaryInDay);

    }
}
