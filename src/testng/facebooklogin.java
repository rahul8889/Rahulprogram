package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebooklogin {

	
	ChromeDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}
	@Parameters({"id","pasw"})
	@Test
	public void loginString (String id,String pasw) {
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(id);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys(pasw);
		d.findElement(By.name("login")).click();
	}
}
