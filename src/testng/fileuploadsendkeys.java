package testng;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadsendkeys {

	WebDriver d;
	
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/upload/");
	}
	
	
	@Test
	public void test() {
		
		d.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\ASUS\\OneDrive\\Pictures\\IMG_20231124_205522[116].jpg.jpg");
		d.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		d.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	}
}
