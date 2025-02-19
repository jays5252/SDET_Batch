package org.basic.stringhandling;

import java.util.Iterator;

public class HyphenStringExample 
{
	public static void main(String[] args) {
		String name = "LaveSingh";
		String NewName = "";
		int length = name.length();
		for(int i=0;i<length;i++)
		{
			NewName = NewName+name.charAt(i)+"$";
		}
		System.out.println(NewName);
	}

}
