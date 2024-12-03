package chap1_9.practice.q2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("김철수");
        Employee emp2 = new Employee("이영희");

        emp1.getEmployeeInfo(); // 직원 ID: 1, 이름: 김철수
        emp2.getEmployeeInfo(); // 직원 ID: 2, 이름: 이영희
    }
}
