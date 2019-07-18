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
		publish.click();
		System.out.println("click on publish");
		
		WebElement chooseAction=ReadFilee.getElement(driver, "chooseAction", "locator.txt");
		chooseAction.click();
		Thread.sleep(2000);
		WebElement choosePublish=ReadFilee.getElement(driver, "chooseAndPublish", "locator.txt");
	    choosePublish.click();
	}

}
