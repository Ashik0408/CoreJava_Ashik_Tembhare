package com.mkpits.inheritance;

public class GrandFather 
{
	String grandFatherName;

	public void setGrandFatherName(String grandFatherName) 
	{
		this.grandFatherName = grandFatherName;
	}
	protected String grandFather() 
	{
		return grandFatherName;
	}
	
}
