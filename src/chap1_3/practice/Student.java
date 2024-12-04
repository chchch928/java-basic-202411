package chap1_3.practice;

import java.util.UUID;

public class Student {

    // 속성 정의
    String studentId;
    String name;
    int grade;

    // 생성자
    Student(String nm, int grd){
        studentId = UUID.randomUUID().toString(); //의미없는 랜덤 문자 만들때 생성
        name = nm;
        grade = grd;
    }
    // 기능
    void updateGrade(int newGrade)
    {
        grade = newGrade;
    }
    void printStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("name: " + name);
        System.out.println("grade: " + grade);
    }
}
