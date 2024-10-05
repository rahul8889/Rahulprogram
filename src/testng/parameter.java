package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {

	@Parameters("v")
	@Test
	public void test1(String v) {
		System.out.println("java file will call to xml file=" +v);
	}
}
