package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assertion {
	
	WebDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.Google.com");
	}
	
	@Test
	public void tverify() {
		String at=d.getTitle();
		String et="Google";
		System.out.println("title="+at);
	
		Assert.assertEquals(at,et,"veryfied");
	}
	

}
