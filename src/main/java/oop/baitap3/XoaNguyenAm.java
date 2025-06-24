package oop.baitap3;

import java.util.Scanner;

public class XoaNguyenAm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi bất ky: ");
        String chuoi = scanner.nextLine();

        System.out.println("Chuỗi sau khi xóa các nguyên âm: " + chuoiKhongCoNguyenAm(chuoi));
    }
    public static boolean isNguyenAm(char kyTu) {
        kyTu = Character.toLowerCase(kyTu);
        return kyTu == 'a' || kyTu == 'e' || kyTu == 'u' || kyTu == 'o' || kyTu == 'i';
    }

    public static String chuoiKhongCoNguyenAm(String input) {
        String output = "";
        for(int i = 0; i < input.length(); i++) {
            char kyTu = input.charAt(i);
            if (!isNguyenAm(kyTu)) {
                output += kyTu;
            }
        }
        return output;
    }
}
