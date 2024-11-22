package ch1_2.array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        // 2차원 배열
        /*
        [
        [1,2,3],
        [4,5,6],
        [7,8,9]
        ]
        이 배열의 length = 3
        */
        // 국영수 점수를 저장
        int kor = 77;
        int eng = 100;
        int math = 99;

        int[] scoresKim = {kor, eng, math};
        int[] scoresLee = {100, 22, 56};
        int[] scoresPark = {40, 90, 80};

        int[][] ClassScores = {scoresKim, scoresLee, scoresPark};
        System.out.println(ClassScores.length); //3
        System.out.println(scoresKim); // scoresKim의 주소
        System.out.println(ClassScores[0]); // scoresKim의 주소(위와 동일)
        System.out.println(Arrays.toString(ClassScores[0])); //90
        System.out.println(ClassScores[2][1]);

        System.out.println(Arrays.toString(ClassScores));
        System.out.println(Arrays.deepToString(ClassScores));

        System.out.println("==============");

        int[][] arr2d = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };

        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("========================");

        // 배열의 값 없이 생성만 하고 싶으면
        int[][] arr32 = new int[3][2];

        System.out.println(Arrays.deepToString(arr32)); //[[0,0],[0,0],[0,0]]


    }
}
