import java.util.Arrays;

public class kNAPSACK_PROBLEM {
	
        static int t[][]=new int[4][8];
        /*
	public static void main(String[] args) {
	    int[] wt= {1,2,3};
	    int[] value= {10,15,40};
	    int w=7;
	    int n=wt.length;
	    for (int[] row: t)
	        Arrays.fill(row, -1);
	 int ans=   knapsack(wt,value,w,n);
	 System.out.println(ans);

	}
	static int knapsack(int[] wt,int[] value,int w,int n) {
		 if(n==0|| w==0)
			 return 0;
		   if(t[n][w]!=-1)
			   return t[n][w];
		   else {
		if(wt[n-1]<=w) {
			return Math.max(value[n-1]+knapsack(wt,value,w-wt[n-1],n-1), knapsack(wt,value,w,n-1));
		}
		else if(wt[n-1]>w) {
			return knapsack(wt,value,w,n-1);
		}
		   }
		return t[n][w];
	}
  */
	
	
	
	public static void main(String[] args) {
	    int[] wt= {1,2,3};
	    int[] value= {10,15,40};
	    int w=7;
	    int n=wt.length;
	     knapsack(wt,value,w,n);
		
	}
	
	static void knapsack(int[] wt,int[] value,int w,int n)    {
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0 || j==0)
					t[i][j]=0;
			}
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(wt[i-1]<=j) {
					 t[i][j]=Math.max(value[i-1]+ t[i-1][j-wt[i-1]], t[i-1][j]);
				}
				else if(wt[i-1]>j) {
					 t[i][j]=t[i-1][j];
				}
			}
		}
		      int ans= t[n][w];
		      System.out.println(ans);
	}
	
	
	//return t[n][w];
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	

