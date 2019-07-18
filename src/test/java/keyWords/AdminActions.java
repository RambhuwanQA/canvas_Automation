package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class AdminActions {
	WebDriver driver;
	
	public AdminActions(WebDriver driver) {
		this.driver=driver;
	}

	public void admin() {
		WebElement admin=ReadFilee.getElement(driver, "admin", "locator.txt");
		admin.click();
		System.out.println("click on admin");
	}
}
