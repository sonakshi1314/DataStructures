import java.util.Scanner;

public class rotate_by_ninty {

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
	  
	  /*
	  for(int j=0;j<columns;j++) {
		  for(int i=rows-1;i>=0;i--) {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	  */
	  //tanspose the ARRAY:
	 
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<i;j++) {
			int  temp=arr[i][j];
			  arr[i][j]=arr[j][i];
			  arr[j][i]=temp;
		  }
	  }
	  //swap:
	   int temp1;
	  for(int i=0;i<arr.length;i++) {
		  int li=0;
		  int ri=arr.length-1;
		  while(li<ri) {
			 temp1=arr[i][li];
			 arr[i][li]=arr[i][ri];
			 arr[i][ri]=temp1;
			  li++;
			  ri--;
		  }
	  }
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr[0].length;j++) {
			  System.out.println(arr[i][j]);
		  }
		  System.out.println();
	  }
	}

}
