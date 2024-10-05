package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgrm2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com ");
		String src=driver.getPageSource();
   if(src.contains("About"))
{
	System.out.println("present");
}
else
{
	System.out.println("not present");
}
	}

}
