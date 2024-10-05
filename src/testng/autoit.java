package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autoit {
	
	WebDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.ilovepdf.com/pdf_to_jpg");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void upload() throws Exception {
		
		d.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\ASUS\\OneDrive\\Documents\\GTA San Andreas User Files\\t1.exc");
		Thread.sleep(2000);
	}
	
	

}
