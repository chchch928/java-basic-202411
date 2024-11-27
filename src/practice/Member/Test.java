package practice.Member;

public class Test {
    public static void main(String[] args) {

        // 멤버 저장소 객체 생성
        MemberRepository mr = new MemberRepository();

        // 회원 데이터 추가
        mr.addMember(new Member("ppp@lll.com","9999","말포이",Gender.MALE,20));
        mr.addMember(new Member("aaa@bbb.com","1111","꼬꼬",Gender.MALE,3));

        // 이메일 중복 검사
        boolean flag = mr.isDuplicateEmail("fff@ggg.com");
        System.out.println("flag="+flag); // flag = true (fff@ggg.com은 중복됨)

        // 전체 회원 데이터 조회
        Member[] members = mr.getMembers();
        for (Member m : members) {
            m.inform();


        }

    }
}
