// Ex. 1

import javax.sound.midi.Soundbank;

public class SimpleClass {
    int defaultInt;
    char defaultChar;
    public static void main (String[] args) {
        SimpleClass sc = new SimpleClass();
        String str = "Int: " + sc.defaultInt + ". Char: " + sc.defaultChar + ".";
        System.out.println(str);
        System.out.println(new ATypeName().storage(str));

        System.out.println(new ATypeName(7).id);

        DataOnly data = new DataOnly();
        System.out.println("" + data.i + " " + data.d + " " + data.b);

        System.out.println("---------");
        System.out.println(Incrementable.num);
        Incrementable.increment();
        Incrementable.increment();
        System.out.println(Incrementable.num);
    }
}

//Ex. 7
class Incrementable {
    static int num;
    static void increment() {
        Incrementable.num++;
    }
}

//Ex.6
class ATypeName {
    int id;
    ATypeName (int id) {
        this.id = id;
    }
    ATypeName(){}
    int storage(String s) {
        return s.length()*2;
    }
}

//Ex. 5
class DataOnly {
    int i = 5;
    double d = 5.0;
    boolean b = true;
    DataOnly(int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }
    DataOnly(){}
}