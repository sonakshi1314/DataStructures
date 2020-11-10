import java.util.Scanner;

public class Star_Pattern {
	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
		System.out.println(" Enter the number of test cases: ");
		int t=scan.nextInt();
		System.out.println(" enter the value of n:");
		int n = scan.nextInt();
		printStars(n); 
}

	private static void printStars(int n) {
		// TODO Auto-generated method stub
		  for(int i=1;i<=n;i++) 
		  {
			  for(int j=n;j>=i;j--) 
			  {
				  System.out.println("*");
			  }
			  for(int k=1;k<=i;k++)
			  {
				  System.out.println("#");
			  }
			  System.out.println();
		  }
		
	}
}