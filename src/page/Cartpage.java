package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {
WebDriver driver;
By cart=By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[3]/div/div/header/div[1]/div[1]/div[3]/div/div/a[3]/span");
By checkout1=By.xpath("//button[@name='checkout']");
By emailcheck=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[1]/div[2]/div[1]/div/div/input");
By country=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/input");
By firstname=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/input");
By lastname=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[3]/div/input");
By address=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/input");
By apartment=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[5]/div[1]/input");
By city=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[6]/div/input");
By state=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[7]/div/select");
By pincode=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[8]/div/input");
By mobilenumber=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[9]/div[1]/input");
By continuepayment=By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[2]/button");

public Cartpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void carts()
{
	driver.findElement(cart).click();
}
public void checkouts()
	{
	driver.findElement(checkout1);
	
	}
public void setvalues()
{
	driver.findElement(emailcheck).sendKeys("aashnashajan66@gmail.com");
	driver.findElement(country).sendKeys("India");
	driver.findElement(firstname).sendKeys("ashna");
	driver.findElement(lastname).sendKeys("shajan");
	driver.findElement(address).sendKeys("abcd");
	driver.findElement(apartment).sendKeys("avh6");
	driver.findElement(city).sendKeys("kochi");
	driver.findElement(state).sendKeys("kerala");
	driver.findElement(pincode).sendKeys("682001");
	driver.findElement(mobilenumber).sendKeys("9876554377");
}
public void contpayment()
{
	driver.findElement(continuepayment).click();
}
}
