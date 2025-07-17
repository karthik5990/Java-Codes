package HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetValue {
    public static void main(String... args){
        Map<String,Integer> a = new HashMap<>();
        a.put("a", 1);
        a.put("b",2);
        a.put("c",3);
        a.put("d",4);
        a.put("e",5);
        a.put("f",6);
        System.out.println(a.get("a"));
        System.out.println(a.get("b"));
        System.out.println(a);
    }
}
