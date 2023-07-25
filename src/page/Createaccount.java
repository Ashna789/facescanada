package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccount {
WebDriver driver;
By icon=By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[3]/div/div/header/div[1]/div[1]/div[3]/div/div/a[1]");
By createaccount=By.xpath("//*[@id=\"customer_register_link\"]");
By firstname=By.xpath("/html/body/div[1]/div/main/div/div/form/input[3]");
By lastname=By.xpath("/html/body/div[1]/div/main/div/div/form/input[4]");
By email=By.xpath("/html/body/div[1]/div/main/div/div/form/input[5]");
By password=By.xpath("/html/body/div[1]/div/main/div/div/form/input[6]");
By create=By.xpath("/html/body/div[1]/div/main/div/div/form/p/input");

public Createaccount(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void click()
{
	driver.findElement(icon).click();
	driver.findElement(createaccount).click();
}
public void setvalues()
{
	driver.findElement(firstname).sendKeys("Ashna");
	driver.findElement(lastname).sendKeys("Shajan");
	driver.findElement(email).sendKeys("aashnashajan66@gmail.com");
	driver.findElement(password).sendKeys("7034391309");
}
public void create()
{
	driver.findElement(create).click();
}
}
