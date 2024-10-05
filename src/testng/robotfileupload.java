package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class robotfileupload {
	
	WebDriver d;
	@BeforeTest
	public void browser() {
		d=new ChromeDriver();
		d.get("https://www.ilovepdf.com/pdf_to_jpg");
	}
	
	@Test
	public void upload() throws Exception {
		
		d.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("C:\\Users\\ASUS\\Downloads\\weekly6\\Weekly Task6_anandhu.pdf");
	}

	public void fileupload(String p) throws AWTException {
		StringSelection sselection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sselection, null);
		
		Robot rob=new Robot();
		rob.delay(2000);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.delay(2000);
	}

}
