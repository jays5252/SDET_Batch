package org.basic.conditions;

import java.util.Scanner;

public class IfElseExample
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number%2==0)
		{
			System.out.println("Number is even: "+number);
		}
		else {
			System.out.println("Number is odd: "+number);
		}
		
	}

}
