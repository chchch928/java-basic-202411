package chap1_7.practice.q1;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void work(String name){
        System.out.println(name + "님이 일반 직원으로 일합니다");

    }
    public double getSalary(){
        return salary;
    }




    }

