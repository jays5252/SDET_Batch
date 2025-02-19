package org.basic.loop;

public class ConditionInsideLoop 
{
	public static void main(String[] args) {
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Number is Even: "+i);
			}
			else {
				System.out.println("Number is Odd: "+i);
			}
		}
	}

}
