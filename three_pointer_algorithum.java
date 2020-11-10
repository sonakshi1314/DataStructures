
public class three_pointer_algorithum {

	public static void main(String[] args) {
	    int[] arr= {0,1,1,2,0,2,0,1,2};
	    int left=0;
	    int mid=0;
	    int right=arr.length-1;
	        while(mid<=right) {
	    	switch(arr[mid]) {
	    	case 0:
	    		mid++;
	    		break;
	    
	    	case 1:
	    		int temp=arr[mid];
	    		arr[mid]=arr[left];
	    		arr[left]=temp;
	    		left++;
	    		mid++;
                break;
	    	
	    	case 2:
	    		int temp1=arr[right];
	    		arr[right]=arr[mid];
	    		arr[mid]=temp1;
	    		right--;
	    		break;
	    	}
	    }
         for(int i=0;i<arr.length;i++)
        	 System.out.println(arr[i]);
	}

}
