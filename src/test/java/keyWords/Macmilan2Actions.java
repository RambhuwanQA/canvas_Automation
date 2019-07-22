package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.ReadFilee;

public class Macmilan2Actions {
	WebDriver driver;
	public Macmilan2Actions(WebDriver driver) {
		this.driver=driver;
	}
	public void macmilan() {
		WebElement mac2=ReadFilee.getElement(driver, "macmilan2", "course.txt");
		mac2.click();
		System.out.println("click onm macmilan2");
	
	    WebElement loadTest=ReadFilee.getElement(driver, "loadTest", "course.txt");
	    System.out.println("passes");
		Actions action = new Actions(driver);
		action.moveToElement(loadTest).perform();
		loadTest.click();
	}

}
