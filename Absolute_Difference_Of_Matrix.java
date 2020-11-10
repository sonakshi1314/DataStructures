import java.util.Scanner;

public class Absolute_Difference_Of_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n;
	//	int arr[]=new int[n];
           Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the number of test cases: ");
		int t=scan.nextInt();
		
		for(int k=0;k<t;k++) {
		System.out.println(" Enter length of array: ");
		
		int n =scan.nextInt();
	     int arr[]=new int[n];
		
		for(int j=0;j<n;j++) {
			System.out.println(" Enter the  values : ");
			   arr[j]= scan.nextInt();
			   
			 //  test(arr,n);
		}
		//test(arr,n);
	
		
		

	

//	private static void test(int[] arr, int n) {
		// TODO Auto-generated method stub
		int d1=0,d2=0,d3=0;
      //  double a=0,b=0,c=0;
       // int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
           d1=d1+1;
           
       }
        else if(arr[i]<0){
            d2=d2 +1;   
        }
        else{
           d3=d3+1;
        }
        
    }
                 
            double a=(double)d1/n;
       System.out.println (String.format("%.6f", a));
       double b=(double)d2/n;
      // System.out.println(b);
         System.out.println(String.format("%.6f",b));
              double   c= (double)d3/n;
         System.out.println(String.format("%.6f",c));
            //  System.out.println(c);

	}
}}