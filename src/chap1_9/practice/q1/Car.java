package chap1_9.practice.q1;

public class Car {
    private String model;
    private int year;
    public static int count;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        count++;
    }
    public void getCarInfo(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    static void getTotalCars(){
        System.out.println("Total Cars: " + count);
    }

}
