package chap2_8.stream_;

import java.util.Optional;

import static chap2_8.stream_.Menu.*;

public class Finding {

    public static void main(String[] args) {
        // 요리 중 채식주의자가 먹을 수 있는 요리가 하나라도 있는지 여부
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegetarian());

        System.out.println("flag1 = " + flag1);// 
        
        // 요리중 모든요리가 800칼로리 미만입니까?
        boolean flag2 = menuList.stream()
                .allMatch(m -> m.getCalories() < 800);
        System.out.println("flag2 = " + flag2); // 800칼로리 이상의 음식이 있으므로 false
    
        // 요리중에 첫번째 발견된 생선요리를 찾기
        // Optional 객체:  null일 경우 에러발생하기 때문에 null 체크 해주는 기능

        Optional<Dish> firstFish = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst();

        System.out.println("firstFish = " + firstFish);







    }
}
