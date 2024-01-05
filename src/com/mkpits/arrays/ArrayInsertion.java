package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArrayInsertion {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Size Of Array : ");
		byte size=Byte.parseByte(read.readLine());
		int number[]=new int[size];
		System.out.println("Please enter array");
		for (int i = 0; i < number.length; i++) 
		{
			number[i]=Integer.parseInt(read.readLine());
		}
		
		for (int i : number) 
		{
			System.out.println(i);
		}
		
		System.out.println("Enter The posion :");
		byte pos=Byte.parseByte(read.readLine());
		System.out.println("Enter The number :");
		int newValue=Integer.parseInt(read.readLine());
		
		size++;
		
		for (int i = 0; i < number.length; i++) 
		{
			if(pos==i)
			{
				number[i]=newValue;
				
			}
	
		}
		
		for (int i : number) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
