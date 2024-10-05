package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendreport {

	WebDriver d;
	String burl="https://www.facebook.com";
	ExtentSparkReporter report;
	ExtentTest test;
	ExtentReports extent;
	
	
	@BeforeTest
	public void btest() {
		
		report=new ExtentSparkReporter("./Reports/Rfile1.html");
		report.config().setDocumentTitle("Automationreport");
		report.config().setReportName("funtional test");
		report.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("host name", "local host");
		extent.setSystemInfo("os", "windows 10");
		extent.setSystemInfo("browser name ", "chrome");
		d=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void browser() {
		d.get(burl);
		
	}
	
	@Test
	public void titleverification() {
		test=extent.createTest("titleverification");
		String actitle = d.getTitle();
        String exptitle = "Facebook";
        Assert.assertEquals(exptitle, actitle);

	}
	
	@Test
	public void buttonverification() {
		test=extent.createTest("buttonverication");
		  WebElement loginButton = d.findElement(By.name("login"));
	        Assert.assertTrue(loginButton.isDisplayed());
	        Assert.assertTrue(loginButton.isEnabled());
	        loginButton.click();
		
	}
	
	@AfterTest
	public  void teardown() {
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is" +result.getThrowable());
//			String scnsht=ScreenshotMethod(d,result.getName());
		}
	}
	
	
}
