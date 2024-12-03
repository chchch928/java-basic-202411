package chap1_9.practice.q2;

public class Employee {
    private static int idCounter = 1;
    private int employeeId;
    private String name;

    public Employee(String name) {
        this.employeeId = idCounter++;
        this.name = name;
    }

    public void getEmployeeInfo(){

        System.out.println("employeeId: " + employeeId);
        System.out.println("name: " + name);
    }


}
