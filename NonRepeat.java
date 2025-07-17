package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeat {
    public static void nonRepeatingCharacter(String a){
        a =  a.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:a.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch,1);
            else
                map.put(ch,map.get(ch)+1);
        }
        for(Map.Entry<Character,Integer> temp:map.entrySet()){
            if(map.get(temp)==1){
                System.out.println(temp);
            }
        }
    }
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        nonRepeatingCharacter(a);
    }
}
