import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);
		
		// use a function to print out info
		HelloWorld myReview = new HelloWorld();
		myReview.exampleMethod("print this out using exampleMethod function");
		
		// read a text file "hello"
//		try {
//			FileReader file = new FileReader("hello");
//			BufferedReader reader = new BufferedReader(file);
//			String data;
//			while((data = reader.readLine()) != null) {
//				System.out.println(data);
//			}
//			reader.close();
//		} catch(IOException error) {
//			System.out.println(error);
//		}
//		
		
		// if, else if, else statement
//		if (1 == 0 && 1 == 1) {
//			System.out.println("statement is true");
//		} else if (0 == 0) {
//			System.out.println("this statement is the true statement");
//		} else {
//			System.out.println("statement is false");
//		}
		
		
		// input fields
		System.out.println("Enter first number:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		
		System.out.println("Sum is " + (num1 + num2));
		
//		// pulling from MyClass.java
		MyClass mc = new MyClass();
		System.out.println(mc.myNum);
		mc.myMethod();
		
	}
	
	public void exampleMethod(String message) {
		System.out.println(message);
	}
	

	

}

//public class Ternary {
//	public static void main(String[] args) {
//		
//		int fuelLevel = 3;
//
//		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
//		System.out.println(canDrive);
//
//	}
//}

