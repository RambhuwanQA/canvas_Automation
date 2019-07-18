package keyWords;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.ReadFilee;

public class SearchCourseActions {
	WebDriver driver;
	public SearchCourseActions(WebDriver driver) {
		this.driver=driver;
	}
	public void searchCourse() throws InterruptedException    {
		WebElement searchCourse=ReadFilee.getElement(driver, "searchCourse", "locator.txt");
		Actions action = new Actions(driver);
		action.moveToElement(searchCourse).perform();
		searchCourse.click();
		Thread.sleep(2000);
	    System.out.println("click on search");
		searchCourse.sendKeys("newCourse18july");
		System.out.println("course found");
		
		WebElement clickonCourse=driver.findElement(By.xpath("(//a[text()=\"newCourse18july\"])[2]"));
		clickonCourse.click();
		Thread.sleep(2000);
		
		WebElement notification=driver.findElement(By.xpath("//span[@class=\"notification_message\"]"));
		String text=notification.getText();
		assertEquals(notification, text);
	}

}
