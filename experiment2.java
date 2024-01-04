//Write a Java Code to implement each of the following data types: Variable, Constant, 
//Arrays, Strings, Vectors, Wrappers Classes, Type Casting.

import java.util.Vector;

public class experiment2 {
    public static void main(String[] args) {
        // Variable
        int num = 5;
        String name = "Gautam buddha university";
        System.out.println("int variable = " + num);
        System.out.println("string variable : " + name);

        // Constant
        final double Pi = 3.14159;
        System.out.println("Constant int variable  " + Pi);

        // Arrays
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Address of Array  " + arr);

        // Strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println("after concatenation " + str3);

        // Vectors
        Vector<String> vec = new Vector<String>();
        vec.add("One");
        vec.add("Two");
        vec.add("Three");
        System.out.println("Vector" + vec);

        // Wrappers Classes
        Integer i = Integer.valueOf(5);
        Double d = Double.valueOf(3.14159);
        System.out.println("Wrapper class Interger " + i);
        System.out.println("Wrapper class double " + d);

        // Type Casting
        double x = 5.5;
        int y = (int) x;
        System.out.println("Typer Casted variable x: " + x);
        System.out.println("Typer Casted variable y: " + y);

    }
}
