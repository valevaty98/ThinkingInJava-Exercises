package polymorphism;


public class Main {
    static void ride(Cycle c) {
        System.out.println("ride with " + c.wheels() + " wheels.");
    }
    public static void main(String[] args) {
        Cycle c = new Bicycle();
        ride(c);
        System.out.println(c);
    }
}

abstract class Cycle {
    int wheels(){
        doo();
        return 0;
    }
    void doo(){
        System.out.println("cyc");
    }
    public String toString() {
        return this.wheels() + "";
    }
}

class Unicycle extends Cycle {
    @Override
//    int wheels(){
//        return 1;
//    }
    void doo(){
        System.out.println("uni");
    }
}

class Bicycle extends Cycle {
    @Override
//    int wheels(){
//        return 2;
//    }
    void doo(){
        System.out.println("bi");
    }
}

class Tricycle extends Cycle {
    @Override
//    int wheels(){
//        return 3;
//    }
    void doo(){
        System.out.println("tri");
    }
}