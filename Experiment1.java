
// write a Java Code to implement each of the following: Class, Command Line
// Argument, how to enter value through keyboard.
import java.util.Scanner;

class Testing {
    Testing() {
        System.out.println(" To show the functionality of the class");
    }

    void sum(int a, int b) {
        System.out.println("Sum : " + (a + b));

    }
}

public class Experiment1 {
    public static void main(String[] args) {
        // commandline Argument
        System.out.println(args);
        Scanner sc = new Scanner(System.in);
        // taking input from the user .
        System.out.print("Enter the first number :   ");
        int a = sc.nextInt();
        System.out.print("Enter the second number :   ");
        int b = sc.nextInt();
        Testing t1 = new Testing();
        t1.sum(a, b);

    }
}
