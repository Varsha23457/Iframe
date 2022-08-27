package exceptionhandlingEx;

public class Ex2 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=a/b;
		
	
		
		try {
			System.out.println(c);
	}

		catch(Exception e){
			e.printStackTrace();
		}
		
		finally {
			System.out.println(a+b);
		}
}
}