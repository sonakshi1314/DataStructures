package DYNAMIC_PROGRAMMING;

public class paranthesis {

	public static void main(String[] args) {
	   String s="true&false|true^true";
	   int i=0;
	   int j=s.length();
	   boolean istrue=false;
	   solve(s,i,j,istrue);

	}

	private static boolean solve(String s,int i, int j, boolean istrue) {
	      if(s.length()==0)
	    	  return false;
	     
	      if(istrue==true)
	    	  return true;
	      if(istrue==false)
	    	  return true;
	      int ans=0;
	      for(int k=i+1;k<=j-1;k=k+2) {
	    	  boolean lt=solve(s,i,k-1,true);
	    	  boolean lf=solve(s,i,k-1,false);
	    	  boolean rt=solve(s,k+1,j,true);
	    	  boolean rf=solve(s,k+1,j,false);
	    	  if(s.charAt(i)=='&') {
	    		  if(istrue=true)
	    			  ans=ans + (lt&rt);
	    		  else
	    			  ans=ans+ lt&rf | lf&rt | lf&rf;
	    	  } 
	    	  if(s.charAt(i)=='|') {
	    		  if(istrue==true)
	    			  return lt|rt lf|rt lt|rf;
	    		  else
	    			  rerturn lf|rf;
	    	  }
	    	  if(s.charAt(i)=='^') {}
	    	  
	      }
	      
	       
		
	}

}
