package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class PassWordActions {
	WebDriver driver;
	public PassWordActions(WebDriver driver) {
		this.driver=driver;
	}
public void SendPassWord() {
	WebElement pass=ReadFilee.getElement(driver, "passWord", "locator.txt");
	pass.click();
	pass.sendKeys("canvas");
	WebElement login=ReadFilee.getElement(driver, "logIn", "locator.txt");
	login.click();
	System.out.println("login successfully");
   }
}
