package com.mkpits.methods;

public class RecursionMethodFactorial
{

	public static void main(String[] args) 
	{
		int total=recursionFactor(5);
		System.out.println(total);
	}

	private static int recursionFactor(int num) 
	{
		
			return num*recursionFactor(num-1);
	}

}
