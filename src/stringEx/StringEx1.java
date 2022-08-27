package stringEx;

public class StringEx1 {

	public static void main(String[] args) {
		//String s=new String();
		
		String s1="India is my country        ";
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.lastIndexOf(s1));
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s1.startsWith("India"));
		System.out.println(s1.endsWith("is"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("I love INDIA"));
		System.out.println(s1.isBlank());
		System.out.println(s1.substring(5));
		System.out.println(s1.replace("my", "our"));
	//	System.out.println(s1.compareTo("I LOVE INDIA"));
		System.out.println(s1);
		

	}

}
