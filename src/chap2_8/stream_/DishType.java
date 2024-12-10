package chap2_8.stream_;

public enum DishType {
    MEAT("육류"),
    FISH("어류"),
    OTHER("기타");

    private String description;
    DishType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
