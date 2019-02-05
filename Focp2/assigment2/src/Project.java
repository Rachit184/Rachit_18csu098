package com.ncu.assignment;
import java.util.*;
public class Project
{
	String 	Name;
	Date StartDate;
	Date EndDate;
	String Role;
	public String [] Responsibility;
	
	public void setName(String Name)
	{
		this.Name=Name;
	}	
	public String getname()
	{
		return Name;
	}
	
	public void setStartDate(Date StartDate)
	{
		this.StartDate=StartDate;
	}
	public Date getStartDate()
	{
		return StartDate;
	}
	
	public void setEndDate(Date EndDate)
	{
		this.EndDate=EndDate;
	}
	public Date getEndDate()
	{
		return EndDate;
	}
	
	public void setRole(String Role)
	{
		this.Role=Name;
	}	
	public String getRole()
	{
		return Role;
	}
	
	public void setResponsibility(String [] Responsibility)
	{
		this.Responsibility=Responsibility;
	}
	public String [] getResponsibility()
	{
		return Responsibility;
	}
}