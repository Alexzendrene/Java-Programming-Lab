//    EXPERIMENT 7

//Write a Java Code to implement each of the following: Final variable, final class, final method

// Define a final class that cannot be subclassed
final class MyFinalClass {
    // Define a final variable that cannot be changed
    final int MAX_SIZE = 100;

    // Define a final method that cannot be overridden
    final void printName() {
        System.out.println("My name is MyFinalClass");
    }
}

// Define a subclass of MyFinalClass that tries to override the printName()
// method
// This will cause a compilation error, since the method is final and cannot be
// overridden samjha nhi tu nahi samjha
/*
 * class MySubclass extends MyFinalClass {
 * void printName() {
 * System.out.println("My name is MySubclass");
 * }
 * }
 */
public class FinalExample {
    public static void main(String[] args) {
        // Create an instance of MyFinalClass and call the printName() method
        MyFinalClass obj = new MyFinalClass();
        obj.printName();

        // Try to change the value of the final variable MAX_SIZE - this will cause a
        // compilation error
        /*
         * MAX_SIZE = 200;
         */
    }
}