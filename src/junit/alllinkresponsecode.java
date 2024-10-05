package junit;

import java.net.URI;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinkresponsecode {
	
	ChromeDriver d;
	
	@Before
	public void browser()
	{
		d=new ChromeDriver();
		d.get("https://www.google.com");
	}
	
	@Test
	public void countlink()
	{
		List<WebElement>li=d.findElements(By.tagName("a"));
		System.out.println("total links ="+li.size());
	}

	@Test
	public void display()
	{
		List<WebElement> li=d.findElements(By.tagName("a"));
		 for (WebElement link :li) {
	          String l=link.getAttribute("href");
	          verifylink(l);
	            
	            
	        }
	}
	private void verifylink(String link) {
	try
	{
		URI ob=new URI(link);
		HttpsURLConnection c=(HttpsURLConnection)ob.toURL().openConnection();
		if(c.getResponseCode()==200){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
}
