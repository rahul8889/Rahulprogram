package testpakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepakage.createpage;

public class createpagetest extends Baseclass{

	
	
	@Test
	public void test1() {
		
		createpage ob=new createpage(d);
		ob.click();
		ob.textverify();
		ob.signupclick();
	}
}
