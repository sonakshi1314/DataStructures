
public class Introduction {

	public static void main(String[] args) {
		  int n=1440;
		  int ans=0;
		  for(int i=2;i<=Math.sqrt(n);i++) {
			  while(n%i==0) {
				   n=n/i;
			  System.out.println(i);
			 		  }
		  }
		if(n!=1)
			System.out.println(n);
		  }
	}
















		/*
		int divident=36;
		int divisor=24;
		int od1=divident;
		int od2=divisor;
		//int reminder=1;
		while(divident%divisor>0) {
		    int reminder=divident%divisor;
			divident=divisor;
			divisor=reminder;
		}
		
	System.out.println(divisor);	
	
	int lcm=(od1*od2)/divisor;
	System.out.println(lcm);
		
		
		
		
		
		
		
		
		
		
		
		int n=13542;
		int op=1;
		int inverse=0;
		while(n>0) {
			int od=n%10;
			int nd=op;
			int np=od;
			 inverse=inverse+nd*(int)Math.pow(10, np-1);
			 n=n/10;
			 op++;
		}
  System.out.println(inverse);
	}

}
*/
