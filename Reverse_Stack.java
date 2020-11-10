import java.util.Stack;

public class Reverse_Stack 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(5);
		s.push(9);
		s.push(10);
		s.push(12);
		//s.push(5);
		//s.push(6);
		System.out.println("Intial staclk"+ s);
		removeMiddle(s);
		System.out.println("Reversed Stack "+s);

	}

	private static void removeMiddle(Stack<Integer> s) 
	{
		// TODO Auto-generated method stub
		if(s.size()==1)
		{
			return;
		}
		int val=s.peek();
		s.pop();
		removeMiddle(s);
		insert(s,val);
		
	}

	private static void insert(Stack<Integer> s, int val) {
		// TODO Auto-generated method stub
		if(s.size()==0)
		{
			s.push(val);
			return;
		}
		int temp=s.peek();
		s.pop();
		insert(s,val);
		s.push(temp);
		return;
	}

	
}
