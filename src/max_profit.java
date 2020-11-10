
public class max_profit {

	public static void main(String[] args) {
	int[] arr= {100,180,260,310,40,535,695};
	int n=arr.length;
	int max=0;
	solve(arr,n,max);

	}

	private static void solve(int[] arr, int n, int max) {
		int i=0;
		int j=0;
	    for( i=0;i<n-1;i++) {
	    	for( j=i+1;j<n-1;j++) {
	    		if(arr[j]>arr[i]) {
	    			max=Math.max(max,arr[j]-arr[i]);
	    		}
	    		System.out.println(i+" "+ j);
	    	}
	    	// System.out.println(i+" "+ j);
	    	}
	   // System.out.println(i+" "+ j);
	    		
	    		
	    			int k=0;
	    			int m=0;
	    			for( k=j;k<n-1;k++) {
	    				for( m=k+1;m<n-1;m++) {
	    					if(arr[m]>arr[k]) {
	    						max=Math.max(max,arr[k]-arr[m]);
	    		    		}
	    					System.out.println(k+ " "+m);
	    				}
	    			//	System.out.println(k+ " "+m);
	    			}
	    			//System.out.println(k+ " "+m);
	    		
	    	
	    }
	    
	}


