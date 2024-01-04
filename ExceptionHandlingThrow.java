
// EXPERIMENT  9

//Write a separate Java Code to implement each of the following: Exception handling with Try, Catch, throw
class ExceptionHandling {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // we are trying to divide num1 by num2, which is 0. This will result in an
        // ArithmeticException.
        try {
            // handle this exception, we have put the code inside a try block and catch the
            // exception in the catch block.
            int result = num1 / num2;
            System.out.println("Result: " + result);
            // If an exception occurs, the catch block will be executed, and it will print
            // the error message.
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class ExceptionHandlingThrow {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Underage");
        }
        System.out.println("You are eligible to vote!");
    }

    // we have defined a static method checkAge that throws an exception if the age
    // is less than 18.
    // We are calling this method with an age of 15, which will result in an
    // ArithmeticException
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
