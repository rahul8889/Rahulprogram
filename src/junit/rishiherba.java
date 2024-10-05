package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rishiherba {
ChromeDriver d;
@Before
public void browser()
{
	d=new ChromeDriver();
	d.get("https://rishiherbalindia.linker.store");
}

@Test
public void title()
{
	
    String actualTitle = d.getTitle();
    String expectedTitle = "rishiherbal";
    if (actualTitle.equals(expectedTitle)) {
        System.out.println("Title matched!");
    } else {
        System.out.println("Title didn't match!");
    }
    }


@Test
    public void nolink()
    {
    	List<WebElement> li=d.findElements(By.tagName("a"));
	System.out.println("The total number of links = "+ li.size());
if(li.size()==100) {
	System.out.println("equals to 100 links");
}else {
	System.out.println("not equals to 100 links");
}
    }

@Test
public void text()
{
	String a=d.getPageSource();
	if(a.contains("FOOD"))
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
}

@Test
public void click()
{
	d.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a"));
}
}
