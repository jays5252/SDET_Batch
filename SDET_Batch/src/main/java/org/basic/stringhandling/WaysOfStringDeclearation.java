package org.basic.stringhandling;

public class WaysOfStringDeclearation 
{
	public static void main(String[] args) {
		String s = new String("Jay"); //Using new Keyword
		String s1 = "Jay"; //Using equal keyword.
		if(s==s1) {
			System.out.println("Address is Same.");
		}
		else
		{
			System.out.println("Address is not Same.");
		}
		
		
		String name = "Jay";
		String name1 = "Jay";
		if(name == name1)
		{
			System.out.println("Address is Same");
		}
		else
		{
			System.out.println("Address is not same.");
		}
		
		String a = "Singh";
		String a1 = new String("Singh");
		if(a.equals(a1))
		{
			System.out.println("Value is same");
		}
	}

}
