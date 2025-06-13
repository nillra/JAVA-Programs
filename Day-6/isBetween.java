import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        s.nextLine(); 
        String[] date = new String[n];
        System.out.println("Enter the dates");
        for (int i = 0; i < n; i++) {
            date[i] = s.nextLine();
        }
        System.out.println("Enter the start date ");
        String start = s.nextLine();
        System.out.println("Enter the last date ");
        String last = s.nextLine();
        for (String d : date) {
            if (isBetween(d, start, last)) {
                System.out.println(d);
            }
        }
    }
    static boolean isBetween(String d, String start, String last) {
        return d.compareTo(start) >= 0 && d.compareTo(last) <= 0;
    }
}
