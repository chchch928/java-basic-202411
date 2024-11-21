package ch1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민",
                "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.
        while (true) {
            // 1. 수정 타겟의 이름을 입력받는다.
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print(">>");
            String targetName = sc.nextLine();

            // 존재 유무 및 인덱스 탐색
            // 2. 해당 이름이 있는지 탐색해본다.
            int index = -1;
            for (int i = 0; i < tvxq.length; i++) {
                // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
                if (targetName.equals(tvxq[i])) {
                    index = i;
                    break;
                }
            } // end for
            boolean isPresent = index != -1;

            if (isPresent) {
                // 수정 진행
                // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
                System.out.printf("%s의 별명을 변경합니다.\n ", targetName);
                System.out.print(">> ");
                String newName = sc.nextLine();
                // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
                tvxq[index] = newName;
                System.out.println("- 변경 완료!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                break;
            } else {
                // 4. 탐색에 실패하면 실패한 증거를 확보한다.
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        }
    } // end main
}
