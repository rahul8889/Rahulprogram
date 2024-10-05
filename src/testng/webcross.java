package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class webcross {
	
	WebDriver d;
	@Parameters("browser")
@BeforeTest
public void bopen(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			d=new ChromeDriver();
		}
		else
		{
			d=new EdgeDriver();
		}
	}
		@Test 
		public void test()
		{
			d.get("https://www.google.com");
		}
	}
	
	
	
	
	
	
	
	

