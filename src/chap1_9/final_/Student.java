package chap1_9.final_;

public class Student {

    public String name; // 학생명
    public final String ssn; // 주민번호 //final은 한번 정해지면 못바꾼다

    // 싱수는 불변성과 유일성을 만족해야함
    // 띠리사 final키워드는 블변성은 만족하나 유일성을 만족하지 못함
    public static final String nation ="한국";

    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }

}
