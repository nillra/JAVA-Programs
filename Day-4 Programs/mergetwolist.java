package sai;
import java.util.*;
public class mergetwolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		ArrayList<Integer> r=new ArrayList<>();
		int m,q,z;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of first array ");
        int n=s.nextInt();
        System.out.println("Enter the elements to first array");
        for(int i=0;i<n;i++) {
        	q=s.nextInt();
        	a1.add(q);
        	r.add(q);
        }
        System.out.println("Enter the sizde of the second array");
        m=s.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++) {
        	q=s.nextInt();
        	a2.add(q);
        	r.add(q);
        }
        Collections.sort(r);
        System.out.println("Merge the two arrays "+r);
	}

}
