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

        //Ex. 8
        System.out.println("---------");
        Incrementable inc1 = new Incrementable();
        Incrementable inc2 = new Incrementable();

        System.out.println(inc1.num + " " + inc2.num);
        inc1.num++;
        System.out.println(inc2.num);

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