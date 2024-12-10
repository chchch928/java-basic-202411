package chap2_8.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("김철수",15,79));
        studentList.add(new Student("김영희",14,80));
        studentList.add(new Student("최빵빵",15,66));
        studentList.add(new Student("최옥희",16,92));

        // 나이 순으로 오름차 정렬 (나이 적은 순서)
        /*
            compare는 리턴의 연산결과가 양수일 경우 자리를 바꾼다
            음수이거나 0이면 자리를 바꾸지 않는다.

         */

        studentList.sort(new Comparator<Student>(){
        @Override
        public int compare(Student o1, Student o2){
            return o1.getAge() - o2.getAge();
        }
    });

        // 람다를 활용
//      studentList.sort((o1,o2)->o1.getAge() - o2.getAge());

//      studentList.sort(Comparator.comparing(stu -> stu.getAge()));

//      studentList.sort(Comparator.comparing(Student::getAge));

        studentList.forEach(System.out::println);

        // 나이 내림차 - 나이 많은 순
        System.out.println("====================");
        studentList.sort(Comparator.comparing(Student::getAge).reversed());
        studentList.forEach(System.out::println);

        // 이름 오름차 - 가나다순
        System.out.println("=========================");
        studentList.sort(Comparator.comparing(Student::getName));
        studentList.forEach(System.out::println);

    }



}
