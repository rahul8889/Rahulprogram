package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	
ChromeDriver driver;
@Before
public void login()
{
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
}

@Test
public void enternum()
{
	driver.findElement(By.id("email")).sendKeys("rahul2001ft@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("machingal");
	driver.findElement(By.name("login")).click();
}
}
