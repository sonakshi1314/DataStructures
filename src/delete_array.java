import java.util.ArrayList;
import java.util.Arrays;




public class delete_array {

	public static void main(String[] args) {
		 ArrayList<Integer> al=new  ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(23);
		al.add(23);
		al.add(23);
		al.add(23);
		al.add(23);
		al.add(23);
		int n=al.size();
		int left=al.indexOf(al.get(0));
		int right=al.lastIndexOf(al.get(al.size()-1));
		System.out.println(al);
		System.out.println(al.size());
		delete(al,left,right);
       System.out.println(al);
	}

	private static void delete(ArrayList<Integer> al,int left,int right) {
		while(left<=right) {
		int mid=left+(right-left)/2;
		  for(int i=1;i<al.size()-1;i++) {
			  if((al.get(i-1)==al.get(mid)) && (i>0) && (mid>0) &&  i<al.size() ){
				  al.remove(mid);
				  right=mid+1;
				 // delete(al,left,mid-1);
			  }
			  else if(al.get(i+1)==al.get(mid) && i<al.size()) {
				  al.remove(mid);
				  left=mid+1;
				//  delete(al,mid+1,right);
			  }
		  }
			
		}

	}

	

}
