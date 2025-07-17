package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void freq(String a){
//        String b = a.toLowerCase();
//        Map<Character, Integer> m = new HashMap<>();
//        for(char ch:b.toCharArray()){
//            if(!m.containsKey(ch))
//                m.put(ch,1);
//            else
//                m.put(ch,m.get(ch)+1);
//        }
//        for(Map.Entry<Character, Integer> temp:m.entrySet())
//            System.out.print(temp.getKey()+" "+temp.getValue()+" ");
        a = a.toLowerCase().replaceAll("[^a-z\\s]"," ");
        String[] words = a.split("\\s+");
        Map<String, Integer> m = new LinkedHashMap<>();
        for(String word:words){
            if(!m.containsKey(word))
                m.put(word,1);
            else
                m.put(word,m.get(word)+1);
        }
        for(Map.Entry<String, Integer> temp:m.entrySet()){
            System.out.print(temp.getKey()+": "+temp.getValue()+" ");
        }
    }
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = s.nextLine();
        freq(a);
    }
}
