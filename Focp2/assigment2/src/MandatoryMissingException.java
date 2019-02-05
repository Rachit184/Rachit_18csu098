package com.ncu.assignment.exception;
public class MandatoryMissingException extends Exception
{
	String r1;
	public MandatoryMissingException(String ex1)
	{
		r1=ex1;
		
	}
	public String toString()
	{
		return r1;
	}

}