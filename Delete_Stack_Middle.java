import java.util.Stack;

public class Delete_Stack_Middle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		int n=s.size();
		int mid;
		if(n%2==0)
		{
			mid=(n+1)/2;
		}
		else
		{
		  	mid=n/2;
		}
		System.out.println("Intial staclk"+ s);
		removeMiddle(s,mid);
		System.out.println(s);

	}

	private static void removeMiddle(Stack<Integer> s, int mid) 
	{
		// TODO Auto-generated method stub
		if(s.peek()==s.elementAt(mid))
		{
			s.pop();
			return;
		}
		int val=s.peek();
		s.pop();
		removeMiddle(s, mid);
		s.push(val);
		return;
		
	}

}
