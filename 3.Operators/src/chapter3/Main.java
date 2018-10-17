package chapter3;

//Ex. 3
public class Main {
    float f;

    static void f(Main m) {
        m.f = 9;
    }

    //Ex. 4
    static float calculateSpeed(float time, float distance) {
        float speed;
        speed = distance / time;
        return speed;
    }

    public static void main(String[] args) {
        Main m1 = new Main();

        f(m1);
        System.out.println(m1.f);

        System.out.println("Speed: " + calculateSpeed(10, 500));
    }
}
