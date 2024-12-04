package chap1_9.practice.q4;

public enum Weather {
    SUNNY("선크림을 바르세요","날씨가 화창합니다."),
    CLOUDY("우산을 챙기세요","날씨가 흐립니다."),
    RAINY("비가 오니 우산을 꼭 챙기세요","비가 옵니다."),
    SNOWY("따뜻하게 입으세요","눈이 내립니다.")
    ;
    private final String advice;
    private final String status;

    Weather(String advice, String status) {
        this.advice = advice;
        this.status = status;
    }
    public String getAdvice(){
        return advice;
    }
    public String getStatus(){
        return status;
    }
}
