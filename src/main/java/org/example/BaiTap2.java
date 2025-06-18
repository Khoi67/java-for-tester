package org.example;

import java.util.Scanner;

public class BaiTap2 {
    /** MÔ hình IPO
     * ** Input
     * Giá trị từ phía người dùng nhập
     *
     * ** Process
     * Giá trị từ người dùng nhập thực hiện logic yêu cầu của bài toán
     *
     * ** Output
     * Giá trị đầu ra từ yêu cầu của đề
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào số ngày làm: ");
//        int ngayLam = scanner.nextInt();
//        System.out.print("Nhập vào tiền lương trong 1 ngày: ");
//        int tienLuong = scanner.nextInt();
//        System.out.println("Tổng số lương trong " + ngayLam + " ngày là: " + tongLuong(ngayLam, tienLuong));
        System.out.print("Nhập điểm Toán: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double diemHoa = scanner.nextDouble();

        double diemTB = diemTrungBinh(diemToan, diemLy, diemHoa);
        System.out.println("Điểm trung bình 3 môn là: " + diemTB);
        System.out.println(danhGiaXepLoai(diemTB));

    }
    static double diemTrungBinh(double toan, double ly, double hoa) {
        return (toan + ly + hoa)/3;
    }
    static String danhGiaXepLoai(double diemTB) {
        if(diemTB > 8 && diemTB <= 10) {
            return "Đánh giá là học sinh xuất sắc";
        }else if(diemTB <= 8 && diemTB > 7) {
            return "Đánh giá là học sinh giỏi";
        }else if(diemTB <= 7 && diemTB > 6) {
            return "Đánh giá là học sinh khá";
        }else if(diemTB <= 6 && diemTB > 5) {
            return "Đánh giá là học sinh trung bình";
        }else if(diemTB <= 5 && diemTB >= 0) {
            return "Đánh giá là học sinh yếu";
        }else {
            return "Không hợp lệ";
        }
    }
    static int tongLuong(int ngayLam, int tienLuong) {
        return ngayLam * tienLuong;
    }
}
