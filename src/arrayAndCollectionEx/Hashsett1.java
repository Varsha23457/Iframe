package arrayAndCollectionEx;

import java.util.HashSet;

public class Hashsett1 {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		
		h.add(100);
		h.add("varsha");
		h.add('*');
		h.add(null);
		h.add(null);
		h.add("varsha");
		
		System.out.println(h);
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(100));
		System.out.println(h.equals(null));
		
		

	}

}
