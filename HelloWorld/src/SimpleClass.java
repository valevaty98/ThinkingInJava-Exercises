// Ex. 1

public class SimpleClass {
    int defaultInt;
    char defaultChar;
    public static void main (String[] args) {
        SimpleClass sc = new SimpleClass();
        System.out.println("Int: " + sc.defaultInt + ". Char: " + sc.defaultChar + ".");

        System.out.println(new ATypeName(7).id);

        DataOnly data = new DataOnly();
        System.out.println("" + data.i + " " + data.d + " " + data.b);
    }
}

//Ex.3
class ATypeName {
    int id;
    ATypeName (int id) {
        this.id = id;
    }
}

//Ex. 4
class DataOnly {
    int i;
    double d;
    boolean b;
}