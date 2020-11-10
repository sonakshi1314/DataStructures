package Stack1;

import java.util.ArrayList;
import java.util.Stack;

public class NGL {

	public static void main(String[] args) {
		int[] arr= {3,4,1,6,2,8};
		Stack<Integer> s=new Stack<>();
		ArrayList<Integer> al=new ArrayList<>();
		 solve(arr,s,al);
	}

	private static void solve(int[] arr, Stack<Integer> s, ArrayList<Integer> al) {
		 for(int i=0;i<arr.length;i++) {
			 if(s.size()==0)
				 al.add(-1);
			 else if(s.size()>0 && s.peek()>arr[i])
			      al.add(s.peek());
			 else if(s.size()>0 && s.peek()<arr[i]) {
				 while(s.size()>0 && s.peek()<arr[i])
					 s.pop();
				 if(s.size()==0)
					 al.add(-1);
				 if(s.size()>0 && s.peek()>arr[i])
				      al.add(s.peek());
			 }
			 
			 
			 s.add(arr[i]);
		 }
		 for(int i=0;i<al.size();i++)
			 System.out.print(al.get(i)+" ");
	}

}
