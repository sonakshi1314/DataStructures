import java.util.PriorityQueue;

public class Minimum_cost {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(pq.size()>=2) {
			int first=pq.peek();
			 pq.poll();
			int second=pq.peek();
			 pq.poll();
			sum=sum+first+second;
			 pq.add(first+second);
		}
		System.out.println(sum);
	}

}
