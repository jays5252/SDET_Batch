package org.basic.methodsandVariables;

public class TypesOfMethodBasedOnRetern 
{
	//Void and Non-Void
	public void method1()
	{
		System.out.println("I'm not returning any value, so I'm a void method");
	}
	public int SumMethod(int a,int b)
	{
		int sumResult = a+b;
		System.out.println("I'm returing sum value so, i'm non void method.");
		return sumResult;
	}
	public static void main(String[] args) 
	{
		TypesOfMethodBasedOnRetern returntype = new TypesOfMethodBasedOnRetern();
		returntype.method1();
		int sumResult = returntype.SumMethod(5,2);
		System.out.println(sumResult);
		
	}

}
