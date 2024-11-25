package chap1_3;

public class Student {

    // 속성 정의
    String studentId;
    String name;
    int grade;


    // 기능
    void updateGrade(int newGrade) {
        grade = newGrade;
    }
    void printStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("name: " + name);
        System.out.println("grade: " + grade);
    }
    Student(String Id, String studentname, int currentgrade) {
        studentId = Id;
         name= studentname;
         grade = currentgrade;
    }
}
