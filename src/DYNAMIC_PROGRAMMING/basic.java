package DYNAMIC_PROGRAMMING;

public class basic {

	public static void main(String[] args) {
		
		int[] arr= {10,12,8,4};
		int count=1;
		int result=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]%2==0 && arr[i]%2!=0 ||arr[i-1]%2!=0 && arr[i]%2==0) 
				count++;
			
			result=Math.max(result, count);
		}
		
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arr= {5,-3,-2,4,1};
	//	 int[] arr= {5,-3,-2,4,1,5,-3,-2,4,1};
		 int res=arr[0];
		 
		 for(int i=0;i<arr.length;i++) {
			 int max_sum=arr[i];
			 int sum=arr[i];
			 for(int j=i;j<arr.length;j++) {
				  int index=(i+j)%arr.length;
				  sum=sum+arr[index];
				  max_sum=Math.max(max_sum,sum);
			 }
			 res=Math.max(res,max_sum );
		 }
	
		System.out.println(res);
		
		
		
		
		
		
		
		
		int[] arr= {10,10,10,30,43,43};
		int freq=1;
		int i=1;
		while(i<arr.length) {
			while(arr[i-1]==arr[i]&&i<arr.length) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			i++;
			freq=1;
		}
		*/

         }
   }