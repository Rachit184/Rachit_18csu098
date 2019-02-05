package com.ncu.assignment;
public class Address
{
	String l1;
	String l2;
	String City;
	String State;
	int pinCode;
	
	public void setline1(String line1)
	{
		this.l1=l1;
	}
	public String getline1()
	{
		return l1;
	 }
	
	public void setline2(String line2)
	{
		this.l2=l2;
	}
	public String getline2()
	{
		return l2;
	}
	
	public void setcity(String city)
	{
		this.City=City;
	}
	public String getcity()
	{
		return City;
	}
	
	public void setstate(String state)
	{
		this.State=State;
	}
	public String getstate()
	{
		return State;
	}
	
	public void setpinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	public int getpinCode()
	{
		return pinCode;
	}
}