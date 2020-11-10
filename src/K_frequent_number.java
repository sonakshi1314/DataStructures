import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Collections;


public class K_frequent_number {
	
	  static class Pair implements Comparable<Pair>{
		  int Key;
		 int Value;
		 Pair(int Key,int Value){
			 this.Key=Key;
			 this.Value=Value;
		 }
	   public int compareTo(Pair o) {
			return this.Key-o.Key;
		}
	   public String toString() {
		   return Value + "";
	   }
	}

	public static void main(String[] args) {
	   int[] arr= {1,3,3,3,2,4,5,5,6,5,5};
	   int k=2;
	   HashMap<Integer,Integer> hm=new HashMap<>();
	   for(int value:arr){
	   if(hm.containsKey(value))
		   hm.put(value, hm.get(value)+1);
	   else
		   hm.put(value, 1);
	   }
	   PriorityQueue<Pair> pq =new PriorityQueue<>();
	   
	   for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
		    
	   Pair p=new Pair(entry.getValue(),entry.getKey());
	   
	   pq.add(p);
	  
	   if(pq.size()>k) 
		   pq.poll();
	   }
	   while(pq.size()>0) {
		   System.out.println(pq.peek());
		   pq.poll();
	   }
	}
   
      
}
