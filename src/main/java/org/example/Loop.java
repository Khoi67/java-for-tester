package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        vòng lặp while
//        giá trị ban đầu
//        while(điều kiện){
//            thực hiện logic
//
//            thay đổi giá trị ban đầu
//        }

        //yêu cầu: in ra 5 dòng hello world
//        int i = 1; //giá trị ban đầu
//        while(i <= 5){ // điều kiện thực hiện vòng lặp
//            System.out.println("Hello world"); // thực hiện yêu cầu
//            i++; // i = i + 1 hoặc i += 1      thay đổi giá trị ban đầu
//        }
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vô số lần: ");
//        int soLan = scanner.nextInt();
//
//        int lan = 1;
//        while(lan <= soLan){
//            System.out.println("Hello Testing 05");
//            lan++;
//        }

        //vòng lặp do...while
//        giá trị ban đầu
//        do{
//            thuc hien logic
//
//            lam thay doi gia tri ban dau
//        } while (dieu kien)
//
//        int index = 1;
//        do {
//            System.out.println("Giá trị i: " + index);
//            index++;
//        } while (index <= 5);

        // vòng lặp for
//        for(giá trị khởi tạo; điều kiện; cập nhật giá trị khởi tạo)
//        for(int j = 1; j <= 5; j++){
//            System.out.println("Giá trị j: " + j);
//        }

        System.out.println("Bài tập 1");
        System.out.print("Nhập 1 số N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Tổng từ 1 tới " + n + " là: " + sum);

        int sum1 = 0;
        System.out.println("\nBài tập 2");
        for(int i = 0; i <= n; i+= 2){
            sum1 += i;
        }
        System.out.println("Tổng số chẵn từ 0 đến " + n + " là: " + sum1);
    }

}
