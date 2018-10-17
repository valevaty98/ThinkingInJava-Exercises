package initializationAndCleanupChapter5;

public class InitClean {
    //Ex. 3,4
    InitClean() {
        System.out.println("Hello!");
    }
    InitClean(String str) {
        System.out.println("Hello, " + str);
    }
    public static void main(String[] args) {
        InitClean ic1 = new InitClean("howdy?");
        InitClean ic2 = new InitClean();

        Dog dog = new Dog();
        dog.bark(5);
        dog.bark('R');
        dog.bark(false);
    }
}

//Ex. 5
class Dog {
    void bark(int i) {
        System.out.println("Bark " + i + " times.");
    }

    void bark(char c) {
        for(int i = 0; i < 10; i ++) {
            System.out.print(c);
        }
        System.out.println(c);
    }

    void bark(boolean b) {
        if (b) {
            System.out.println("True to barking");
        }else {
            System.out.println("Faaalse!!");
        }

    }
}