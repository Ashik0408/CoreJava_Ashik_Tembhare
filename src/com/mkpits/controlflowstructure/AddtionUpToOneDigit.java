package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddtionUpToOneDigit 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long num,sum=0;
		System.out.println("Enter The Number:-");
		num=Long.parseLong(br.readLine());
		// checking the number is geter than 10 or not if not then assign directly to the sum and print the value
		
		if(num>=10)
		{
			// run the loop until the condition is not satisfied
			while(num>0 || sum>10)
			{
				// assigning the value to the corresponding variables
				if(num==0)
				{
					num=sum;
					sum=0;
				}
				sum+=num%10;
				num=num/10;
			}
		}else
			sum=num;
		
		System.out.println("The Total Sum is :"+sum);

	}
}
