package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Requirement : Performed Perfect Number Program 
// Design : Taking the number from user and check the number is perfect number or not
// Development : initialized the for loop from the no. 1 to the intputed num and check the the number which is divisible to tha number add to the sum and chech if the num is equal to the given number then it is perfect number
// output : input : 6 , => 1,2,3 are the divisible to the 6 => 1+2+3=sum 6 == num 6 
public class PerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		for (int i = 1; i <num; i++) 
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			System.out.println(num+" is perfect number");
		else
			System.out.println(num+" is not perfect number");

	}

}
