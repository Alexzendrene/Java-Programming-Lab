//experiment 6
//Write a Java Code to implement each of the following: Class, Object, Constructors, Method, Method Overloading and Method Overriding

public class vehicle {
    // defining a method
    void run() {
        System.out.println("vehicle is running");
    }

    void displayspeed() {
        System.out.println("current speed is 40km/h");
    }

    void displayspeed(int speed) {
        System.out.println("Current speed is " + (speed) + "km/h");
    }

    public static void main(String args[]) {
        vehicle obj = new bike2(); // creating object
        obj.run(); // method now called

        vehicle v1 = new vehicle();
        v1.displayspeed();
        v1.displayspeed(40);

    }
}

class bike2 extends vehicle {
    // defining same method as in the parent class
    @Override
    void run() {
        System.out.println("bike is running safely");
    }
}
