package BASIC_PROGRAMS;

import java.util.Scanner;

public class sumOfEven {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A M NO ");
		int m =sc.nextInt();
		System.out.println("ENTER A N NO ");
		int n=sc.nextInt();
		
		while(m<=n)
		{
			if((m%2)==0)
			{
				System.out.println(m);
				m++;
			}
			else
				System.exit(0);//file updaed
		}

	}

}
