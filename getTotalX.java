import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class getTotalX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		Scanner scan=new Scanner (System.in);
		 System.out.println(" Enter the number of test cases : ");
		 int t=scan.nextInt();
		 for(int m=0;m<t;m++) {
		 System.out.println(" Enter the length of arraylist a: ");
		 int n1=scan.nextInt();
		 System.out.println(" Enter the length of arraylist b: ");
		 int n2=scan.nextInt();
		 //System.out.println(" Enter the elements of arraylist a: ");
		 for(int i=0;i<n1;i++) {
			System.out.println(" Enter the elements of arraylist a: ");
			 int v=scan.nextInt();
			 a.add(v);
		 }
		 System.out.println(" Enter the elements of arraylist a: ");
		 for(int j=0;j<n2;j++) {
			 System.out.println(" Enter the elements of arraylist b: ");
			 int v1=scan.nextInt();
			 b.add(v1);
		 }
		 System.out.println(a);
		 System.out.println(b);
		 int total=0;
          int total1=0;
         int total2=0;

    int n=a.size();
    
				Collections.sort(a);
				Collections.sort(b);
				for(int i=1;i<=100;i++)
				// while( i>1)
				{
				    for(int j=0;j<n;j++){
				         if(i%(a.get(j))==0)
				         //total =total+1;
				        	 total1=i;
				    }
				    for(int k=0;k<b.size();k++){
				        if((b.get(k))%i==0)
				        //total=total+1;
				        	total2=i;
				    }
				    if(total1==total2)
				    	total++;
				}
				//  total=total1+total2;
				
				            System.out.println(total);;
					}
				
	}	}
