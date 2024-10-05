package junit;

import java.net.URI;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.exec.ExecuteException;
import org.junit.Test;

public class responsecode {

	
	String link="https://www.facebook.com";
	
@Test
public void test() throws Exception
{
	URI ob=new URI(link);
	HttpsURLConnection c=(HttpsURLConnection)ob.toURL().openConnection();
	System.out.println(c.getResponseCode());
}
}
