package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
WebDriver driver;
By selectaccecories=By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[3]/div/div/header/div[1]/div[3]/ul/li[7]/a");
By selectproduct=By.xpath("/html/body/div[1]/div/main/div[3]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/div[5]/div/a/div[1]/div/img");
By addtocart=By.xpath("/html/body/div[1]/div/main/div[1]/div/div/div/div/div[2]/div/div[2]/div[7]/div[2]/div/form/button");
public Productpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public void clickcart()
{
	driver.findElement(selectaccecories).click();
	driver.findElement(selectproduct).click();
	driver.findElement(addtocart).click();
	
}
}