
public class print {

	public static void main(String[] args) 
	{
		solve(7);
	

	}

	private static void solve(int i) 
	{
		// TODO Auto-generated method stub
		if(i==0)
			return;  
		System.out.print(i);
		solve(i-1);
		//System.out.println(i);
	}

}
