package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.chrome.ChromeDriver;

public class demopgm {

	ChromeDriver d;
	@Before
	public void browser()
	{
		d=new ChromeDriver();
		d.get("file:///C:/Users/ASUS/OneDrive/Documents/demo.html ");
	}
	@Test
	public void  input()
	{
		d.findElement(By.xpath("/html/body/input[2]")).sendKeys("rahul");
		d.findElement(By.xpath("/html/body/input[3]")).sendKeys("mr");
		d.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=d.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
	}
}
