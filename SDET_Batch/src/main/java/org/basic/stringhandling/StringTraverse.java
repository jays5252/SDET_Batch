package org.basic.stringhandling;

public class StringTraverse 
{
	public static void main(String[] args) {
		String s = "My name is Jay";
		int length = s.length();
		for (int i=0;i<length;i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.println(s.charAt(i));
			}
			else
			{
				System.out.println();
			}
		}
	}

}
