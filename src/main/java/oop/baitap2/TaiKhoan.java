package oop.baitap2;

public abstract class TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    public double getSoDu() {
        return soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void guiTien(double soTien) {
        if(soTien > 0){
            soDu += soTien;
        }
    }

    public void rutTien(double soTien) {
        if(soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
        }
    }

    public void hienThiThongTin() {
        System.out.println("-----------------");
        System.out.println("Chủ tài khoản là " + chuTaiKhoan);
        System.out.println("Số tài khoản là " + soTaiKhoan);
        System.out.println("Số dư " + soDu);
        System.out.println("Số tiền lãi " + tinhLai());
    }

    public abstract double tinhLai();
}
