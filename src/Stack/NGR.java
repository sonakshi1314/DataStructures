package Stack;

import java.util.*;
import java.util.Stack;
public class NGR {

	public static void main(String[] args) {
		int[] arr= {3,4,1,6,2,8};
		Stack<Integer> s=new Stack<>();
		ArrayList<Integer> al=new ArrayList<>();
		 solve(arr,s,al);
	}

	private static void solve(int[] arr, Stack<Integer> s, ArrayList<Integer> al) {
		 for(int i=arr.length-1;i>=0;i--) {
			 if(s.size()==0)
				 al.add(-1);
			 else if(s.size()>0 && s.peek()>arr[i])
				 al.add(s.peek());
			 else if(s.size()>0 && s.peek()<arr[i]) {
				 while(s.size()>0 && s.peek()<arr[i]) {
					 s.pop();
				 }
				 if(s.peek()>arr[i])
					 al.add(s.peek());
				 if(s.size()==0)
					 al.add(-1);
			 }
			 
			 s.add(arr[i]);
		 }
	for(int i=al.size()-1;i>=0;i--)
		System.out.print(al.get(i)+" ");
	}

}
