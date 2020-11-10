package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class scrambled_string {
  static boolean[][] t=new boolean[6][6]; 
	public static void main(String[] args) {
		String a="coder"; 
		String b="ocder";
		for(boolean[] row:t)
			Arrays.fill(row,false);
		System.out.println(solve(a,b));
	}

	private static boolean solve(String a, String b) {
		if(a.length()!=b.length())
			return false;
		if(a.length()==0 && b.length()==0)
			return true;
		if(a.length()==1)
			return false;
		if(a.equals(b))
			return true;
		boolean flag=false;
		int n=a.length();
		int i=0;
		if(t[i][n]!=false)
			return t[i][n];
		else {
		
		for(int k=i+1;k<=n-1;k++) {
		boolean first=	(solve(a.substring(0, k),b.substring(n-k))==true &&
			solve(a.substring(k),b.substring(0,n-k))==true);
		boolean second=	 (solve(a.substring(0, k),b.substring(0, k))==true &&
				solve(a.substring(k),b.substring(k))==true);
		
		  if(first||second)
			
		//	if(((solve(a.substring(0, k),b.substring(n-k)))&&
			//		(solve(a.substring(k),b.substring(0,n-k))))==true
		//		||  ((solve(a.substring(0, k),b.substring(0, k)))&&
			//	(solve(a.substring(k),b.substring(k))))==true)
			flag=true;
			break;
		}
		}
		return t[i][n]=flag;
	}

}
