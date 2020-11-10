import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Phone_Directory 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		TreeMap<Character,TreeMap<String,String>> tm=new TreeMap<>();
		while(true)
		{
			System.out.println("1. Press 1 for displaying entire dictionary");
			System.out.println("2. Press 2 for inserting data to current dictionary");
			System.out.println("3. Press 3 for deleting a record in dictionary");
			System.out.println("4. Press 4 for searching");
			System.out.println("5. Press 5 to exit");
			System.out.println("Enter your choice");
			int n=scan.nextInt();
			switch(n)
			{
			case 1: //display(tm);
			        break;
			case 2 : System.out.println("Enter the name you want to insert");
					 String name=scan.next();
					 System.out.println("Enter the phone number you want to insert");
					 String phone_no=scan.next();
					 insert(tm,name,phone_no);
			         break;
			case 3: //delete(tm);
			        break;
			case 4 : //search(tm);
					 break;
			case 5: //end();
					break;
			default: System.out.println("Incorrect value passed from menu");
			          break;
			}
		}
	}

	private static void insert(TreeMap<Character, TreeMap<String, String>> tm, String name, String phone_no) 
	{
		// TODO Auto-generated method stub
		if(check_phone_no(phone_no))
		{
			char c=name.charAt(0);
			c=Character.toUpperCase(c);
			int f=0;
			
			if(tm.get(c) == null)
			{
				TreeMap<String,String> tm1=new TreeMap<String,String>();
				tm.put(c, tm1);
				tm1.put(name, phone_no);
				System.out.println("Data Inserted");
			}
			else
			{
				for (Entry<String, String> entry : tm.get(c).entrySet())
				{
					if(entry.getKey()==name)
					{
						System.out.println("Already exists ");
						f=1;
						break;
					}
				}
				
				if(f!=1)
				{
					tm.get(c).put(name, phone_no);
					System.out.println("Data inserted");
				}
				
			}
		}
		else
		{
			System.out.println("Incorrect phone number added , please add correct one ");
		}
		
		
	}

	private static boolean check_phone_no(String phone_no) 
	{
		// TODO Auto-generated method stub
		if(phone_no.length()==10 && !phone_no.startsWith("0"))
			return true;
		return false;
	}

}
