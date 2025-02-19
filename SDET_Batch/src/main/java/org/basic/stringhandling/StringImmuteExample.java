package org.basic.stringhandling;

public class StringImmuteExample 
{
	public static void main(String[] args) {
		String s = "Jay";
		s.concat("Singh");
		System.out.println(s); // In same varible it cant  be changes/
		
		String s1 = "Jay";
		String s2 = s1.concat(" Singh");
		System.out.println(s2);
	}

}
