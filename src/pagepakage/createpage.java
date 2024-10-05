package pagepakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createpage {

	WebDriver d;
	
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpage;
	@FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	 
	public createpage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,this);
		
	}
	
	public void click() {
		
		createpage.click();
	}
	
	public void textverify() {
	String src=d.getPageSource();
	if(src.contains("create a page"))
	{
		System.out.println("text verified");
	}
	else
	{
		System.out.println("not verified ");
	}
	
	}	
	
	public void signupclick() {
		signup.click();
	}
	
}
