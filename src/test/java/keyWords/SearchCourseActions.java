package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.ReadFilee;

public class SearchCourseActions {
	WebDriver driver;
	String str1=NewCourseActions.str;
	
	public SearchCourseActions(WebDriver driver) {
		this.driver=driver;
	}
	public void searchCourse() throws InterruptedException    {
		
		WebElement clickOnCourseAgain=ReadFilee.getElement(driver,"clickOnCourseAgain", "user.txt");
		Thread.sleep(5000);
		clickOnCourseAgain.click();
		
		WebElement searchCourse=ReadFilee.getElement(driver, "searchCourse", "user.txt");
		System.out.println("locator of search course");
		Thread.sleep(7000);
		Actions action = new Actions(driver);
		action.moveToElement(searchCourse).perform();
		searchCourse.click();
		
	    System.out.println("click on search");
		searchCourse.sendKeys(str1);
		System.out.println("course found");
		
		Thread.sleep(3000);
		WebElement courseWithText=ReadFilee.getElement(driver, "courseWithText", "course.txt",str1);
		courseWithText.click();
		}

}
