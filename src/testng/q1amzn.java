package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class q1amzn {

	WebDriver d;
	
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
	}
	
	@Test 
	public void Addtocart() throws InterruptedException {
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone12",Keys.ENTER);
		WebElement phone= d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span[contains(text(),'Apple iPhone 13 (128GB) - Starlight')]"));
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(true);", phone);
        Thread.sleep(4000);
		
       phone.click();
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[11]/div[40]/div[1]/div/form/div[1]/ul/li[2]")).click();
        
	}
}
