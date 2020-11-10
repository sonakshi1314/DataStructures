import java.util.Collections;
import java.util.PriorityQueue;


public class K_closest_number {
	  static class Pair implements Comparable<Pair>{
		  int a;
		  int b;
		  Pair(int a,int b){
			  this.a=a;
			  this.b=b;
		  }

		@Override
		public int compareTo(Pair o) {
		//	System.out.println("Value of this : " + this.b);
		//	System.out.println("Value of pair passed : " + o.b);
		///	System.out.println("Value retured : " + (this.b-o.b));
			return o.a - this.a;
			
		}
	//	 public Integer getValue() 
		  //  { 
		  //      return b; 
		  //  } 
		  public String toString() {
		    return b + "";
	  }
	  }
	public static void main(String[] args) {
	  int[] arr= {5,6,7,8,9,3,4};
	  int K=3;
	  int X=7;
	   PriorityQueue<Pair> pq=new PriorityQueue<>();
	    for(int i=0;i<arr.length;i++) {
	    	Pair p=new Pair(Math.abs(arr[i]-X),arr[i]);
	    	pq.add(p);
	    	if(pq.size()>K) {
	    		pq.poll();
	    		
	    	}
	    }
        while(pq.size()>0) {
              System.out.println(pq.peek());	
              pq.poll();
        }
	}

	
}
