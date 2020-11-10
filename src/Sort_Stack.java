import java.util.Stack;
import java.util.Vector;

public class Sort_Stack {

	public static void main(String[] args) {
		Stack<Integer> v=new Stack<>();
		v.add(10);
		v.add(1);
		v.add(17);
		v.add(7);
		v.add(67);
		v.add(98);
		System.out.println("Intitial stack"+v);
		sort(v);
		System.out.println("Sorted stack"+v);
	}

	private static void sort(Vector<Integer> v) {
	     if(v.size()==1)
	    	 return;
		 Integer temp = v.lastElement();
		 v.remove(v.size()-1);
		 sort(v);
		 insert(v,temp);
	}

	private static void insert(Vector<Integer> v, int temp) {
		if(v.size()==0 || v.lastElement()<=temp)
		{
		   v.add(temp);
		   return;
		}
		Integer last = v.lastElement();
		v.remove(v.size()-1);
		insert(v,temp);
		v.add(last);
		return;
	}

}
