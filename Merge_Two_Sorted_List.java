import java.util.Scanner;
import java.util.*;
public class Merge_Two_Sorted_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll1=new LinkedList<>();
		LinkedList<Integer> ll2=new LinkedList<>();
		//LinkedList<Integer> ll3=new LinkedList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int t=scan.nextInt();
		for(int i=0;i<t;i++) {
			System.out.println("Enter the length of first linkedList: ");
			int n1=scan.nextInt();
			
			for(int j=0;j<n1;j++) {
				System.out.println("Enter the elements of first linkedList:  ");
				int value1=scan.nextInt();
				ll1.add(value1);
			}
			System.out.println("Enter the length of second linkedList: ");
			int n2=scan.nextInt();
			for(int k=0;k<n2;k++) {
				System.out.println("Enter the elements of second linkedList:  ");
				int value2=scan.nextInt();
				ll2.add(value2);
			}
			
			ll1.addAll(ll2);
			Collections.sort(ll1);
			System.out.println(ll1);
			ll1.clear();
			ll2.clear();
			
			
			
			
		/*	ll3.addAll(ll1);
			ll3.addAll(ll2);
			Collections.sort(ll3);
			System.out.println(ll3);
			ll1.clear();
			ll2.clear();
			ll3.clear();
*/
			}
		

	}

}
