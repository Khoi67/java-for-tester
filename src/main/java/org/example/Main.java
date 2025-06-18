package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World!!!");

        //Lệnh nhập
        Scanner scanner = new Scanner(System.in);

        //Kiểu dữ liệu
        int age = 22;
        double salary = 10.000000;
        String name = "Khoi";
        boolean isTrue = true;

        //Hằng số - giá trị kh đổi
        final double pi = 3.14159;

        //Xuat ra man hinh ten nguoi nhap
//        System.out.print("Nhap Ho va ten: ");
//        String name1 = scanner.nextLine();
//        System.out.println("Xin chao " + name1);

        // Xuat ra man hinh Ten, Lop, Tuoi(scanner.nextInt()) cua sinh vien
        System.out.print("Nhap Ho va ten sinh vien: ");
        String name2 = scanner.nextLine();
        System.out.print("Nhap Lop cua sinh vien: ");
        String classroom = scanner.nextLine();
        System.out.print("Nhap Tuoi cua sinh vien: ");
        int age2 = scanner.nextInt();
        System.out.println("Sinh vien " + name2 + " hoc lop " + classroom + " va co " + age2 + " tuoi");
    }
}