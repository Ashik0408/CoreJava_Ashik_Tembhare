package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValidationForm {

	String name,mob,email;
	static BufferedReader read;
	public static void main(String[] args) throws IOException 
	{
		read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Form");
		InputValidationForm obj=new InputValidationForm();
		obj.getName();
		obj.getMobile();
		obj.getEmail();
		obj.getDetails();
		
		

	}
	
	public void getEmail() throws IOException 
	{
		while(true)
		{
			System.out.println("Enter Your Email");
			email=read.readLine();
			if(email.isEmpty())
			{
				System.out.println("Please EnterYour Email");
				continue;
			}
			
			break;
		}
	}

	public void getMobile() throws IOException 
	{
		
		while(true)
		{
			System.out.println("Enter Your Mobile No.");
			mob=read.readLine();
			if(mob.isEmpty() ||  mob.length()<10)
			{
				System.out.println("Please EnterYour Name");
				continue;
			}
			break;
		}
	}

	public void getName() throws IOException
	{
	
		while(true)
		{
			System.out.println("Enter Your Name");
			name=read.readLine();
			if(name.isEmpty())
			{
				System.out.println("Please EnterYour Name");
				continue;
			}
			break;
		}
	}
	
	void getDetails()
	{
		System.out.println("\n================================");
		System.out.println("Your Email is :"+name);
		System.out.println("Your Email is :"+mob);
		System.out.println("Your Email is :"+email);
	}

}
