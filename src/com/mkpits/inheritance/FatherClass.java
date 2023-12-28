package com.mkpits.inheritance;

public class FatherClass extends GrandFather
{
	String fatherName;

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	protected String father() 
	{
		return fatherName;
	}
}
