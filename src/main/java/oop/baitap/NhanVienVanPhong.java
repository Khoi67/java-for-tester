package oop.baitap;

public class NhanVienVanPhong extends NhanVien {
    public NhanVienVanPhong(double workHour) {
        super(workHour);
    }

    @Override
    public double salaryStaff() {
        return 5000 * getWorkHour();
    }

    @Override
    public void showMessage() {
        System.out.println("Lương của NVVP: " + salaryStaff());
    }
}
