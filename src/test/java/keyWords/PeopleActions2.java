package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class PeopleActions2{
	WebDriver driver;
	public PeopleActions2(WebDriver driver) {
	this.driver=driver;	
	}
	public void clickOnPeople() throws InterruptedException {
		WebElement people=ReadFilee.getElement(driver, "people", "locator.txt");
		people.click();
		Thread.sleep(1000);
		
		WebElement peoples=ReadFilee.getElement(driver, "peoples", "locator.txt");
		peoples.click();
	}

}
