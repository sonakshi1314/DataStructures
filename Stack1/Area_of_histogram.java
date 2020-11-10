package Stack1;
 import java.util.*;
public class Area_of_histogram {

	public static void main(String[] args) {
		 int[] arr= {6, 2, 5, 4, 5, 1, 6};
		   Stack<Integer> s1=new Stack<>();
		   Stack<Integer> s2=new Stack<>();
		   ArrayList<Integer> al1=new ArrayList<>();
		   ArrayList<Integer> al2=new ArrayList<>();
		   
		   ArrayList<Integer> ans1=NSL(arr,s1,al1);
		    ArrayList<Integer> ans2= NSR(arr,s2,al2);
		    int value=Integer.MIN_VALUE;
		    for(int i=0;i<al1.size();i++) {
		    	int temp=ans2.get(i)-ans1.get(i)-1;
		    	int ans=temp*arr[i];
		    	 value=Math.max(value, ans);
		    }
           System.out.println(value);
	}

	private static ArrayList<Integer> NSR(int[] arr, Stack<Integer> s2, ArrayList<Integer> al2) {
		 for(int i=arr.length-1;i>=0;i--) {
			 int psedu=-1;
			 if(s2.size()==0)
				 al2.add(psedu);
			 if(s2.size()>0 && s2.peek()<arr[i])
				 al2.add(s2.peek());
			 if(s2.size()>0 && s2.peek()>arr[i]) {
				 while(s2.size()>0 && s2.peek()>arr[i])
					 s2.pop();
				 if(s2.size()==0)
					 al2.add(psedu);
				 if(s2.size()>0 && s2.peek()<arr[i])
					 al2.add(s2.peek());
			 }
				 
				 
				 s2.add(arr[i]);
		 }
		     Collections.reverse(al2);
		     return al2;
	}

	private static ArrayList<Integer> NSL(int[] arr, Stack<Integer> s1, ArrayList<Integer> al1) {
		for(int i=0;i<arr.length;i++) {
			int psedu=-1;
			if(s1.size()==0)
				 al1.add(psedu);
			 if(s1.size()>0 && s1.peek()<arr[i])
				 al1.add(s1.peek());
			 if(s1.size()>0 && s1.peek()>arr[i]) {
				 while(s1.size()>0 && s1.peek()>arr[i])
					 s1.pop();
				 if(s1.size()==0)
					 al1.add(psedu);
				 if(s1.size()>0 && s1.peek()<arr[i])
					 al1.add(s1.peek());
			 }
			 s1.add(arr[i]);
		}
		  return al1;
	}
	
	
}
