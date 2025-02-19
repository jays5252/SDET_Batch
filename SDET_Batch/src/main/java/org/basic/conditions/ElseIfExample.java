package org.basic.conditions;

import java.util.Scanner;

public class ElseIfExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter marks");
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		if((marks>=0)&&(marks<35))
		{
			System.out.println("Failed: "+marks);
		}
		else if ((marks>=35)&&(marks<60)) {
			System.out.println("Pass: "+marks);
		}
		else if ((marks>=60)&&(marks<=100)) {
			System.out.println("First Devision: "+marks);
		}
		else {
			System.out.println("Please enter a valid Marks");
		}
		
	}

}
