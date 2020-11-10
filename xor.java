
public class xor {

	public static void main(String[] args) {
		int[] arr= {5,9,7,6};
		int ans=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				temp=arr[i]^arr[j];
				ans=ans+temp;
			}
			
		}
         System.out.println(ans);
         System.out.println(8^6^18^2);
	}

}
