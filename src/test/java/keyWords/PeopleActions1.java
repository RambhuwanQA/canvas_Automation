package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.ReadFilee;
import util.User;

public class PeopleActions1 {
	WebDriver driver;
	public PeopleActions1(WebDriver driver) {
		this.driver=driver;
	}
	public String full=User.Instructor();
	public String ema=User.userInstructor();
	public void clickOnPeople() throws InterruptedException {
		WebElement clickOnPeople=ReadFilee.getElement(driver, "clickOnPeople", "locator.txt");
		clickOnPeople.click();
		
		WebElement addPeoples=ReadFilee.getElement(driver, "addPeoples", "locator.txt");
		addPeoples.click();
		Thread.sleep(2000);
		WebElement fullName=ReadFilee.getElement(driver, "fullName", "locator.txt");
		Actions action = new Actions(driver);
		action.moveToElement(fullName).perform();
		fullName.click();
		System.out.println("click on full name");
		
		fullName.sendKeys(full);
		
		WebElement email_New=ReadFilee.getElement(driver, "email_New", "locator.txt");
		action.moveToElement(email_New).perform();
		email_New.click();
		Thread.sleep(2000);
		System.out.println("click on emailnew");
		email_New.sendKeys(ema);
		
		WebElement submit=ReadFilee.getElement(driver, "submit", "locator.txt");
		submit.click();
		
		System.out.println("instructor added succesfully");
		
	}

}
