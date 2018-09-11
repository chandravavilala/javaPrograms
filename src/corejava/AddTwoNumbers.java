package corejava;

import java.util.Scanner;

public class AddTwoNumbers {
	
	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for addition");
		a = sc.nextInt();
		System.out.println("Enter the second number for addition");
		b = sc.nextInt();
		c = a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is:"+c);
		sc.close();
	}

}
