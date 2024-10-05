package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	ChromeDriver d;
	
	@Before
	public void browser() {
		d=new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void dob() {
		
		
		
		
		   // Select the day
        WebElement day1 = d.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
        Select D=new Select(day1);
        D.selectByValue("02");

        
        // Select the month
        WebElement month = d.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
       Select M=new Select(month);
        M.selectByVisibleText("FEB");

      
       
        // Select the year
        WebElement year1 = d.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
       Select y=new Select(year1);
        y.selectByValue("1990");

     
	}
}
