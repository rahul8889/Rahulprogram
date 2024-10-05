package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xlrun {
WebDriver d;
@BeforeTest
public void browser() {
	d=new ChromeDriver();
	d.get("https://www.facebook.com");
}
	@Test
	public void xlimport() throws IOException {
		FileInputStream ob=new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Documents\\book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pw=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"-----------"+pw);
			
			d.findElement(By.name("email")).clear();
			d.findElement(By.name("email")).sendKeys(un);
			d.findElement(By.name("pass")).clear();
			d.findElement(By.name("pass")).sendKeys(pw);
			d.findElement(By.name("login")).click();
			d.navigate().refresh();
			
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


}
