package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class Palindrome_partitioning {
            static int[][] t=new int[15][15];
	public static void main(String[] args) {
		String s="abcde";
		int i=0;
		int j=s.length()-1;
	       for(int[] row:t)
			Arrays.fill(row, -1);
		int ans=(solve(s,i,j));
		System.out.println(ans);

	}

	private static int solve(String s, int i, int j) {
		if(i>=j)
			return 0;
		if(isPalindrome(s,i,j)==true)
			return 0;
		int ans=Integer.MAX_VALUE;
	    if(t[i][j]!=-1)
     	return t[i][j];
		for(int k=i;k<=j-1;k++) {
		int temp=1+solve(s,i,k)+solve(s,k+1,j);
		    ans=Math.min(ans, temp);
		}
		return  t[i][j]=ans;
	}

	private static boolean isPalindrome(String s, int i, int j) {
		   if(s.length()==0)
			   return true;
		   if(s.length()==1)
			   return true;
		   while(i<j) {
			   if(s.charAt(i)!=s.charAt(j))
				   return false;
			   i++;
			   j--;
				   
		   }
		return true;
	}

}
