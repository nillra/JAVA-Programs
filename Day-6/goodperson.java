// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string s1");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter the second string s2");
        String s2=s.nextLine();
        int c=good(s1,s2);
        System.out.println("No of good persons "+c);
    }
    static int good(String s1,String s2)
    {
        HashMap<Character,Integer>m1=new HashMap<>();
        HashMap<Character,Integer>m2=new HashMap<>();
        for(char i:s1.toCharArray())
        {
            if(m1.containsKey(i))
             m1.put(i,m1.get(i)+1);
            else
             m1.put(i,1);
        }
        for(char i:s2.toCharArray()){
            if(m2.containsKey(i))
             m2.put(i,m2.get(i)+1);
            else
             m2.put(i,1);
        }
        int c1=0;
        for(Character c:m1.keySet()){
            if(m2.containsKey(c)&&m1.get(c)==2&&m2.get(c)==3)
             c1++;
        }
        return c1;
    }
}