import java.util.Stack;

public class test_1 {

	public static void main(String[] args) {
	  Integer[] arr= {4,8,8,9,9,5,4};
	  Stack<Integer> s=new Stack<>();
	  for(Integer i=0;i<arr.length;i++) {
		s.push(arr[i]);
	  }
       for(int i=0;i<arr.length;i++) {
    	   if(s.peek()!=arr[i] && s.size()>0) {
    		   s.pop();
    	        i--;
    	   }
    	   else
    		   System.out.println(s.peek());
       }
	}

}
