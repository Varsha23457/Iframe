package arrayAndCollectionEx;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet s=new LinkedHashSet();
		
		s.add(200);
		s.add("Ankush");
		s.add(null);
		s.add("Ankush");
		s.add('V');
		
		System.out.println(s);
		
		System.out.println(s.size());
		
		System.out.println(s.contains('V'));
		System.out.println(s.isEmpty());
		System.out.println(s.remove("Ankush"));

	}

}
