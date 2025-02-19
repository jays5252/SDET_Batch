package org.basic.constructor;

public class ConstructorAssignment1 {
//	three parameterized constructor
//	default constructor
//	one parameterized consturctor
//	two parameterized constructor
//	four parameterized consturcor
	public ConstructorAssignment1()
	{
		this(0,0,0);
		System.out.println("Default parameterized Constructor");
	}
	public ConstructorAssignment1(int a)
	{
		this();
		System.out.println("One parameterized Constructor");
	}
	public ConstructorAssignment1(int a, int b)
	{
		this(0);
		System.out.println("Two parameterized Constructor");
	}
	public ConstructorAssignment1(int a,int b,int c)
	{
		System.out.println("Three parameterized Constructor");
	}
	public  ConstructorAssignment1(int a,int b,int c, int d)
	{
		this(0, 0);
		System.out.println("Four parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorAssignment1 ca = new ConstructorAssignment1(0,0,00,00);
	}
	

}


