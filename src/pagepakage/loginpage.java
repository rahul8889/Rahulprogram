package pagepakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver d;
	
	@FindBy(xpath = "//*[@id=\"ulogin\"]")
	WebElement username;
	@FindBy(xpath = "//*[@id=\"upass\"]")
	WebElement pass;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")
	WebElement sub;
	
	
	public loginpage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	
	public void values() {
		username.sendKeys("rahul mr");
		pass.sendKeys("rahul8889");
	}
	public void click() {
		sub.click();
	}
}
