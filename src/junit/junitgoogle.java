package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitgoogle {

	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void tiltleverification()
	{
		String actualtitle=driver.getTitle();
		String exptiltle="Gogle";
		if(actualtitle.equals(exptiltle))
		{
			System.out.println("pass");
		} else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void getstring()
	{
	String src=driver.getPageSource();
	
	if(src.contains("images"))
	{
		System.out.println("present");
	}else
	{
		System.out.println("not present");
	}
		
}
@After
public void close() 
{
	driver.close();
}
}

