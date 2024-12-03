package chap1_5.player;

public class Main {
    public static void main(String[] args) {

        Player shocking = new Player("충격왕쇼킹");
        Player insulting = new Player("욕설왕퍼킹");

        System.out.println("shocking: " + shocking);
        System.out.println("insulting: " + insulting);
        shocking.attack(insulting); // 클래스에서 this 변수를 주었지만 안적어도 자동으로 들어감

        System.out.println("=================");


        }
    }

