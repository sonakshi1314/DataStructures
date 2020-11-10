package Stack1;

import java.util.*;

public class Area_of_binary_Matrix {

	public static void main(String[] args) {
		int arr[][] = { 
	            { 0, 1, 1, 0 }, 
	            { 1, 1, 1, 1 }, 
	            { 1, 1, 1, 1 }, 
	            { 1, 1, 0, 0 }, 
	        }; 
		ArrayList<Integer> al=new ArrayList<>();
		Stack<Integer>s =new Stack<>();
		for(int i=0,j=0;j<arr.length;j++) {
			al.add(arr[i][j]);
		}
		int result=MAH(al);
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				 if(arr[i][j]==1) {
					 
				 }
                 if(arr[i][j]==0) {
					 
				 }
                 int result1=MAH(al);
                 result=Math.max(result,result1 );
			}
		}
            System.out.println(result);
	}

	private static int MAH(ArrayList<Integer> al) {
		 
		
		
		
		
		
		
		
		return 0;
	}

}
