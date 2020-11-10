package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class unbounded_knapsack {
	static int t[][]=new int[5][31];
	public static void main(String[] args) {
		   int[] wt= {25, 5,10};    
		//   int[] value= {10, 40, 50, 70};
		   int w=30;
		   int n=wt.length;
		   for (int[] row: t)
		        Arrays.fill(row, -1);
			   
		 int ans=  solve(wt,n,w);
          System.out.println(ans);
	}

	private static int solve(int[] wt,  int n, int w) {
		if(n==0)
			return Integer.MAX_VALUE-1;
		if(w==0)
			return 0;
		if(t[n][w]!=-1)
			return t[n][w];
		else {
		if(wt[n-1]<=w) {
	      return t[n][w]=Math.min(solve(wt,n,w-wt[n-1])+1 , solve(wt,n-1,w));
		}
		else if(wt[n-1]>w) {
			return t[n][w]=solve(wt,n-1,w);
		 }
		}
		 return t[n][w];
	}
	
}
          

