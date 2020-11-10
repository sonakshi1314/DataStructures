import java.util.Scanner;

public class Exit_Point_of_a_Matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter no of rows: ");
		int rows=scan.nextInt();
		System.out.println(" Enter no of columns: ");
		int columns=scan.nextInt();
	 int[][] arr=new int[rows][columns];
	  for(int p=0;p<rows;p++) {
		  for(int q=0;q<columns;q++) {
			  System.out.println(" enter the values: ");
			  arr[p][q]=scan.nextInt();
			  }
	  }
	  
	   int direction=0;
	   int i=0;
	   int j=0;
	   while(true) {
		   direction=(direction+arr[i][j])%4;
           if(direction==0) {
			   j++;
		   }
           else if(direction==1) {
			   i++;
		   }
		   else if(direction==2) {
			   j--;
		   }
           else if(direction==3) {
			   i--;
		   }
            if(i<0) {
            	i++;
            	break;
            }
            else if(j<0) {
            	j++;
            	break;
            }
            else if(i==arr.length) {
            	i--;
            	break;
            }
            else if(j==arr[0].length) {
            	j--;
            	break;
            }
	   }
         System.out.println(i+" "+j);
	}

}
