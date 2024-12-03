package chap1_8.pratice.q2;

public class Main {
    public static void main(String[] args) {
        PayrollManager manager = new PayrollManager();

        Employee fullTime = new FullTimeEmployee(3000000);
        Employee partTime = new PartTimeEmployee(20000, 120);

        manager.printPay(fullTime);  // 정규직 급여 출력
        manager.printPay(partTime);  // 시간제 직원 급여 출력
    }
}
