package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.Createaccount;

public class Createtest extends Baseclass {
@Test
public void verifycreate() throws Exception 
{
	Createaccount ca= new Createaccount(driver);
	ca.click();
	Thread.sleep(3000);
	ca.setvalues();
	Thread.sleep(3000);
	ca.create();
}
}
