package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Rohiht");
		al.add("vinay");
		al.add("sai");
		Iterator<String> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
