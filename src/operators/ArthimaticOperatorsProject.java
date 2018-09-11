package operators;

import java.util.Scanner;

public class ArthimaticOperatorsProject {

	public static void main(String[] args) {
		// Addition
		int number1;
		int number2;
		int addResult;
		int subResult;
		int mulResult;
		int modResult;
		int divResult;
		int incResult;
		int decResult;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number one");
		number1=sc.nextInt();
		System.out.println("Enter number two");
		number2=sc.nextInt();
		
		addResult=number1+number2; // +   Addition
		System.out.println("Addition of "+number1+ " and "+number2+" is: "+addResult);
		
		subResult=number1-number2;  // -  Subtraction
		System.out.println("Subtraction of "+number1+ " and "+number2+" is: "+subResult);
		
		mulResult=number1*number2;  // *  Multiplication
		System.out.println("Multiplication of "+number1+ " and "+number2+" is: "+mulResult);
		
		modResult=number1%number2;  // % Modulus
		System.out.println("Modulus of "+number1+ " and "+number2+" is: "+modResult);
		
		divResult=number1/number2;  //  /  Division
		System.out.println("Division of "+number1+ " and "+number2+" is: "+divResult);
		
		incResult=++number1;
		System.out.println("Increment of "+number1+ " is: "+incResult);
		
		
		
		
		
			

	}

}
