package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpth {

	ChromeDriver d;
	@Before
	public void browser()
	{
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}
	
	@Test
	public void enterdetails()
	{
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("rahul2001ft@gamil.com");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("machingal");
		d.findElement(By.xpath("//button[@name='login']")).submit();
	}
}
