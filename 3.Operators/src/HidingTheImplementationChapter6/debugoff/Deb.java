package HidingTheImplementationChapter6.debugoff;

public class Deb {
    private int priv;
    protected int protect = 7;
    public int pub;
    int pack;

    public static void debug() {
    }
}

class Work {
    void outi() {
        System.out.println(new Deb().protect);
    }
}