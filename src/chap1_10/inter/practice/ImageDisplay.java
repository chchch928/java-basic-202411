package chap1_10.inter.practice;

public class ImageDisplay implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("이미지를 재생합니다.");

    }

    @Override
    public void pause() {
        System.out.println("이미지를 일시정지합니다.");

    }

    @Override
    public void stop() {
        System.out.println("이미지를 멈춥니다.");

    }
}
