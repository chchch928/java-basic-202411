package chap1_8.pratice.q2;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    //@Override
    public double calculatePay() {
        return salary;
    }
}
