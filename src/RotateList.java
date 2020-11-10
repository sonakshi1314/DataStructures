import java.util.Scanner;
import java.util.*;
public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
	//	LinkedList<Integer> ll1=new LinkedList<>();
	//	LinkedList<Integer> ll2=new LinkedList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println(" Length of the linkedList is : ");
			int n=scan.nextInt();
			for(int j=0;j<n;j++) {
				System.out.println("Elements of the LinkedList are : ");
				int value=scan.nextInt();
				ll.add(value);
			}
			System.out.println("Enter the value by which LinkedList is to be rotated : ");
			int k=scan.nextInt();
		//	int s=k;
			//if(s<n)
			for(int s=k;s<n;s++){
				//ll1.add(ll.get(s));
				System.out.println(ll.get(s));
				//s++;
			}
		
			int b =(n-1);
			if( b==(n-1))
			{     
				b=0;
				for(b=0;b<k;b++)
					//ll2.add(ll.get(s));
					System.out.println(ll.get(b));
			}
			//ll.addAll(ll1);
			//ll.addAll(ll2);
		//	 System.out.println(ll);
            ll.clear();
			}
		//ll.clear();
                   
	}
    
	

}
