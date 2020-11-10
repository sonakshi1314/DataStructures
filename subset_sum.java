import java.util.Arrays;

public class subset_sum {
      //  static boolean t[][]=new boolean[7][31];
	static int t[][]=new int[5][2];
	public static void main(String[] args) {
	     	int[] arr = {1,1,1,1};
			int sum = 1;
			int n=arr.length;
		    subset(arr,sum,n);
		 
		     
	}
			/*
			for (boolean[] row: t)
		        Arrays.fill(row, false
              boolean ans=subset(arr,sum,n);
              System.out.println(ans);
	}
             static boolean subset(int[] arr,int sum,int n) {
            	 if(sum==0)
            		 return true;
            	 if(n==0)
            		 return false;
            	 if(t[n][sum]!=false)
            		 return t[n][sum];
            	 else {
            	 if(arr[n-1]<=sum) {
            		 return subset(arr,sum-arr[n-1],n-1)||subset(arr,sum,n-1);
            	 }
            	 else if(arr[n-1]>sum) {
            		return subset(arr,sum,n-1);
            	 }
            	 }
            	 return t[n][sum];
            	 */
            static void subset(int[] arr,int sum,int n) {
			
			for(int i=0;i<n+1;i++) {
				for(int j=0;j<sum+1;j++) {
					if(i==0)
						t[i][j]=0;
					else if(j==0)
						t[i][j]=1;
				}
			}
			for(int i=1;i<n+1;i++) {
				for(int j=1;j<sum+1;j++) {
					if(arr[i-1]<=j) {
						t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
					}
					else if(arr[i-1]>j) {
						t[i][j]=t[i-1][j];
					}
				}
			}
			 int ans=t[n][sum];
			 System.out.println(ans);
			 
			
            }
            
}
			

