package HashMap;

import java.util.*;

public class characterCount {
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = s.nextLine();
        List<Character> l = new ArrayList<>();
        for(char ch:a.toCharArray()){
            if(!l.contains(ch))
                l.add(ch);

        }
        for(Character temp:l){
            System.out.print(temp+" ");
        }
    }
}
class Count{
    public static void count(String a){
        a = a.toLowerCase();
        Map<Integer, Character> map = new LinkedHashMap<>();
        for(char ch:a.toCharArray()){
            if(ch!=' '){

            }
        }

    }
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = s.nextLine();
        count(a);
    }
}
