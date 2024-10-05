package testng;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragdrop {

ChromeDriver d;

@BeforeTest
public void browser()
{
	d=new ChromeDriver();
	d.get("https://demo.guru99.com/test/drag_drop.html");
	d.manage().window().maximize();
}
	@Test
	public void dd()
	{
	WebElement debacc=d.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement bank=d.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	Actions ac=new Actions(d);
	ac.dragAndDrop(debacc, bank).perform();
	
	
	WebElement debfive =d.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement debam =d.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	ac.dragAndDrop( debfive,debam).perform();
	
	
	WebElement crdsales=d.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement crdlac=d.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	ac.dragAndDrop(crdsales, crdlac).perform();
	
	
	WebElement crdfiv=d.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement crdamt=d.findElement(By.xpath("//*[@id=\"amt8\"]"));
	ac.dragAndDrop(crdfiv, crdamt).perform();
	}
@Test
public void perfect()
{
	WebElement msg=d.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	boolean b=msg.isDisplayed();
	if(b)
	{
		System.out.println("is displayed");
	}else
	{
		System.out.println("not displayed");
	}
}
}
