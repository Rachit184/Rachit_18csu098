package com.ncu.assignment;
import java.util.*;
public class Student
{
	String FirstName;
	String  LastName;
	public Address  Addr;
	Date dob;
	public String [] Skills;
	public Qualification [] Qual;
	public Project [] projects;
	String email;
	String ContactNumber;
	
	public Student()
	{
		addr=new Address();
	}
	public Student(int qsize,int psize)
	{
		Qual=new Qualification[qsize];
		projects=new Project[psize];	
	}
		
	public void setFirstName(String FirstName)
	{
		this.FirstName=FirstName;
	}
	public String getFirstName()
	{
		return FirstName;
	}
	
	public void setLastName(String LastName)
	{
		this.LastName=LastName;
	}
	public String getLastName()
	{
		return LastName;
	}
	
	public void setdob(Date dob)
	{
		this.dob=dob;
	}
	public Date getdob()
	{
		return dob;
	}
	
	public void setemail(String email)
	{
		this.email=email;
	}
	public String getemail()
	{
		return email;
	}
	
	public void setSkills(String [] Skills)
	{
		this.Skills=Skills;
	}
	public String[] getSkills()
	{
		return Skills;
	}
	
	public void setContactNumber(String ContactNumber)
	{
		this.ContactNumber=ContactNumber;
	}
	public String getContactNumber()
	{
		return ContactNumber;
	}	
}