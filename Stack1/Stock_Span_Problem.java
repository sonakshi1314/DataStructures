package Stack1;

import java.util.ArrayList;
import java.util.Stack;


      class Pair implements Comparable<Pair>{
    	  int key;
    	  int value;
    	  Pair(int key,int value)
    	  {
    		  this.key=key;
    		  this.value=value;
    	  }
		@Override
		public int compareTo(Pair o) {
			return 0;
		}
    	  
      }
public class Stock_Span_Problem {

	public static void main(String[] args) {
		int[] arr= {100, 80, 60, 70, 60, 75, 85};
		Stack<Pair> s=new Stack<>();
		
		ArrayList<Integer> al=new ArrayList<>();
		 solve(arr,s,al);
	}
	private static void solve(int[] arr, Stack<Pair> s, ArrayList<Integer> al) {
		 for(int i=0;i<arr.length;i++) {
			 
			 if(s.size()==0)
				 al.add(-1);
			 else if(s.size()>0 && s.peek().key>arr[i])
			      al.add(s.peek().value);
			 else if(s.size()>0 && s.peek().key<arr[i]) {
				 while(s.size()>0 && s.peek().key<arr[i])
					 s.pop();
				 if(s.size()==0)
					 al.add(-1);
				 if(s.size()>0 && s.peek().key>arr[i])
				      al.add(s.peek().value);
			 }
			 
			 Pair p=new Pair(arr[i],i);
			 s.add(p);
		 }
		 for(int i=0;i<al.size();i++)
			 System.out.print(i-al.get(i)+" ");
	}

}
