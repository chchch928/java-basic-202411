package chap1_9.static_.depart;


public class Main {
    static int add(){
        return 10;
    }

    public static void main(String[] args) {
        Department comSci = new Department("컴퓨터과학과",200);
        Department bio = new Department("생물학과",140);
        Department chem = new Department("화학과",120);
        Department kor = new Department("국어국문학과",100);

        kor.addStudent(20);
        bio.addStudent(50);

        System.out.println("전체 학생수: "+Department.getTotalStudentCount());

    }

}
