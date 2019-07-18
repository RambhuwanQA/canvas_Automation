package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class PeopleActions {
	WebDriver driver;
	public PeopleActions(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnPeople() {
		WebElement clickOnPeople=ReadFilee.getElement(driver, "clickOnPeople", "locator.txt");
		clickOnPeople.click();
	}

}
