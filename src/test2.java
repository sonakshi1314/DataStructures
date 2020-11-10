import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the number of pages: ");
		 int n=scan.nextInt();
		 System.out.println(" enter the page:");
		 int p=scan.nextInt();
		 int result=0;
         // double n1=(double)n/2;
         int n1=n/2;
              if(p<=n1){
                  for(int i=1;i<=n1;i++){
                      result=result+1;
                  }

              }
              else{
                   for(int j=n;j>n1;j--){
                       result=result+1;
                   }
              }
              result=(int)Math.round((result/2));
              System.out.println(result);
	}
}
