import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0 ;
	       int count2=0 ;
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		ArrayList<Integer> result =new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the number of test cases: ");
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++) {
		System.out.println(" Enter the number of elements : ");
		
		int n =scan.nextInt();
		
		for(int j=0;j<n;j++) {
			System.out.println(" Enter the values : ");
			
			int v =scan.nextInt();
			   a.add(v);
		}
			   System.out.println(" Enter the number of elements : ");
				
				int n1 =scan.nextInt();
				
				for(int j=0;j<n1;j++) {
					System.out.println(" Enter the values : ");
					
					int v1 =scan.nextInt();
					   b.add(v1);
			 
		
		}
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		 

	     //   ArrayList<Integer> result =new ArrayList<>();
	        
	      
	                           for(int k=0;k<3;k++ )
	                           {
	                             
	                                     if(a.get(k)>b.get(k))
	                                     {
	                                    count1 =count1+1;
	                                     result.add(count1);
	                                     }
	                                    else if(b.get(k)>a.get(k))
	                                    {
	                                    count2 =count2+1;
	                                     result.add(count2) ;
	                                    }
	                           }
	                        // result.add(0,count1);
	                     //    result.add(1,count2) ;
	                       System.out.println(result);
	}

	}
}
