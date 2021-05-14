package com.qa.startworld;

public class Runner {
	private static int id;
	private static String msg = "Hello World";
	
	public static void main(String[] args) {
		int add = add(1,2);
		int sub = subtract(2,3);
		int mult = multiply(5,4);
		float div = divide((float)3, (float)6);
		String str = welcomeText();
		
		System.out.println("intial value: "+ id);
		System.out.println(msg);
		System.out.println(str);
		System.out.println("add: " + add);
		System.out.println("subtract: " + sub);
		System.out.println("multiply: " + mult);
		System.out.println("divide: " + div);
	}
	private static String welcomeText()
	{
		return "Hello World 2";
	}
	//	Create a method that accepts two integers as input, 
	// then returns an integer that is the sum of these two parameters. (Addition)
	private static int add(int a, int b)
	{
		return a + b;
	}
	//Multiplication - which takes two numbers and returns the product.
	private static int multiply(int a, int b)
	{
		return a*b;
	}
	//	Subtraction - which takes two numbers, then returns the result of the subtraction.
	private static int subtract(int a, int b)
	{
		return a-b;
	}
	//	Division - which takes two numbers, then returns the result of the division.
	private static float divide(float a, float b)
	{
		return a/b;
	}
}
