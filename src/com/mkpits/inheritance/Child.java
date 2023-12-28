package com.mkpits.inheritance;

public class Child extends FatherClass
{
	String childName;

	public void setChildName(String childName) 
	{
		this.childName = childName;
	}
	
	protected String child() 
	{
		return childName;
	}
	
}
