package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class egg_dropping {
  static int[][] t=new int[4][6];
	public static void main(String[] args) {
		   int egg=3;
		   int floor=5;
		   for (int[] row: t)
		        Arrays.fill(row, -1);
		   int result=solve(egg,floor);
		   System.out.println(result);

	}
	public static int solve(int egg,int floor) {
		int i=1;
		int j=5;
		int ans=Integer.MAX_VALUE;
		if(egg==1)
			return floor;
		if(floor==1||floor==0)
			return floor;
		if(t[egg][floor]!=-1 && floor>0)
			return t[egg][floor];
		else {
		for(int k=1;k<=floor;k++) {
			
		
			int low=0;
			int high=0;
			if(t[egg-1][k-1]!=-1) {
				 low=t[egg-1][k-1];
			}
			else {
				low=solve(egg-1,k-1);
				t[egg-1][k-1]=low;
			}
			if(t[egg][floor-k]!=-1)
			high=t[egg][floor-k];
			else {
				high=solve(egg,floor-k);
				t[egg][floor-k]=high;
			}
		
		//	int temp=1+Math.max(solve(egg-1,k-1),solve(egg,floor-k));
			int temp=1+Math.max(low,high);
			ans=Math.min(temp, ans);
		}
		}
		return t[egg][floor]=ans;
	}

}
