
public class max_diff {

	public static void main(String[] args) {
		int[] arr= {7, 9, 5, 6, 3, 2};
		int max=0;
		int n=arr.length;
		max_difference(arr,n,max);
          // System.out.println(max);
	}

	private static void max_difference(int[] arr, int n, int max) {
		int diff=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1;j++) {
				diff=arr[j]-arr[i];
				max=Math.max(max, diff);
			}
		}
		System.out.println(max);
	}

}
