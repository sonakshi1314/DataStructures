
public class Smallest_Subarray {

	public static void main(String[] args) 
	{
				int[] arr= {4,2,2,7,8,1,2,8,1,0};
				/***
				int curr_sum =0;
				int min_elements=Integer.MAX_VALUE;
				int count=0;
				int j=0;
				int i=0;
				while(i<arr.length)
				{
					curr_sum=0;
					count=0;
				for(i=j;i<arr.length;i++)
				{
					curr_sum=curr_sum+arr[i];
					count++;
					if(curr_sum>=8)
					{
						j++;
						min_elements=Math.min(min_elements, count);
						break;
					}
					
	
					
					
				}
				}
				System.out.println(min_elements);
				
				***/
				
				
				int curr_sum=0;
				int smallest_sum=Integer.MAX_VALUE;
				int start=0;
				int end=-1;
				int curr_value=0;
				int start_f = 0;
				int end_f=0;
					int min_vaue=Integer.MAX_VALUE;
					for(int i=0;i<arr.length;i++) {
						curr_sum=curr_sum+arr[i];
						end++;
				      while(curr_sum>=8) {
				    curr_value=end-start+1;
					//min_vaue=Math.min(min_vaue, curr_value);
					if(min_vaue>curr_value)
					{
						min_vaue=curr_value;
						start_f = start;
						end_f=end;
					}
					curr_sum=curr_sum-arr[start];
					start++;
				}
		}
            System.out.println(min_vaue);
            System.out.println(start_f);
            System.out.println(end_f);
            //System.out.println(arr.toString().substring(start_f, end_f+1));
            for(int k=start_f;k<=end_f;k++)
            {
            	System.out.println(arr[k]);
            }
	}

}
