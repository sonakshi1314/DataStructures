package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class Longest_common_subsequence_length {
          static int[][] t=new int[15][15];
	public static void main(String[] args) {
		 String s1="sonakshi";
		 String s2="ananya";
		 int n1=s1.length();
		 int n2=s2.length();
		 /*for(int[] row:t)
			 Arrays.fill(row, -1);
			 */
		 solve(s1,s2,n1,n2);
		
	}

	private static void solve(String s1, String s2, int n1, int n2) {
		for(int i=0;i<s1.length()+1;i++) {
			for(int j=0;j<s2.length()+1;j++) {
				if(i==0&&j!=0)
					t[i][j]=0;
				if(j==0&&i!=0)
					t[i][j]=0;
				  if(i==0&&j==0)
					  t[i][j]=0;
			}
		}
		   /* if(n1==0&&n2!=0)
		    	return 0;
		    if(n2==0&&n1!=0)
		    	return 0;
		    if(n1==0&&n2==0)
		    	return 0;
		   // if(t[n1][n2]!=-1)
		    //	return t[n1][n2];
		    */
		
		for(int i=1;i<s1.length()+1;i++) {
			for(int j=1;j<s2.length()+1;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					 t[i][j]=1 +t[i-1][j-1];
				}
				else 
					 t[i][j]=Math.max(t[i][j-1],t[i-1][j] );
			}
		}
		
		
		     int ans=t[n1][n2];
			System.out.println(ans);
			System.out.println(n1+" "+n2);
			lcs(s1,s2,n1,n2);
	
	}

	private static void lcs(String s1, String s2, int n1, int n2) {
		int i=n1;
		int j=n2;
		 while(i>0||j>0) {
			 if(s1.charAt(i-1)==s2.charAt(j-1)) {
				 System.out.println(s1.charAt(i-1));
				 i--;
				 j--;
			 }
			 else {
				 if(t[i][j-1]>t[i-1][j])
					 j--;
				 else if(t[i][j-1]<t[i-1][j])
					 i--;
			 }
		 }
		
	}
           
}
