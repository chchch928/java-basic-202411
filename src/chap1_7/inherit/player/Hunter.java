package chap1_7.inherit.player;

public class Hunter extends Player {

    // 직업 개별 속성
    int concentrate;

    public Hunter(String nickname) {
        super(nickname);
        this.concentrate = 60;

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("집중: " + this.concentrate);
    }

    // 마법사 스킬
    public void summonBeast() {

    }
}
