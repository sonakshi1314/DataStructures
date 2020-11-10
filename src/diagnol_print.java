import java.util.Scanner;

public class diagnol_print {

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
	/*  int j=0;
	   int i=0;
	  while(i!=0 && j!=arr[0].length) {
	   
	   
		  for(j=0;j<arr[0].length;j++) {
			  System.out.println(arr[i][j]);
			   i++;
			   
		  }
		  i=0;
		  j=0;
		  for(int temp=1;temp<arr[0].length;temp++) {
			  j=j+temp;
		  }
		  System.out.println();
		  
	   }
	   */
	  
	  for(int gap=0;gap<arr.length;gap++) {
		  for(int i=0,j=gap;j<arr.length;i++,j++) {
			   System.out.print(arr[i][j]);
		  }
		  System.out.println();
	  }
	  
	  
	  
	}
	}


