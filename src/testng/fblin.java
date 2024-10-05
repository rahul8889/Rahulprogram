package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fblin {
	
	
	ChromeDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}
	
	@Test
	public void input() {
		
		d.findElement(By.name("email")).sendKeys("rahul2001ft@gmail.com");
		d.findElement(By.name("pass")).sendKeys("machingal");
		d.findElement(By.name("login")).click();
		//String expurl="https://www.facebook.com/";
		//String acturl=d.getCurrentUrl();
		String acttitle=d.getTitle();
		String exptitle="Facebook";
		if(acttitle.contains( exptitle))
		{
			System.out.println("log in successful");
		}
		else
		{
			System.out.println("log in not successful");
		}
	}

}
