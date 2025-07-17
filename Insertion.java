package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Insertion {
    public static void main(String... args){
        Map<Integer, String> a = new HashMap<>();
        a.put(10,"a");
        a.put(20,"b");
        a.put(30,"c");
        a.put(40,"d");
        a.put(50,"e");
        System.out.println(a.remove(20));
        System.out.println(a.remove(40,"d"));
        System.out.println(a);
    }
}
