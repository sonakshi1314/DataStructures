import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer,String > tm = new TreeMap<>();
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the no of key,Value pairs : ");
		int n = scan.nextInt();
		for(int i=0; i<n;i++) {
			System.out.println(" Enter the first alphabet, Phone Number and the corresponding name : ");
	//	char ch= scan.next().charAt(0);
        Integer in = scan.nextInt();
		String str = scan.next();
		
		
		tm.put(in,str);
		}
		//Display current record :
		System.out.println(" the records are as follows:");
		System.out.println(tm);
		System.out.println(" the records are as follows:");
		for(Map.Entry m: tm.entrySet())
			System.out.println(m.getKey() + " "+ m.getValue());
		//Add new record:
		System.out.println("Enter the number of new records :  ");
		int r=scan.nextInt();
		for(int i=0;i<r;i++) {
			System.out.println(" Enter the new record : ");
		  Integer itr = scan.nextInt();
			String s = scan.next();
			tm.put(itr, s);
		}
		System.out.println(" the records are as follows:");
			for(Map.Entry mp: tm.entrySet())
				System.out.println(mp.getKey() + " "+ mp.getValue());
			//Delete a record:
			System.out.println("Enter the number of records which you want to delete :  ");
			int d=scan.nextInt();
			for(int i=0;i<d;i++) {
			System.out.println("enter the record which you want to delete : ");
			 Integer it = scan.nextInt();
				String st = scan.next();
				tm.put(it, st);
			}
			System.out.println(" the records are as follows:");
				for(Map.Entry mpp: tm.entrySet())
					System.out.println(mpp.getKey() + " "+ mpp.getValue());
				// Exit from a program:
				System.exit(0);
				
		
		
		

	}

}
