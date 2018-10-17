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

        Dog dog = new Dog(7);
        dog.bark(5, 'g');
//        dog.bark('R', 10);
//        dog.bark(false);
    }
}

//Ex. 6
class Dog {

    //Ex. 9
    Dog() {
        //this(7);
        System.out.println("Dog()");
    }
    Dog(int num) {
        this();
        System.out.println("Dog(" + num + ")");
    }
    //Ex. 8
    void bark(int i, char c) {
        System.out.println("Bark " + i + " times " + c);
        bark(c,i);
        this.bark(c,i);
    }

    void bark(char c, int n) {
        for(int i = 0; i < n; i ++) {
            System.out.print(c);
        }
        System.out.println(" " + n + " times");
    }

    void bark(boolean b) {
        if (b) {
            System.out.println("True to barking");
        }else {
            System.out.println("Faaalse!!");
        }

    }

    //Ex. 10

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize()"); //not working
        super.finalize();
    }
}