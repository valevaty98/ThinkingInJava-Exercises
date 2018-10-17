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

        Dog dog1 = new Dog("spot", "Spot Gav!");
        Dog dog2 = new Dog("scraffy", "Scraffy Gav!");

        System.out.println(dog1.name + ": "  + dog1.says);
        System.out.println(dog2.name + ": " + dog2.says);

        //Ex. 6
        Dog dog3 = new Dog("spot", "Spot Gav!");

        System.out.println(dog1 == dog3); //false
        System.out.println(dog1.equals(dog3)); //false (equals() must be overriding
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