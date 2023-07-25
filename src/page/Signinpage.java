package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Signinpage {
WebDriver driver;

By signinbtn=By.name("//*[@id=\"customer_login\"]/p[1]/button");
By emailIdField=By.id("email");
By firepassword=By.id("password");
By icon=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[3]/div/div/a[1]");

public Signinpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void icon()
{
	driver.findElement(icon).click();
}
public void setvalues()
{
	driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("aashnashajan66@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("7034391309");
}
public void clickLoginBtn()
{
	driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();
}
}
