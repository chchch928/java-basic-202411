package chap2_4.collection.set;

import java.util.*;


public class SetExample {

    public static void main(String[] args) {
        /*

        Set(집합) - 중복을 허용하지 않음, 순서를 보장하지 않음 (주머니같은 느낌)

         A       B
        ----    ----
        1,2,3   3,4,5

        A와 B의 합집합
        ------------
         1,2,3,4,5

         */

        Set<String> set = new HashSet<String>();
        set.add("떡볶이");
        set.add("김말이");
        boolean flag1 =  set.add("김밥");
        set.add("단무지");
        boolean flag2 = set.add("김밥");

        System.out.println(set); //[김밥, 김말이, 단무지, 떡볶이]
        // 순서도 마음대로 김밥은 두개라서 중복으로 하나 사라짐

        System.out.println("flag1 = " + flag1); // true
        System.out.println("flag2 = " + flag2); // false

        // set은 순서가 없기 때문에 당연히 인덱스도 없다
        set.remove("단무지");
        System.out.println(set); // [김밥,김말이,떡볶이]

        for(String s: set){
            System.out.println("s = " + s);

        }

        // set은 보통 데이터 중복을 빠르게 없앨 때 사용
        List<Integer> numbers
                = List.of(3, 3, 1, 1, 1, 1, 3, 3, 5, 5, 7, 5, 7, 1, 3, 1);

        System.out.println(numbers);

        // set으로 변환
        Set<Integer> numSet = new HashSet<>(numbers);
        System.out.println(numSet); // [1,3,5,7]

        // 다시 list로 변환
        numbers = new ArrayList<>(numSet);
        numbers.add(9);
        System.out.println(numbers); // [1,3,5,7,9]

        System.out.println("===================");

        Person p1 = new Person("김철수","991122");
        Person p2 = new Person("박영희","040405");
        Person p3 = new Person("김철수","991122");

        Set<Person>personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        System.out.println(personSet);
        //[Person{name='김철수', ssn='991122'}, Person{name='박영희', ssn='040405'}]
    }
}


class Person {
    String name;
    String ssn; //주민번호

    public Person(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(ssn, person.ssn);
    }


    // equals에서 같다고 판정된 객체의 주소값을 통일시킴
    @Override
    public int hashCode() {
        return Objects.hash(name, ssn);
    }

}
