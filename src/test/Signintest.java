package test;

import org.testng.annotations.Test;


import base.Baseclass;
import page.Signinpage;

public class Signintest extends Baseclass {
@Test(priority=1)
public void verifysignin() throws Exception
{
	Signinpage sp=new Signinpage(driver);
	sp.icon();
	sp.setvalues();
	sp.clickLoginBtn();
}
}
