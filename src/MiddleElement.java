import java.util.Scanner;
import java.util.*;
public class MiddleElement {

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
		 int s =ll.size();
		 System.out.println(s);
		    if(s%2 == 0)
		    {
			int ans=(s/2);
			System.out.println(ll.get(ans ));
			
		    }
		else 
	     	{
			
			   int ans1=(int)Math.floor(s/2);
			   System.out.println(ll.get(ans1));
		   }
		    ll.clear();
		}
		
	
	}


}
