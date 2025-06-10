package sai;
import java.util.*;
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<Integer> r=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int m,n=s.nextInt();
        for(int i=0;i<n;i++)
        {
        	m=s.nextInt();
        	l.add(m);
        }
        int q=n-1;
        for(int i=0;i<n;i++)
        {
        	r.add(l.get(q));
        	q--;
        }
        System.out.println("Reverse list is "+r);
        
	}

}
