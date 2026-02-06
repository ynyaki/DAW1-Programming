package es.iesso.EjsClase.Unidad6.U6A5.U6A5E2;

public class HourlyEmployee extends Employee {

    private double paymentRate;
    private double hoursWorked;

    public HourlyEmployee(String nombre, String cargo,
                          double paymentRate, double hoursWorked) {
        super(nombre, cargo);
        this.paymentRate = paymentRate;
        this.hoursWorked = hoursWorked;
    }

    public double getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(double paymentRate) {
        this.paymentRate = paymentRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateWeeklyPay() {
        return paymentRate * hoursWorked;
    }
}
