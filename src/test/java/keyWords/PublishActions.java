package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class PublishActions {
	WebDriver driver;
	public PublishActions(WebDriver driver) {
		this.driver=driver;
	}
	public void publishCourse() throws InterruptedException {
		WebElement publish=ReadFilee.getElement(driver, "publish", "locator.txt");
		System.out.println("locator of publish");
		Thread.sleep(2000);
		publish.click();
		System.out.println("click on publish");
		
		WebElement chooseAction=ReadFilee.getElement(driver, "chooseAction", "locator.txt");
		System.out.println("chooseAction");
		Thread.sleep(2000);
		chooseAction.click();
		
		WebElement choosePublish=ReadFilee.getElement(driver, "chooseAndPublish", "locator.txt");
	    choosePublish.click();
	}

}
