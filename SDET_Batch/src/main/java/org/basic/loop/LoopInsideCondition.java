package org.basic.loop;

import java.util.Scanner;

public class LoopInsideCondition 
{
	public static void main(String[] args) {
		 System.out.println("Enter Value Max");
		 Scanner scan = new Scanner(System.in);
		 int max = scan.nextInt();
		 if(max>=0) {
			 for (int i=0;i<=max;i++)
			 {
				 System.out.println("Value of i: "+i);
			 }
		 }
	}

}
