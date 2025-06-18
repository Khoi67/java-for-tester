package org.example;

public class ToanTu {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;
        System.out.println("Tong cua a va b: " + sum);
        int minus = a - b;
        System.out.println("Hieu cua a va b: " + minus);
        int multiply = a * b;
        System.out.println("Nhan cua a va b: " + multiply);
        float divide = (float) a / b;
        System.out.println("Chia cua a va b: " + divide);
        int layPhanDu = a % b;
        System.out.println("Chia lay phan du cua a va b: " + layPhanDu);

        //Tiền tố và hậu tố
        //Tiền tố
        System.out.println(++a);
        int c = 10;
        int d = c;
        //Hậu tố
        System.out.println(d++);
        System.out.println(d);

    }
}
