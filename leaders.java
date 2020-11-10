import java.util.Stack;

public class leaders {

	public static void main(String[] args) {
	Stack<Integer> s= new Stack<>();
	s.push(12);
	s.push(34);
	s.push(5);
	s.push(7);
	s.push(87);
	s.push(9);
	s.push(23);
	int n=s.size();
	int temp=s.get(s.size()-1);
	  solve(s,n,temp);

	}

	private static void solve(Stack<Integer> s, int n,int temp) {
		for(int i=0;i<n;i++) {
			if(s.size()==0)
				return;
			else if(s.peek()>=temp) {
		System.out.print(s.peek()+" ");
		s.pop();
			}
			else if(s.peek()<temp) {
				s.pop();
			temp=s.peek();
			}
	}

}
}