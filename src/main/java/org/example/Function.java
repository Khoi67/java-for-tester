package org.example;

public class Function {

    /**
     * Có 2 loại hàm
     * Hàm không có giá trị trả về (thực thi logic)
     * static void tenHam() {}
     * Hàm có giá trị trả về
     * static <kieudulieu> tenHam(truyen tham so) {}
     * */
    static void greeting() {
        System.out.println("Hello everybody !!!");
    }
    static double dtb(int toan, int ly, int hoa) {
        return (toan + ly + hoa)/3;
    }
    public static void main(String[] args) {
        greeting();
        System.out.println(dtb(7, 8, 9));
    }
}
