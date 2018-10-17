package chapter3;

//Ex. 2
public class Main {
    float f;

    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = m1;

        m1.f = 7;
        System.out.println(m2.f);
    }
}
