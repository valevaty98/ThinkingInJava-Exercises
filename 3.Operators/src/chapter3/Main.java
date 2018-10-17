package chapter3;

//Ex. 3
public class Main {
    float f;

    static void f(Main m) {
        m.f = 9;
    }
    public static void main(String[] args) {
        Main m1 = new Main();

        f(m1);
        System.out.println(m1.f);
    }
}
