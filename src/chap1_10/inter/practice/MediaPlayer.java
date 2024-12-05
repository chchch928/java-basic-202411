package chap1_10.inter.practice;

public class MediaPlayer {

    private MediaPlayable[] mediaList;
    int[] arr;

    // 배열안에 대괄호를 넣어줌
    public MediaPlayer() {

        this.mediaList = new MediaPlayable[]{};
    }



    public void addMedia(MediaPlayable media) {
        //  주어진 media를 mediaList배열에 추가
        MediaPlayable[] newMediaList = new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            newMediaList[i] = mediaList[i];
        }
        newMediaList[newMediaList.length - 1] = media;

        mediaList = newMediaList;



    }
    public void playAll() {
        for (MediaPlayable media : mediaList) {
            media.play();
        }
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
    }
}
