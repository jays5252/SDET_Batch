package org.basic.methodsandVariables;

public class TypesOfMetodBasedOnInput 
{
	//Based on input types of method
	public void m1()
	{
		System.out.println("I'm not taking any input, that's why i'm default method.");
	}
	
	public void m2(int a, int b)
	{
		int sum = a+b;
		System.out.println("I'm taking input, taking input, that's why i'm pazameterized method.");
	}
	public static void main(String[] args) {
		TypesOfMetodBasedOnInput tm = new TypesOfMetodBasedOnInput();
		tm.m1();
		tm.m2(1,2);
	}

}
