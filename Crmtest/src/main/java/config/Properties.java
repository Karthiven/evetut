package config;

import java.io.FileInputStream;
import java.io.IOException;

public class Properties 
{
	java.util.Properties prop=new java.util.Properties();
	 private FileInputStream objfile=null;
	public Properties(String filename) throws IOException
	{
		
		 objfile = new FileInputStream("./src/main/java/data/"+filename+".properties");
	    prop.load(objfile);
	   
	}
	
	
	public String getdata(String input)
	{
	
		return prop.getProperty(input);
		
	}
	
	
}
