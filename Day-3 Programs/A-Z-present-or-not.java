
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();int s1;
         HashSet<Character> uniqueChars = new HashSet<>();
        for (char ch : a.toCharArray()) {
            if( ch >=97 && ch <=122)
              uniqueChars.add(ch);
    
        }
        if(uniqueChars.size()==26)
         System.out.println("ALL the character are present");
        else
         System.out.println("Not present");
    }
}