package test;

import org.testng.annotations.Test;

import page.Cartpage;

public class Carttest extends Producttest {
@Test(priority=3)
public void verifycart() throws Exception 
{
Cartpage cp=new Cartpage(driver);
Thread.sleep(10000);
cp.carts();
Thread.sleep(8000);
cp.checkouts();
cp.setvalues();
cp.contpayment();
}
}