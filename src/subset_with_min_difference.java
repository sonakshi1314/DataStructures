import java.util.ArrayList;
import java.util.Vector;

public class subset_with_min_difference {
      static boolean t[][]=new boolean[5][24];
	public static void main(String[] args) {
		int arr[] = {1, 6, 11, 5} ;
		int n=arr.length;
             subset_diff(arr,n);
	}

	private static void subset_diff(int[] arr, int n) {
		int sum=0;
		int ans=Integer.MAX_VALUE;
		final Vector<Integer> v=new Vector<>();
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
			subset_exit(arr,sum,n);
		
		for(int i=4,j = sum / 2; j >= 0; j--) {
			if(t[i][j]==true)
				v.add(j);
				
		}
		for(int i=0;i<v.size();i++) {
			 
		 ans=Math.min(ans,sum-2*v.get(i));
		 
		}
		System.out.println(ans);	
	}

	private static void subset_exit(int[] arr, int sum, int n) {
		
	        for (int i = 0; i <= n; i++) 
	            t[i][0] = true; 
	      
	      	        for (int i = 1; i <= sum; i++) 
	            t[0][i] = false; 
	      
	        for (int i = 1; i <= n; i++) 
	        { 
	            for (int j = 1; j <= sum; j++) 
	            { 
	                // If i'th element is excluded 
	                t[i][j] = t[i - 1][j]; 
	      
	                // If i'th element is included 
	                if (arr[i - 1] <= j) 
	                    t[i][j] |= t[i - 1][j - arr[i - 1]]; 
	            } 
		
	}

	}
}
