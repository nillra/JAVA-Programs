import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "sai");
        h.put(2, "Abhi");
        h.put(3, "vinay");
        System.out.println("Student List:");
        System.out.println("Rollno       Name");
        for (Integer rollNo : h.keySet()) {
            System.out.println( rollNo +"           "+ h.get(rollNo));
        }
    }
}
