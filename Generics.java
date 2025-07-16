package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Generics {
    public static void main(String[] args) {
        Map a = new HashMap();
        a.put(10,"Karthik");
        a.put(10,98.79);
        a.put(10,7.51);
        a.put("Karthik",10.890);
        a.put('o',127.897f);
        System.out.println(a);

        System.out.print(a.containsKey("Karthik"));
        System.out.println(a.containsValue(10));
        a.remove(10);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
