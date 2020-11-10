import java.util.Collections;
import java.util.PriorityQueue;

public class k_closest_point_to_origin {
	  public static class Pair implements Comparable<Pair>{
		  int key;
		  int[] value;
		  Pair(int key,int[] value){
			  this.key=key;
			  this.value=value;
		  }
		  public int compareTo(Pair o) {
		    return  o.key-this.key;
		  }
		   public void getValue() {
			   //for(int i=0;i<value.length;i++)
				//   System.out.print(value[i]+" ");
			   System.out.println(" {" +value[0] + "," + value[1] + "}");
		   }
		   
		  
	  }

	public static void main(String[] args) {
	    int[][] arr= {{1,3},{-2,2},{5,8},{0,1}};
	    int k=2;
	    PriorityQueue<Pair> pq=new PriorityQueue<>();
           for(int i=0;i<arr.length;i++) {
        	   int x=arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
        	   int[] y= {arr[i][0],arr[i][1]};
        	   Pair p=new Pair(x,y);
        	     pq.add(p);
        	     if(pq.size()>k)
        	    	 pq.poll();
           }
           while(pq.size()>0) {
        	 pq.peek().getValue(); 
        		 pq.poll();
           }
	}

}
