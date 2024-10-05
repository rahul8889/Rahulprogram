package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandling {

	WebDriver d;
	
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/popup.php"); }
	@Test	
	public void test() throws InterruptedException {
		String pw=d.getWindowHandle();
		System.out.println("parent window Title="+d.getTitle());
	d.findElement(By.xpath("/html/body/p/a")).click();
	Set<String> allw=d.getWindowHandles();
	
	for(String handle:allw) {
		if(!handle.equalsIgnoreCase(pw)) {
			d.switchTo().window(handle);
			d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);
			d.close();
		}
		d.switchTo().window(pw);
	}
	
	}
	

}
