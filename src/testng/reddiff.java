package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reddiff {
	
	ChromeDriver d;
	@BeforeTest
	public void browser() {
		
		d=new ChromeDriver();
	
	}
	@BeforeMethod 
	public void url() {
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	
	@Test
	public void logodisplay() {
		WebElement logo=d.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo not present");
		}
	}
	
	@Test
	public void radiobutton() {
		WebElement rb=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]"));
		boolean a=rb.isSelected();
		if(a)
		{
			System.out.println("button is selected");
		}
		else
		{
			System.out.println("button is not selected");
		}
	}
	@Test
	public void button() {
		WebElement bt=d.findElement(By.xpath("//*[@id=\"Register\"]"));
		boolean l=bt.isEnabled();
		if(l)
		{
			System.out.println("button is enable ");
			}
			
			else
			{
				System.out.println("button is not enable");
			}
		
	}
}
