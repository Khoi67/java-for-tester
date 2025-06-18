package org.example;

public class Array {
    public static void main(String[] args) {
        // khoi tao gia tri
        int[] numbers = {10,20,30,40,50};
        String[] name = {"khoi","ti","na","la"};

        //Duyet mang
        for(int i = 0; i <= name.length - 1; i ++){
            System.out.println("Tên thứ " + (i+1) + ": " + name[i]);
        }

        //For-each chi dc dung cho mảng
        for(int number:numbers){
            System.out.println(number);
        }

        //Nang cao: duyệt mảng ngược
        for(int index = numbers.length - 1; index >= 0; index--){
            System.out.println(numbers[index]);
        }
    }
}
