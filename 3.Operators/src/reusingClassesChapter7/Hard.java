package reusingClassesChapter7;

public class Hard {
    Simple simp;
    void init(){
        simp = new Simple();
    }

    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    A(int k) {
        System.out.println(k);
    }
}

class B {
    B(int k) {
        System.out.println(k);
    }
    void k(){}
    void g(){}
}

class C extends A{
    B b = new B(7);
    C(int k) {
        super(k);
        System.out.println(k);
    }
    C(){
        super(6);
    }
}