import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> ll=new LinkedList<>();
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the number of test cases: ");
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++) {
		System.out.println(" Enter the number of nodes in each case: ");
		
		int n =scan.nextInt();
		
		for(int j=0;j<n;j++) {
			System.out.println(" Enter the node values : ");
			
			int v =scan.nextInt();
			   ll.add(v);
			   
		}
		System.out.println(ll);
		//Collections.reverse(ll);
		//System.out.println(ll);
		//ll.clear();
		//for(int j=n-1;j>=0;j--)
		//{
			//System.out.println(ll.get(j));
		//}
		//ll.clear();
		
		
		}	
		
	}

}
