package com.ncu.assignment;
public class Qualification
{
	String QualName;
	String University;
	String Institute;
	float CGPA;
	
	public void setQualName(String QualName)
	{
		this.QualName=QualName;
	}
	public String getQualName()
	{
		return QualName;
	}
	
	public void setUniversity(String University)
	{
		this.University=University;
	}
	public String getUniversity()
	{
		return University;
	}
	
	public void setInstitute(String Institute)
	{
		this.Institute=Institute;
	}
	public String getInstitute()
	{
		return Institute;
	}
	
	public void setCGPA(float CGPA)
	{
		this.CGPA=CGPA;
	}
	public float getCGPA()
	{
		return CGPA;
	}
}