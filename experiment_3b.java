//Write a Java code to show Logical operator, Assignment operator, 
//Increment & Decrement operator, Conditional operator, Bitwise operator 

public class experiment_3b {
    public static void main(String[] args) {

        int a = 20;
        int b = -30;
        int c = 40;
        int d = 55;
        System.out.println("**Assignment Operators**");
        System.out.println("a+=b " + (a += b));
        System.out.println("a-=b " + (a -= b));
        System.out.println("a*=b " + (a *= b));
        System.out.println("a/=b " + (a /= b));
        int r = a;
        System.out.println("C value " + (r));

        System.out.println("**Increment decrement Operators**");
        System.out.println(a++ + ++a); // 20 + 22 = 42
        System.out.println(++b + b++); // -58
        System.out.println(a-- + --a); // 20 + 22 = 42
        System.out.println(--b + b--); // -58
        boolean operation = a > b;
        System.out.println("the value of a is " + ~a); // minus of total positive value with increased one
        System.out.println("the value of b is " + ~b); // positive the negative value with increased one

        System.out.println("Logical and bitwise Operator");

        int k = 11;
        int p = 25;
        int n = 30;

        System.out.println(k++ < p && n > k); // in and if one is false the result is false
        System.out.println(k);
        System.out.println(n > p && p++ > k);
        System.out.println(p);
        System.out.println(n < p || p > k); // in or if any condition is true the result is true
        System.out.println(n++ < p || p < k);
        System.out.println(n);

        System.out.println("Ternary Operators");
        System.out
                .println("to check whether C is greater than d " + (c > d ? " C is greater than " : " D is greater "));
    }
}
