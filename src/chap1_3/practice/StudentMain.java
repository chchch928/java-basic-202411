package chap1_3.practice;

public class StudentMain {
    public static void main(String[] args) {
        Student Patrick = new Student("patrick",3);

        Patrick.updateGrade(4);

        Patrick.printStudentInfo();
    }
}
