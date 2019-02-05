package com.ncu.assignment.exception;
public class DateFormatException extends Exception
{
	String r2;
	public DateFormatException(String ex2)
	{
		r2=ex2;
		
	}
	public String toString()
	{
		return r2;
	}

}