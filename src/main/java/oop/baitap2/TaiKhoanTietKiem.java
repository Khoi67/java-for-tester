package oop.baitap2;

public class TaiKhoanTietKiem extends TaiKhoan{
    private double laiSuat;

    public TaiKhoanTietKiem(String soTaiKhoan, String chuTaiKhoan, double soDu, double laiSuat) {
        super(soTaiKhoan, chuTaiKhoan, soDu);
        this.laiSuat = laiSuat;
    }

    @Override
    public double tinhLai() {
        return getSoDu() * laiSuat;
    }
}
