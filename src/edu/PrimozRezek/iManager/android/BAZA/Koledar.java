package edu.PrimozRezek.iManager.android.BAZA;

import java.sql.Date;

public class Koledar 
{
	public String datum;
	public String NaslovDogodka;
	public String OpisDogodka;
	public long dbID;
	
	

	public long getDbID() 
	{
		return dbID;
	}
	public void setDbID(long dbID) 
	{
		this.dbID = dbID;
	}
	public String getDatum() 
	{
		return datum;
	}
	public void setDatum(String d) 
	{
		this.datum = d;
	}
	public String getNaslovDogodka() 
	{
		return NaslovDogodka;
	}
	public void setNaslovDogodka(String naslovDogodka) 
	{
		NaslovDogodka = naslovDogodka;
	}
	public String getOpisDogodka() 
	{
		return OpisDogodka;
	}
	public void setOpisDogodka(String opisDogodka) 
	{
		OpisDogodka = opisDogodka;
	}

	
	

}
