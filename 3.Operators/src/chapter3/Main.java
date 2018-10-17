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
        return (num % 2 == 1)? "Орёл!": "Решка!";
    }

    public static void main(String[] args) {
        Main m1 = new Main();

        f(m1);
        System.out.println(m1.f);

        System.out.println("Speed: " + calculateSpeed(10, 500));

        Dog dog1 = new Dog("spot", "Spot Gav!");
        Dog dog2 = new Dog("scraffy", "Scraffy Gav!");

        System.out.println(dog1.name + ": "  + dog1.says);
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
        System.out.println(e1 + " " + " " +  e2);

        //Ex. 10
        final int i1= 0x5555;
        final int i2= 0xAAAA;
        System.out.println(Integer.toBinaryString(i1 & i2));
        System.out.println(Integer.toBinaryString(i1 | i2));
        System.out.println(Integer.toBinaryString(i1 ^ i2));
    }
}

//Ex. 5
class Dog {
    String name;
    String says;

    Dog(String name, String says){
        this.name = name;
        this.says = says;
    }
}