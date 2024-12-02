package chap1_7.practice.q1;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary); // 부모클래스 생성자 호출
        this.bonus = bonus;
    }

    @Override
    public void work(String name) {
        System.out.println(this.name+"님이 관리자가 팀을 관리합니다.");
    }
    public double getTotalCompensation() {
        return salary + bonus;
    }
}
