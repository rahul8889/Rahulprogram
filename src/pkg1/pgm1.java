package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.muscleblaze.com ");

		
		String actualtitle= driver.getTitle();
		String exptiltle="Muscle blaze";
		if(actualtitle.equals(exptiltle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
