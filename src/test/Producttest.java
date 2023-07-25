package test;

import org.testng.annotations.Test;
import page.Productpage;

public class Producttest extends Signintest {
	@Test(priority=2)
	public void verifyproduct() throws Exception
	{
	Productpage pa=new Productpage(driver);
	pa.clickcart();
	Thread.sleep(3000);
	}
	

}
