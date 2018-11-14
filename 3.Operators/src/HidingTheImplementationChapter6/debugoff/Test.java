package HidingTheImplementationChapter6.debugoff;

public class Test {
    Deb deb = new Deb();

    void act() {
        System.out.println(deb.protect);
        Work w = new Work();
    }
}
