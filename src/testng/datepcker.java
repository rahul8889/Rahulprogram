package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepcker {

	WebDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.trivago.com/");
	}
	@Test
	public void datepik() {
		
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]")).click();
		datepik("November 2024","26");
		
	}
	public void datepik(String exm,String exd) {
		
		while(true) {
		WebElement mnthdetails=d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
		String month=mnthdetails.getText();
		if(exm.equals(month))
		{
			System.out.println(month);
		break;
		}
		else
		{
			d.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
		}
		}
		List<WebElement>datelist=d.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement element:datelist)
		{
			String date=element.getText();
			if(date.equals(exd))
			{
				element.click();
				break;
			}
			
		}
	}
	
}
