package org.basic.methodsandVariables;

public class MethodAndVeriable 
{
	//Variables: Which stores some value and the value can be changed;
		int a;
		double b;
		//While To perform some action(Activity) we need to create method.
		public void method()
		{
			System.out.println("I am method");
		}
		public static void main(String[] args) {
			MethodAndVeriable mav = new MethodAndVeriable();
			mav.a  = 12;
			mav.b = 6.10;
			System.out.println("Value for a: "+mav.a);
			System.out.println("Value for a: "+mav.b);
			mav.method();
					
			
		}
}
