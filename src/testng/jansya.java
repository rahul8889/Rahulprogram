package testng;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jansya {

	WebDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://janasya.com/");
	}
	@Test
	public void titleverification() {
		String actualTitle = d.getTitle();
        String expectedTitle = "janasya";
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Title didn't match");
        }
		
	}
	
	@Test
	public void nooflinks() {
		 List<WebElement> links=d.findElements(By.tagName("a"));
	  System.out.println("Number of links on the page: " + links.size());
	  if(links.size()==400)
	  {
		  System.out.println("pass");
	  }else
	  {
		  System.out.println("fail");
	  }
	}
	  @Test
	  public void srnsht() throws IOException {
		  File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(src, new File(".\\sceenshot\\pagescreenshot.png"));
	       
		  
	  
	  }
	  
	  
		 
		 
	        
	
}
