package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static boolean anagram(String a, String b){
//        a = a.toLowerCase();
//        b = b.toLowerCase();
//        if(a.length()!=b.length())
//            return false;
//        Map<Character, Integer> m = new HashMap<>();
//        for(char ch:a.toCharArray()){
//            m.put(ch,m.getOrDefault(ch,0)+1);
//        }
//        for(char ch: b.toCharArray()){
//            if(!m.containsKey(ch)){
//                return false;
//            }
//            else {
//                m.put(ch,m.get(ch)-1);
//                if(m.get(ch)==0)
//                    m.remove(ch);
//            }
//        }
//        return m.isEmpty();
        a = a.toLowerCase();
        b= b.toLowerCase();
        if(a.length()!=b.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:a.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:b.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            else {
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
            }
        }
        return map.isEmpty();
    }
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String 1 value: ");
        String a = s.nextLine();
        System.out.println("Enter String 2 value: ");
        String b = s.nextLine();
        System.out.println(anagram(a,b));
    }
}
