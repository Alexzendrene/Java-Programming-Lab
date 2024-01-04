//Write a Java Code of the following operators: Arithmetic operator, Relational operator
public class experiment_3a {
    public static void main(String[] args) {
        // arithmatic operator
        System.out.println("** arithmatic Operator **");
        int a = 20;
        float b = -30;
        float c = (int) b;
        System.out.println(a + b); // -10
        System.out.println(a - b); // 50
        System.out.println(a * b);// -600
        System.out.println((b / a) + " ---> a/b"); // a/b ----> -(06.6666) || b/a ----> (- 1.5)
        System.out.println(b % a + " ---> b%a"); // 1
        System.out.println(20 + 30 - 10 * 55 - 50 / 71 + 0 + 81 * 33 / 2);

        // Relational Operator
        System.out.println("** Relational Operator **");
        System.out.println("a>b ---> " + (a > b));
        System.out.println("a<b ---> " + (a < b));
        System.out.println("a>=b ---> " + (a >= b));
        System.out.println("a<=b ---> " + (a <= b));
        System.out.println("a==b ---> " + (a == b));
        System.out.println("a!=b ---> " + (a != b));
        System.out.println("  ");

    }
}