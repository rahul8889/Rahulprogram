package testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tng1 {

	@BeforeTest
	public void tstdemo() {
		System.out.println("before test");
	}
	@BeforeMethod
	public void ulrloading() {
		System.out.println("beforemethod");
	}
	@Test(priority = 4,groups = {"smoke"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority = 3,groups = {"sanity"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority = 1,enabled = false)
	public void test3() {
		System.out.println("test3");
	}
	@Test(priority = 2,groups ={"smoke"})
	public void test4() {
		System.out.println("test4");
	}
	
	@AfterMethod
	public void aftrmthd() {
		System.out.println("aftermethod");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test ");
	}
}
