package testpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepakage.fbloginpage;

public class fblogintest {

	WebDriver d;
	@BeforeTest
	public void setup() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}
	
	@Test
	public void test1() {
		fbloginpage ob=new fbloginpage(d);
		ob.setvalues("rahul2001ft@gmail.com","machingal");
		ob.loginclick();
	}
}
