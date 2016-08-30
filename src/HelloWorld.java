import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileReader file = new FileReader("hello");
			BufferedReader reader = new BufferedReader(file);
			String data;
			while((data = reader.readLine()) != null) {
				System.out.println(data);
			}
			reader.close();
		} catch(IOException error) {
			System.out.println(error);
		}
		
		
		HelloWorld myReview = new HelloWorld();
		myReview.exampleMethod("print this out using exampleMethod function");
		String[] interests = new String[5];
		interests[0] = "Houses";
		interests[1] = "New Technology";
		interests[2] = "Baked Goods";
		interests[3] = "Hockey";
		interests[4] = "Ireland";
		
		for(int i = 0; i < interests.length; i++) {
			System.out.println(interests[i]);
		}
		
		if (1 == 0 && 1 == 1) {
			System.out.println("statement is true");
		} else if (0 == 0) {
			System.out.println("this statement is the true statement");
		} else {
			System.out.println("statement is false");
		}
		
		System.out.println("Enter first number:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		
		System.out.println("Sum is " + (num1 + num2));
		
		// pulling from MyClass.java
		MyClass mc = new MyClass();
		System.out.println(mc.myNum);
		mc.myMethod();
		
	}
	
	public void exampleMethod(String message) {
		System.out.println(message);
	}
	
	
	

}


