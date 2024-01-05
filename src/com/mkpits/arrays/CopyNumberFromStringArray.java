package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class CopyNumberFromStringArray {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter The Size Of Array :");
		byte size=Byte.parseByte(br.readLine());
		String[]num=new String[size];
		System.out.println("Enter String number");
		for (int i = 0; i < num.length; i++) 
		{
			num[i]=br.readLine();
			
		}
		
		// int array
		int number[]=new int[num.length];
		
		for (int i = 0; i < num.length; i++) 
		{
			// converting coming charecter into int 
			number[i]=Integer.parseInt(num[i]);
			
		}
		// print the array
		System.out.println("Integer Number");
		for (int i : number) {
			System.out.println(i);
		}
	}

}
