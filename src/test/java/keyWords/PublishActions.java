package keyWords;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;
import util.ReadFilee1;

public class PublishActions {
	WebDriver driver;
	public PublishActions(WebDriver driver) {
		this.driver=driver;
	}
	public void publishCourse() throws InterruptedException {
		WebElement publish=ReadFilee.getElement(driver, "publish", "course.txt");
		System.out.println("locator of publish");
		Thread.sleep(2000);
		publish.click();
		System.out.println("click on publish");
		
		WebElement chooseAction=ReadFilee.getElement(driver, "chooseAction", "course.txt");
		System.out.println("chooseAction");
		Thread.sleep(2000);
		chooseAction.click();
		
		WebElement choosePublish=ReadFilee.getElement(driver, "chooseAndPublish", "course.txt");
	    Thread.sleep(2000);
		choosePublish.click();
	    
	  //  WebElement message=ReadFilee1.getElement(driver, "message", "user.txt");;
	  //  String str=message.getText();
	  //  System.out.println(str);
	  //  assertEquals(str.trim(), "Recent Activity in 1234");
	    
	}

}
