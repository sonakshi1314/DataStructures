
mport java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> result =new ArrayList<>();
        int count1 =0;
        int count2 =0;
       // int arr[]=new int[2];
                    int n1=a.size();
                    int n2=b.size();
                    if(n1==n2)
                    {
                         for(int i=0;i<n1;i++ ){
                             for (int j=0;j<n2;j++){
                                 while(i==j){

                                if(a.get(i)>b.get(j))
                                
                             {
                                 count1 =count1++;
                               //result.add(0,count1);
                             // (List<Integer>) arr[0]=count1;
                             }
                             else if(b.get(j)>a.get(i)){
                                 
                                 count2 =count2++;
                                 //result.add(1,count2) ;
                                  
                                 //return count2;
                             // (List<Integer>)   arr[1]=count2;
                             }
                            
                         }
                             }
                             
                         }
                         //result(count1,count2);
                        result.add(0,count1);
  result.add(1,count2) ;
                      }

 
 return result;





                        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
