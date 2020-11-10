
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{      
	public static void main(String[] args){
		int[] arr= {100,80,60,70,60,75,85};
		int[] ans=new int[arr.length];
		int count=1;
		Stack<Integer> s=new Stack<>();
		
		solve(arr,count,ans,s);
	
			System.out.println(Arrays.toString(ans));
	}
	
	static void solve(int[] arr,int count,int[] ans,Stack<Integer> s) {
		for(int i=0;i<arr.length;i++) {
			
			 s.push(arr[i]);
			 System.out.println(s);
			 while(!s.isEmpty()) {
			 if(s.peek()<=arr[i])
					count++;
				s.pop();
			 }
			ans[i]=count;
			count=1;
		}
	}
	}  