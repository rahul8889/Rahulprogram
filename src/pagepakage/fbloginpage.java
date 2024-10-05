package pagepakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpage {

	WebDriver d;
	
	@FindBy(id="email")
	WebElement fbemail;
	@FindBy(id="pass")
	WebElement fbpswd;
	@FindBy(name="login")
	WebElement fbloginbtn;
	
	public fbloginpage(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	public void setvalues(String email,String pswd)
	{
		fbemail.sendKeys(email);
		fbpswd.sendKeys(pswd);
	}
	public void loginclick()
	{
		fbloginbtn.click();
	}
}
