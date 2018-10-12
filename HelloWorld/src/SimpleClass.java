// Ex. 1

public class SimpleClass {
    int defaultInt;
    char defaultChar;
    public static void main (String[] args) {
        SimpleClass sc = new SimpleClass();
        System.out.println("Int: " + sc.defaultInt + ". Char: " + sc.defaultChar + ".");

        System.out.println(new ATypeName(7).id);
    }
}

//Ex.2
class ATypeName {
    int id;
    ATypeName (int id) {
        this.id = id;
    }
}