package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzn {
	
ChromeDriver d;

@Before
public void browser() throws InterruptedException
{
	d=new ChromeDriver();
	d.get("https://www.amazon.com");
	Thread.sleep(3000);
}

@Test
public void site()
{
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11",Keys.ENTER);
	d.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
	d.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[3]")).click();
	d.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	d.navigate().back();
	d.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	
	
}
}
