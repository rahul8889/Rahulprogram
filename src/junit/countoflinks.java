package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countoflinks {
	
	
	ChromeDriver d;
	@Before
	 public void browser()
	{
		d=new ChromeDriver();
		d.get("https://www.google.com");
		
	}
	
	@Test
	
	public void list()
	{
		List<WebElement> li=d.findElements(By.tagName("a"));
		System.out.println("The total number of links = "+ li.size());
	}
	
	@Test
	public void display()
	{
		List<WebElement> li=d.findElements(By.tagName("a"));
		 for (WebElement link :li) {
	            System.out.println( link.getText() + " - URL: " + link.getAttribute("href"));
	        }
	}
}
