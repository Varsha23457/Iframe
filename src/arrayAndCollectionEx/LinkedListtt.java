package arrayAndCollectionEx;

import java.util.LinkedList;

public class LinkedListtt {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		l1.add(200);
		l1.add(300);
		l1.add(500);
		l1.add("varsha");
		l1.add(null);
		l1.add(null);
		l1.add('A');
		
		
		System.out.println(l1);
		
		System.out.println(l1.size());
		System.out.println(	l1.get(2));
		//System.out.println(l1.descendingIterator());
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.isEmpty());
		System.out.println(l1.lastIndexOf(500));
		

	}

}
