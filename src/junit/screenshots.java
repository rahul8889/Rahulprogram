package junit;

import java.io.File;

import java.io.IOException;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshots {

	
	ChromeDriver d;
	
	@Before
	public void browser()
	{
		d=new ChromeDriver();
		d.get("file:///C:/Users/ASUS/OneDrive/Documents/demo.html");
	}
	
	@Test
	public void scrnsht() throws IOException
	{
	
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\eclipse\\snsht.png"));
		
		WebElement e=d.findElement(By.xpath("/html/body/input[1]"));
		File src1=e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./sceenshot/buttonscreenshot.png"));
	}
}
