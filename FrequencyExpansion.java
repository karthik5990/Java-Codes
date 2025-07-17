package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyExpansion {
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        a = a.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch:a.toCharArray()){
            if(ch!=' ')
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:a.toCharArray()){
            if(ch==' ') {
                sb.append(" ");
            }
            else {
                int count =map.get(ch);
                for(int i=0;i<count;i++){
                    sb.append(ch);
                }
                map.put(ch,0);
            }
        }
        System.out.println(sb.toString());
    }
}
