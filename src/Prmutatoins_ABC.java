
public class Prmutatoins_ABC 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="ABC";
		String op="";
		permute(a,op);

	}

	private static void permute(String a, String op) 
	{
		// TODO Auto-generated method stub
		if(a.length()==0)
		{
			System.out.println("Permuteation : "+op);
			return;
		}
		int len=a.length();
		for(int i=0;i<len;i++)
		{
			String op1=op;
			System.out.println("Value of i   " +  i + "      Value of a    "+ a);
			op1=op1+a.charAt(i);
			if(len==1)
			{
				a=a.substring(0, i);
				permute(a,op1);
			}
			else
			{
				a=a.substring(0, i) + a.substring(i + 1);
				permute(a,op1);
			}
		}
		
	}

}
