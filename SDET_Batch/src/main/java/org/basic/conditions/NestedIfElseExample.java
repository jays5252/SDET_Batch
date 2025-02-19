package org.basic.conditions;

import java.util.Scanner;

public class NestedIfElseExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>=0)
		{
			if(number%2==0)
			{
				System.out.println("Even Number:"+number);
			}
			else
			{
				System.out.println("Odd Number: "+number);
			}
		}
		else
		{
			System.out.println("Please enter +ve number");
		}
	}

}
