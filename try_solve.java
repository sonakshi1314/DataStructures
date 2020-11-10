import java.util.Arrays;
import java.util.LinkedHashSet;

public class try_solve {
	    static int[][] t=new int[15][15];
	    
	public static void main(String[] args) {
				String str1="sunday";
				String str2="saturday";
				int n=str1.length();
				int m=str2.length();
				for(int[] row:t)
					 Arrays.fill(row, -1);
				int lcs=solve(str1,str2,n,m);	
				int deletion=0;
				int insertion=0;
			
			    int replace=0;
			
				  replace=n-lcs;
				
		
		
				deletion=n-lcs;
				 insertion=m-lcs;
			
				//int result=Math.min(deletion, insertion);
				int result=Math.max(replace,Math.max(deletion, insertion) );
				System.out.println(result);
				System.out.println(deletion);
                System.out.println(insertion);
                System.out.println(replace);
	}

	private static int solve(String str1, String str2, int n, int m) {
		if(n==0||m==0)
			return 0;
		if(t[n][m]!=-1)
			return t[n][m];
		   if(str1.charAt(n-1)==str2.charAt(m-1))
			   return t[n][m]=1+solve(str1,str2,n-1,m-1);
		   else
			   return t[n][m]=Math.max(solve(str1,str2,n-1,m), solve(str1,str2,n,m-1));
		
	}
}			
			
				/*
	   int[] arr= {10,22,9};
		int n=arr.length;
		
		for(int[] row:t)
			 Arrays.fill(row, -1);
		System.out.println(solve(arr,0,1));
		   
	}

	private static int solve( int[] arr, int prev,int curr) {
		
		   if(curr==arr.length)
			   return 0;
		   if(t[prev][curr]!=-1&&prev!=-1)
			   return t[prev][curr];
		   int op1=0;
		   int op2=0;
		   if(prev==-1||arr[prev]<arr[curr])
			   op1=1+solve(arr,curr,curr++);
		   else
		    op2=solve(arr,prev,curr++);
		   if(prev!=-1)
		    t[prev][curr]= Math.max(op1, op2);
		  return Math.max(op1, op2);
	}
}
	  
		   
		/*  
		   for(int i=0;i<n;i++) {
			   
				   if(i==0)
				   t[i]=0;
			   
		   }
          
		   for(int i=1;i<n;i++) {
			   
				   if(arr[i-2]<arr[i-1])
					    t[i]=  t[i-1];
				   else
						 t[i]=Math.max(1+t[i-1], t[i]);
			   
		   }

		   System.out.println(t[n]);
		   
		   
		   
		   
		   
	}
}	
		
		/*
		 int n = 1; 
		 for(int[] row:t)
		 Arrays.fill(row, -1);
	        System.out.println(findStep(n)); 
		
	}
		
     	public static int findStep(int n) 
	    { 
	        if (n == 1 || n == 0) 
	            return 1; 
	        
	        if(t[n][n]!=-1)
	        	return t[n][n];
	  
	        else
	            return t[n][n]= findStep(n - 2) + findStep(n - 1); 
	    } 
	  
		
}		
		/*
		 String t="abcdabcabcd";
		 String p="abcd";
		 int start=0;
		char[] ch= t.toCharArray();
		char[] pattern=p.toCharArray();
		int i=0;
		int j=0;
		
		while(start<ch.length-pattern.length+1 &&j<pattern.length &&i<ch.length) {
			if(ch[i]!=pattern[j]) {
				i=i-j+1;
				j=0;
				start++;

			}
			if(ch[i]==pattern[j]) {
				i++;
				j++;
			}
			if(j==pattern.length) {
				System.out.println(start);
				i=i-j+1;
				j=0;
				start++;
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String ans="";
		String st="geeksforgeeks";
		LinkedHashSet<Character> s=new LinkedHashSet<>();
		char ch=st.charAt(0);
		boolean flag=true;
		for(int i=0;i<st.length();i++) {
			flag=true;
			int j;
			for( j=i+1;j<st.length();j++) {
				if(st.charAt(i)==st.charAt(j))
					flag=false;			
				}
			if(flag==false) {
				s.add(st.charAt(i));
				
				
			}
			
		}
		for(char chr:s)
			System.out.println(chr);
		System.out.println(ans);
		
		
		
		
		
	//	String str=" pr   og  ram ming";
		//StringBuilder sb=new StringBuilder();
		// str.chars().distinct().forEach(c->sb.append((char)c));
		// str.replaceAll("\\s", "");
		 // System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String s1="mypencil";
		String s2="encilmyp";
		String op1="";
		String op2="";
		String op3="";
		for(int i=1;i<s1.length()-1;i++) {
			for(int j=i;j<s1.length();j++)
				 op1=op1+s1.charAt(j);
			for(int j=0;j<i;j++)
				 op2=op2+s1.charAt(j);
			op3=op1+op2;
			//System.out.println(op3);
			
			if(op3.equals(s2))
				System.out.println("yes");
			
			op1="";
	        op2="";
			 op3="";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  String s="acaaabbbacdddd";
	  String op="";
	  //char[] ch=s.toCharArray();
	  int start=0;
	  int end=1;
	  int i=0;
	  /*
	  while(i<s.length()-1)
	  {
		  if(i==0 && s.charAt(i)!=s.charAt(i+1))
			  System.out.print(s.charAt(i));
			  
		  if(i!=0 && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i))
			  System.out.print(s.charAt(i));
		  i++;
	  }
		 
	  
	while(start<s.length()-1) {
		if(s.charAt(start)!=s.charAt(end)) {
			op=op+s.charAt(start);
			start=end;
			end++;
		}
		else
		{
			while(end < s.length() && s.charAt(start)==s.charAt(end)) {
				end++;
		}
			start=end;
			end=end+1;
		}
		
	}
	
				System.out.println(op);
				*/
  


