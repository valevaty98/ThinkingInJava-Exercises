package chapter3;

import java.util.Random;

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

    //Ex. 7
    static String tossACoin() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println(num);
        return (num % 2 == 1) ? "Орёл!" : "Решка!";
    }

    //Ex. 13
    static void charToBinaryString(char c) {
        System.out.println(Integer.toBinaryString(c));
    }

    static boolean f(boolean b) {
        return b ? true : false;
    }

    //Ex. 14
    static void compareStrings(String s1, String s2) {
        f(s1 == s2);
        f(s1.equals(s2));
        f(s1 != s2);
        f(s1.length() > s2.length());
    }

    public static void main(String[] args) {
        Main m1 = new Main();

        f(m1);
        System.out.println(m1.f);

        System.out.println("Speed: " + calculateSpeed(10, 500));

        Dog dog1 = new Dog("spot", "Spot Gav!");
        Dog dog2 = new Dog("scraffy", "Scraffy Gav!");

        System.out.println(dog1.name + ": " + dog1.says);
        System.out.println(dog2.name + ": " + dog2.says);

        //Ex. 6
        Dog dog3 = new Dog("spot", "Spot Gav!");

        System.out.println(dog1 == dog3); //false
        System.out.println(dog1.equals(dog3)); //false (equals() must be overriding

        System.out.println(tossACoin());

        //Ex. 8
        long l1 = 0x20L; //16
        long l2 = 020L;  //8
        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toBinaryString(l2));

        //Ex. 9
        float e1 = 2.14e9f;
        double e2 = -21.47e8;
        System.out.println(e1 + " " + " " + e2);

        //Ex. 10
        final int i1 = 0x5555;
        final int i2 = 0xAAAA;
        System.out.println(Integer.toBinaryString(i1 & i2));
        System.out.println(Integer.toBinaryString(i1 | i2));
        System.out.println(Integer.toBinaryString(i1 ^ i2));

        //Ex. 11
        final short i3 = 0x7101;
        for (int j = 1; j <= 15; j++) {
            System.out.println(Integer.toBinaryString(i3 >> j));
        }
        System.out.println("---------");
        //Ex. 12
        int i4 = 0x7fffffff;
        System.out.println(Integer.toBinaryString(i4));
        i4 = i4 << 31;
        for (int j = 0; j <= 31; j++) {
            System.out.println(Integer.toBinaryString(i4 >>> j));
        }

        charToBinaryString('H');
        charToBinaryString('A');
        charToBinaryString('B');
    }
}

//Ex. 5
class Dog {
    String name;
    String says;

    Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
}