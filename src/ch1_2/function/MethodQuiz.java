package ch1_2.function;

import java.util.Arrays;

public class MethodQuiz {


    static String[] foods = {"떡볶이", "치킨", "파스타"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static void push(String newFood) {
        String[] newArray = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            newArray[i] = foods[i];
        }
        newArray[newArray.length - 1] = newFood;
        foods = newArray;
        newArray = null;

    }

    static int indexOf(String Pushtarget) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (Pushtarget.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void pop() {
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        String deleteTarget = foods[foods.length - 1];
        foods = temp;
        temp = null;

    }

    static void remove(String RemoveTarget) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (RemoveTarget.equals(foods[i])) {
                index = i;
                break;
            }
        }
        boolean isPresent = index != -1;
        if (isPresent) {
            for (int i = index; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
            String[] temp = new String[foods.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];

            }
            foods = temp;
            temp = null;
        }


    }

    static boolean include(String IncludeTarget) {

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (IncludeTarget.equals(foods[i])) {
                index = i;
                break;

            }
        }
        boolean isPresent = index != -1;

        return isPresent;
    }
    static void insert(int Insertindex, String InsertTarget) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = foods.length; i < Insertindex; i--) {
            temp[i] = foods[i - 1];
        }
        temp[Insertindex] = InsertTarget;

        foods = temp;
        temp = null;

    }
    static void modify(int Modifyindex, String ModifyTarget) {
        String[] temp = new String[foods.length];
        for( int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[Modifyindex] = ModifyTarget;
        foods = temp;
        temp = null;

    }



    public static void main(String[] args) {


        printFoods();

        push( "라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

       pop();
        remove("치킨");
        printFoods();


       boolean flag1 = include("파스타");
       System.out.println("flag1 = " + flag1);

       boolean flag2 = include("떡라면");
       System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");
        printFoods();


       modify(2, "닭갈비");
       printFoods();

    }
}
