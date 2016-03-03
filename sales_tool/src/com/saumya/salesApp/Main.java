package com.saumya.salesApp;
public class Main
{
	public static void main(String[] args) 
	{
		SalesData data= new SalesData();
		
		data.display();
		displayGreetings();
		
	}
	public static void displayGreetings()
	{
		System.out.println("hello sales people");
		System.out.println("this app shows sales data");
	}
}
