import java.util.Stack;

public class Duplicate_Characters {

	public static void main(String[] args) {
		 String str="((a+b)+(c+d))";
		 Stack<Character> s=new Stack<>();
		 
		 find_duplicate(str,s);

	}

	private static void find_duplicate(String str, Stack<Character> s) {
		 for(int i=0;i<str.length();i++) {
			 s.add(str.charAt(i));
			 if(str.charAt(i)==')') {
				 while(s.peek()=='(')
					 s.pop();
			 }
		 }
		if(s.size()!=0)
			System.out.println(true);
		else 
			System.out.println(false);
	}

}
