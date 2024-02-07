/* make a class in java for a car class that has max speed, name, year of make
1, make a constructor
2. make at least 2 methods
3. make a main function to define the object and run the methods
 */


public class Main {
    public static void main(String[] args) {
            // Define a new car object
            Car myCar = new Car(300, "Xiao Long Bao", 2020);

            // Call the methods to display information about the car
            myCar.displayName();
            myCar.displayYear();
            myCar.displaySpeed();
    }
}