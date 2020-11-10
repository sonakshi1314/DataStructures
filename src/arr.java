 import java.util.*;
public class arr {

	public static void main(String[] args) throws Exception{
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
	 
    /*  int j;
	 int i;
	 
	 for( j=0;j<arr[0].length;j++) {
		   for( i=0;i<arr.length;i++) {
			System.out.print(arr[i][j]+" "); 
		 	 }
		   reverse(arr,i,j);
		   
		
	   }
	}
	static int m;
	private static void reverse(int[][] arr, int i,int j) {
		
			for(m=0;m<arr[i].length;m++) {
			   System.out.println(arr[i][m]);
			}
		
		   reverse2(arr,m,j);
		
	}
	static int n;

	private static void reverse2(int[][] arr,int m,int j) {
		for( n=m;n>=0;n--) {
			System.out.println(arr[n][m]);
		}
		reverse3(arr,n,j);
	}

	private static void reverse3(int[][] arr, int n,int j) {
		for(int o=n;o>j;j--) {
			System.out.println(arr[o][n]);
		}
		
	}
	
	
	*/
	
	  
	  
	  
	   int minc=0;
	   int maxc=arr[0].length-1;
	   int minr=0;
	   int maxr=arr.length-1;
	   int count=0;
	   int total=rows*columns;
	   while(count<total) {
	  for(int i=minr,j=minr;i<=maxr && count<total;i++) {
		  System.out.print(arr[i][j]);
		  count++;
	  }
	  minc++;
	  for(int j=minc,i=maxr;j<=maxc && count<total;j++) {
		  System.out.print(arr[i][j]);
		  count++;
	  }
	  maxr--;
	  for(int i=maxr,j=maxc;i>=minr && count<total;i--) {
		  System.out.print(arr[i][j]);
		  count++;
	  }
	  maxc--;
	  for(int j=maxc,i=minr;j>=minc && count<total;j--) {
		  System.out.print(arr[i][j]);
		  count++;
	  }
	  minr++;
	  }
	   
	  
	  
	  
	  
	  
	}
}	
	  
	  
	  
	
	
