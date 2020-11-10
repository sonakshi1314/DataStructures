import java.util.Vector;

public class SortArray {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(1);
		v.add(17);
		v.add(7);
		v.add(67);
		v.add(98);
		sort(v);
		System.out.println(v);
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
