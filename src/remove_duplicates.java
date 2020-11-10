import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class remove_duplicates {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(20);
		al.add(23);
		al.add(23);
		al.add(43);
		al.add(48);
		al.add(50);
		System.out.println(" arrayList elements are : " + al);
		remove_duplicateal(al);
		
	}

	private static void remove_duplicateal(ArrayList<Integer> al) {
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(al);
		System.out.println("Set elements are " + s);
	}

}
