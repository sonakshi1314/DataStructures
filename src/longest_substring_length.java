import java.util.HashMap;

public class longest_substring_length {

	public static void main(String[] args) {
		 String s="bccbababd";
		 int start=0;
		 int end=-1;
		 int curr_value=0;
		 int min_value=Integer.MIN_VALUE;
		 HashMap<Character,Integer> hm=new HashMap<>();
		 for(int i=0;i<s.length();i++) {
			 if(hm.containsKey(s.charAt(i))) {
				 hm.put(s.charAt(i), hm.get(s.charAt(i)+1));
				  end++;
			 }
			 else
			 {
				 hm.put(s.charAt(i), 1);
				 end++;
			 }
			 curr_value=end-start+1;
			 if(hm.size()>2) {
				 hm.put(s.charAt(i), hm.get(s.charAt(i)-1));
				 start++;
			 }
			 min_value=Math.max(min_value, curr_value);
		 }
           System.out.println(min_value);
	}

}
