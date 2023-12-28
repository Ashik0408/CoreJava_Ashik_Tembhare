package com.mkpits.inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.setGrandFatherName("DurjanTembhare");
		c.setFatherName("Hupram Tembhare");
		c.setChildName("Ashik Tembhare");
		
		System.out.println("Child Name : "+c.child());
		System.out.println("Father Name : "+c.father());
		System.out.println("Grandfather Name : "+c.grandFather());
	}

}
