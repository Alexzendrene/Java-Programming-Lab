import java.io.*;

interface in1 {
    public final int a = 10;

    void display();

}

class TestClass implements in1 {
    public void display() {
        System.out.println("Greek");
    }
}

public class experiment10 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
