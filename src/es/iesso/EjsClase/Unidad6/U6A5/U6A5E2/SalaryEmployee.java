package es.iesso.EjsClase.Unidad6.U6A5.U6A5E2;

public class SalaryEmployee extends Employee {

    private double weeklyPay;

    public SalaryEmployee(String nombre, String cargo, double weeklyPay) {
        super(nombre, cargo);
        this.weeklyPay = weeklyPay;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public double calculateWeeklyPay() {
        return weeklyPay;
    }
}
