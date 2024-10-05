package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	ChromeDriver d;
	
	@Before
	public void browser()
	{
		d=new ChromeDriver();
		d.get("https://www.google.com");
	}
	
	@Test
	public void search()
	{
		WebElement searchfeild= d.findElement(By.name("q"));
		searchfeild.sendKeys("wonderla",Keys.ENTER);
		
	}
}

