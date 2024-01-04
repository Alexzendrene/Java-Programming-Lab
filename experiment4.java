//Write a Java Code to implement each of the following control statements:
// Decision statement, Loops statement and Branch statements.

public class experiment4 {
    public static void main(String[] args) {
        // conditional statements using if else else if block
        int a = 19;
        if (a > 18) {
            System.out.println("A is eligible to vote ");
        } else if (a == 18) {
            System.out.println("you need to apply for a voter ID");
        } else {
            System.out.println("you are not eligible to vote ");
        }
        System.out.println(" ");

        // loop statements using for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Loop : " + i);
        }
        System.out.println(" ");
        // break statement and continue statement
        for (int i = 0; i < 10; i++) {
            System.out.println("loop :" + i);
            if (i == 5) {
                System.out.println("Loop skips this iteration ");
                continue;
            } else if (i == 8) {
                System.out.println("Loop terminates here ");
                break;

            }
        }
        System.out.println(" ");
        System.out.println(showsum(100, 200));
    }

    private static char[] showsum(int i, int j) {
        return null;
    }
}
