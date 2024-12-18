package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Object>map = new HashMap<>();

        // 데이터 추가: put
        /*
            {
                 "empName": "김철수",
                "hireDate" : "2012-03-15",
                "salary" : 5000000
            }

        */
        map.put("empName","김철수");
        map.put("hireDate", LocalDate.of(2012,3,15));
        map.put("salary",5000000);

        System.out.println(map); // {hireDate=2012-03-15, empName=김철수, salary=5000000}
        System.out.println(map.size()); // 3

        // 맵에 있는 데이터 꺼내기 -> 다운캐스팅 해야함
        String empName = (String) map.get("empName");
        System.out.println("empName = " + empName); // empName = 김철수

        int salary = (Integer) map.get("salary");
        System.out.println("salary = " + salary); // salary = 5000000

        // 중복된 키를 사용해서 생성하면 수정으로 처리
        map.put("empName", "박영희");
        System.out.println(map); // {hireDate=2012-03-15, empName=박영희, salary=5000000}

        // 맵의 순회
        Set<String> keys = map.keySet(); // map에서 key만 추출

        for(String key : keys) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }
        // key = hireDate
        //value = 2012-03-15
        //key = empName
        //value = 박영희
        //key = salary
        //value = 5000000
    }
}
