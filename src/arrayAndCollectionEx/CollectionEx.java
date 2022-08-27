package arrayAndCollectionEx;

import java.util.ArrayList;

public class CollectionEx {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		a1.add(200);
		a1.add(300);
		a1.add('E');
		a1.add(null);
		a1.add("varsha");
		a1.add(null);
		
		System.out.println(a1);
		
		System.out.println(a1.size());
		//System.out.println(a1.addAll(a1));
		System.out.println(a1.isEmpty());
		System.out.println(a1.toString());
		//System.out.println(	a1.remove(200));
		System.out.println(a1.indexOf('E'));
		
	
		

	}

}
