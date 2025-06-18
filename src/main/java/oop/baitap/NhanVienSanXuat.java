package oop.baitap;

public class NhanVienSanXuat extends NhanVien {
    public NhanVienSanXuat(double workHour) {
        super(workHour);
    }

    @Override
    public double salaryStaff() {
        return 2000 * getWorkHour();
    }

    @Override
    public void showMessage() {
        System.out.println("Lương của NVSX: " + salaryStaff());
    }
}
