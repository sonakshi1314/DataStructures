package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class Matrix_chain {
         public static int[][] t=new int[15][15];
	public static void main(String[] args) {
		int[] arr= {10,30,5,60};
		int i=1;
		int j=arr.length-1;
		for(int[] row:t)
		Arrays.fill(row, -1);
		System.out.println(solve(arr,i,j));

	}

	private static int solve(int[] arr, int i, int j) {
		int cost=Integer.MAX_VALUE;
		if(i>=j)
			return 0;
		if(t[i][j]!=-1)
			return t[i][j];
		else {
		for(int k=i;k<=j-1;k++) {
			int temp=solve(arr,i,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
			cost=Math.min(cost,temp);
			//if(temp>cost)
			//	cost=temp;
		}
		}
		return t[i][j]=cost;
	}

}
