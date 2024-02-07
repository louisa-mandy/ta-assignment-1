public class Car {
    //Fields
    private  int maxSpeed;
    private String name;
    private int YearOfMake;

    // Constructor
    public Car(int maxSpeed, String name, int YearOfMake) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.YearOfMake = YearOfMake;

    }

    public void displayName() {
        System.out.println( " Car name = " + name);
    }

    public void displayYear() {
        System.out.println( " Year make = " + YearOfMake);
    }

    public void displaySpeed() {
        System.out.println( " maximum speed = " + maxSpeed);
    }

}
