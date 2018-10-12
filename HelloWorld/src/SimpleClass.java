// Ex. 1

/** Testing javadoc
 * Comments to the class
 * Can <em>insert</em> list
 * <ol>
 *     <li>First elem</li>
 *     <li>Second elem</li>
 * </ol>
 */
public class SimpleClass {
    /** Comments to the variable */
    int defaultInt;
    /** Comments to the variable */
    char defaultChar;

    /** Comments to the method
     * @param args params from command line
     */
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

        //Ex.9
        System.out.println("---------");
        Integer iOb = 7;
        Double dOb = 4.8;
        System.out.println(iOb + " " + dOb);

        System.out.println("---------");
        AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow(7);
        System.out.println(color.anIntegerRepresentingColors);
        color.changeTheHueOfTheColor(10);
        System.out.println(color.anIntegerRepresentingColors);

    }
}

//Ex.14
class Documentation1{
    int dovInt;
    String doStr(int i) {
        return " " + i + " ";
    };
}

//Ex. 11
class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }
    AllTheColorsOfTheRainbow(int hue) {
        anIntegerRepresentingColors = hue;
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