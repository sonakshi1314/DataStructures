package DYNAMIC_PROGRAMMING;

public class recursion_demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int X=8;
		int n=arr.length;
		System.out.println(check(arr,X,n));

	}

	private static boolean check(int[] arr, int x, int n) 
	{
		if(n==0)
			return false;
		if(x==arr[n-1])
			return true;
		return check(arr,x,n-1);	
		// TODO Auto-generated method stub
		
	}

}
