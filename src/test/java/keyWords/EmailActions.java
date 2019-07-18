package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class EmailActions {
	WebDriver driver;
	
	public EmailActions(WebDriver driver) {
		this.driver=driver;
	}
	public void SendEmail() {
		WebElement email=ReadFilee.getElement(driver, "email", "locator.txt");
		
		email.click();
		email.sendKeys("canvasadmin");
	 
	}

}