
public class equal_sum_partition {
	static boolean t[][]=new boolean[5][12];
	public static void main(String[] args) {
		int[] arr = {1,5,11,5};
		int n=arr.length;
	
		boolean ans=equal_partition(n,arr);
		System.out.println(ans);

	}
	static boolean equal_partition(int n,int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		if(sum%2 !=0)
			return false;
		else {
     			for(int i=0;i<n+1;i++) {
				for(int j=0;j<sum/2+1;j++) {
					if(i==0)
						t[i][j]=false;
					else if(j==0)
						t[i][j]=true;
				}
			}
			for(int i=1;i<n+1;i++) {
				for(int j=1;j<sum/2+1;j++) {
					if(arr[i-1]<=j) {
						t[i][j]=t[i-1][j-arr[i-1]]||t[i-1][j];
					}
					else if(arr[i-1]>j) {
						t[i][j]=t[i-1][j];
					}
				}
			}
			 return t[n][sum/2];
		//	 System.out.println(ans);
			 
			
         }
	}
}
