package com.qa.startworld;

public class Runner {
	public static int id;
	public static String msg = "Hello World";
	
	public static void main(String[] args) {
		String str = welcomeText();
		System.out.println(msg);
		System.out.println(str);
	}
	public static String welcomeText()
	{
		return "Hello World 2";
	}
	
}
