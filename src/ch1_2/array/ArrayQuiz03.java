package ch1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민",
                "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(tvxq));

        System.out.println("- 삭제할 학생의 별명을 입력하세요");
        System.out.print(">");
        String targetName = sc.nextLine();

        int Targetindex = -1;
        for( int i =0; i< tvxq.length; i++){
            if(tvxq[i].equals(targetName)){
                Targetindex = i;
                break;
            }

        }
        boolean isPresent = Targetindex != -1;

        if(isPresent){
            // 삭제 수행
            for (int i = Targetindex; i < tvxq.length-1; i++) {
                tvxq[i] = tvxq[i+1];
            }
            // 배열 사이즈 줄여서 복사
            String[] temp = new String[tvxq.length-1];
            for (int i =0; i<temp.length; i++){
                temp[i] = tvxq[i];
            }
            tvxq = temp;
            temp = null;

            System.out.println("*삭제 후 정보"+ Arrays.toString(tvxq));



        }
        else{
            System.out.printf("해당 별명 (%s) 은(는) 존재하지 않습니다",targetName);
        }

    }
}
