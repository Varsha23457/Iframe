package exceptionhandlingEx;

public class Ex3 {

	public static void main(String[] args) {
		
		
		int d=12;
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(d);
            
	}

}
