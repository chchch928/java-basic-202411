package chap1_5.player;

public class Player {
    String nickName; // 필드
    int level;
    int hp;
    // 매개변수
    Player(String nickName) {
        // this는 오직 필드에만 붙일 수 있음
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

// AlT+insert 생성자 만들기 단축키

    // 공격 기능
    void attack(Player targetPlayer) {
//        System.out.println("this = " + this);
//        System.out.println("targetPlayer = " + targetPlayer);
        // 상대방의 체력이 10 감소하고
        // 내 체력이 5감소
        targetPlayer.hp -= 10;
        this.hp -= 5;

        System.out.printf("%s님이 %s님을 공격했습니다. \n", this.nickName,targetPlayer.nickName);

        System.out.println("나의 현재 체력: "+this.hp);
        System.out.println("상대방의 현재 체력:"+targetPlayer.hp);
    }
}
