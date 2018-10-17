package initializationAndCleanupChapter5;

public class InitClean {
    //Ex. 2
    String str1 = "Bye", str2;
    InitClean(String str) {
        str2 = str;
    }
    public static void main(String[] args) {
        InitClean ic = new InitClean("Hello");
        System.out.println(ic.str1 + " " + ic.str2);

    }
}
