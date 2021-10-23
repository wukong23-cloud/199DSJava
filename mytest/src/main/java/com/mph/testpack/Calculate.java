package com.mph.testpack;

public class Calculate {
	
	public int add(int... number)
	{
		int result=0;
		for(int i: number)
		{
			result+=i;
		}
		return result;
	}
	
	
	public int multiply(int... number)
	{
		int result=0;
		for(int i: number)
		{
			result*=i;
		}
		return result;
	}
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		Calculate c=new Calculate();
		System.out.println(c.add(45,657));
		System.out.println(c.add(1,3,4,65,7));
		System.out.println(c.add(4,7,3));
		System.out.println(c.multiply(3,3,5,9));
		
		
		
	}


}
