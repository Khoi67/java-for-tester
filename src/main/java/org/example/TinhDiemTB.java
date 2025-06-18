package org.example;
import java.util.Scanner;

public class TinhDiemTB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm toán: ");
        float maths = scanner.nextFloat();
        System.out.print("Nhập điểm lý: ");
        float physics = scanner.nextFloat();
        System.out.print("Nhập điểm anh: ");
        float english = scanner.nextFloat();

        float total = (maths + physics + english)/3;
        System.out.println("Điểm trung bình là: " + total);

    }
}
