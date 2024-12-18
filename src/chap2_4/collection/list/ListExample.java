package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("영화보기");
        System.out.println(hobbies); // [수영, 축구, 영화보기]

        // 중간 삽입
        hobbies.add(1, "코딩");
        System.out.println(hobbies); // [수영, 코딩, 축구, 영화보기]

        // 데이터 수 확인
        int size = hobbies.size();
        System.out.println("size = " + size); // size = 4

        // 인덱스 찾기
        int index1 = hobbies.indexOf("영화감상");
        int index2 = hobbies.indexOf("축구");
        System.out.println("index1 = " + index1); // index1 = -1
        System.out.println("index2 = " + index2); // index2 = 2

        // 요소포함여부
        boolean flag = hobbies.contains("코딩");
        System.out.println("flag = " + flag); // flag = true

        // 요소 삭제
        hobbies.remove("수영");
        hobbies.remove(2);
        System.out.println("remove hobbies = " + hobbies); // remove hobbies = [코딩, 축구]

        // 요소 수정
        hobbies.set(0, "디자인");
        System.out.println("set hobbies =" + hobbies); //set hobbies =[디자인, 축구]

        // 요소 참조
        String hobby = hobbies.get(1);
        System.out.println(" get hobby = " + hobby); //  get hobby = 축구

        // 리스트의 순회(반복문 처리)
//        for(int i = 0; i <hobbies.size();i++){
//            System.out.println(hobbies.get(i));
//        }

//        for (String s : hobbies) {
//            System.out.println("s = " + s); // s = 디자인
//                                           // s = 축구
//        }
      hobbies.forEach(h -> System.out.println("h = "+h));
      hobbies.forEach(System.out::println);

        // 전체삭제
        hobbies.clear();
        System.out.println(hobbies); //[]
        System.out.println(hobbies.isEmpty()); // true

        // 리스트에 초기값 넣고 시작하기
        System.out.println("=============");
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
        numbers.add(100);
        System.out.println(numbers); //[10, 20, 30, 100]
    }
}
