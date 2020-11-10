import java.util.*;
public class Demo1
{
	public static void main(String[] args) 
	{
	TreeMap<Character,TreeMap<String,String>> tm=new TreeMap<>();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no of Entries : ");
	int n=scan.nextInt();
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter first character name,phoneNumber and respective names:");
		char c=scan.next().charAt(0);
		int it=scan.nextInt();
		String s=scan.next();
	//	tm.put(c,(it,s));
		TreeMap<Integer,String> tm1=tm.get(c);
		if(tm1==null) {
			tm1= new TreeMap<Integer,String>();
			tm.put(c,tm1);
			
		}
		tm1.put(it, s);
	}
	
	System.out.println(tm);
	for(Map.Entry m:tm.entrySet())
	{
		System.out.println(m.getKey() + " "+ m.getValue());
	}
		
	
	}
	
}
