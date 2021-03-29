package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Lib extends WebBase
{
	public static String getProperty(String path,String key)
	{
		String value="";
		try
		{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			value= p.getProperty(key);
		}
		catch(Exception e){
		}
		return value;
	}
	
	public static String writeProperty(String path,String key)
	{
		String value="";
		try
		{
			Properties prop = new Properties();
			OutputStream write =new FileOutputStream(path);
			prop.setProperty("ProductID", key);
			prop.store(write, "Testers mind of o2");
		}
		catch(Exception e){
		}
		return value;
	}
	
}
