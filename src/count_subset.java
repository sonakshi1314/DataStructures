import java.util.Arrays;

public class count_subset {
	static int t[][]=new int[5][7];
    
	public static void main(String[] args) {
	     	int[] arr = {3,3,3,3};
			int sum = 6;
			int n=arr.length;
		 
			//for (int[] row: t)
		    //    Arrays.fill(row, -1);
             subset(arr,sum,n);
             // System.out.println(ans);
	}
	
	
	
	 static void subset(int[] arr,int sum,int n) {
			
			for(int i=0;i<n+1;i++) {
				for(int j=0;j<sum+1;j++) {
					 if(i==0 && j==0)
						t[i][j]=1;
					 if(i==0&&j!=0)
						   t[i][j]=0;
				     if(j==0 && i!=0)
						t[i][j]=1;
				     
					
				}
			}
			 for(int i=0;i<n+1;i++) {
				  for(int j=0;j<sum+1;j++) {
					  System.out.print(t[i][j]+" ");
				  }
				  System.out.println();
			  }
			for(int i=1;i<n+1;i++) {
				for(int j=1;j<sum+1;j++) {
					if(arr[i-1]<=j) {
						t[i][j]=(t[i-1][j-arr[i-1]])+(t[i-1][j]);
					}
					else if(arr[i-1]>j) {
						t[i][j]=t[i-1][j];
					}
				}
			}
			 for(int i=0;i<n+1;i++) {
				  for(int j=0;j<sum+1;j++) {
					  System.out.print(t[i][j]+" ");
				  }
				  System.out.println();
			  }
			 int ans=t[n][sum];
			 System.out.println(ans);
			 
			
         }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
             static int subset(int[] arr,int sum,int n) {
            	 if(n==0)
            		 return 0;
            	 if(sum==0)
            		 return 1;
            	 if(t[n][sum]!=-1)
            		 return t[n][sum];
            	 else {
            	 if(arr[n-1]<=sum) {
            		 return subset(arr,sum-arr[n-1],n-1)+subset(arr,sum,n-1);
            	 }
            	 else if(arr[n-1]>sum) {
            		return subset(arr,sum,n-1);
            	 }
            	 }
            	 return t[n][sum];
             }
             */
}
