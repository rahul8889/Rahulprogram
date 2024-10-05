package testpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {

public static WebDriver d;
	
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}
}
