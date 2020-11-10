public class factorial {

	public static void main(String[] args) 
	{
		int res=fact(7);
		System.out.println(res);
	

	}

	private static int fact(int i) 
	{
		// TODO Auto-generated method stub
		if(i==1 || i==0)
			return 1;  
		return i*fact(i-1);
		
	}

}
