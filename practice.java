import java.util.Vector;

public class practice {

	public static void main(String[] args)  {
		 Vector<Integer> v=new Vector<>();
	      v.add(1);
		  v.add(5);
		  v.add(7);
		  v.add(3);
		  v.add(2);
		 // v.add(4);
		 StringBuffer input=new StringBuffer();
		 StringBuffer output=new StringBuffer();
		  for(int i=0;i<v.size();i++)
			  
		  input.append(i);
		 
		//String output=" ";
		solve(input,output,v);
	}
       static void solve(StringBuffer input,StringBuffer output ,Vector<Integer> v) {
    	   if(v.size()==1) {
    		   Vector<StringBuffer> v1=new Vector<>();
    		     v1.add(output);
    		     max(v1,output);
    		     return;
    	   }
    	   StringBuffer op1=output;
    	   StringBuffer op2=output;
    	   StringBuffer input1=new StringBuffer();
 		  StringBuffer input2=new StringBuffer();
    	      op1=op1.append(v.get(0));
    	      op2=op2.append(v.size()-1);
              input1=input1.append(v.remove(0));
              input1=input1.append(v.remove(v.size()-1));
              solve(input1,op1,v);
              solve(input2,op2,v);
    		   
       }
	private static void max(Vector<StringBuffer> v1,StringBuffer output) {
	     int ans=0;
	     int sum=0;
	     for(int i=0;i<v1.size();i++) {
	    	 for(int j=0;j<output.length();j++) {
	    		 sum=sum+output.charAt(j);
	    		 if(sum>ans)
	    			 ans=sum;
	    	 }
	     }
		System.out.println(sum);
	}
   
}