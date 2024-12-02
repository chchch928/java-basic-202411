package chap1_7.inherit.player;

// 에러 나는 이유? Mage에 기본 생성자가 없어서
// public class HighMage extends Player {

//}
public class HighMage extends Mage{

    public HighMage(String nickname) {
        super(nickname);
    }
}
