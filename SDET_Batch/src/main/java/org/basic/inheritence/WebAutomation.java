package org.basic.inheritence;

public class WebAutomation extends Automation  {
	public void m1() {
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) 
	{
		WebAutomation wa = new WebAutomation();
		wa.method1();
		wa.method2();
		wa.m1();
		
	}

}
