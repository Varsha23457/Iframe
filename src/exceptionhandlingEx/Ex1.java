package exceptionhandlingEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1 {

	public static void main(String[] args)  {
	
		
		
		try {
			FileInputStream fis=new FileInputStream("V:/vsn.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("varsha");
			
		
		

	}

}
