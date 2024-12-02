package chap1_7.inherit.player;

public class Mage extends Player {

    // 모든 직업 공통 속성

    // 직업 개별 속성
    int mana;

    public Mage(String nickname) {
        super(nickname);
        this.mana = 60;

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("마나: " + mana);
    }

    // 마법사 스킬
    public void fireBall() {

    }



}
