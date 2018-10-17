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
    }
}
