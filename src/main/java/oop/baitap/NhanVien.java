package oop.baitap;

public abstract class NhanVien {
    private double workHour;

    public NhanVien(double workHour) {
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public abstract double salaryStaff();
    public abstract void showMessage();
}
