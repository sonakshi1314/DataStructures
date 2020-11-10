import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;
public class heap1 {

	public static void main(String[] args) {
	        int[] arr= {10,4,5,1,3,2};
		  if(arr.length==0)
			  System.out.println(0);
		  Arrays.sort(arr);
		  int current=1;
		  int longest=1;
		  for(int i=1;i<arr.length;i++) {
			  if(arr[i]!=arr[i-1]) {
				  if(arr[i]==arr[i-1]+1) {
					   current++;
				  }
				  else
				  {
					  longest=Math.max(current,longest);
					  current=1;
				  }
			  }	  
		  }
		  System.out.println(longest);
	}

}
