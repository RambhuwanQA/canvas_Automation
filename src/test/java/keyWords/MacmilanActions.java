package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class MacmilanActions {
	WebDriver driver;
	
     public MacmilanActions(WebDriver driver) {
	 this.driver=driver;
     }
     public void mcmillan() throws InterruptedException  {
 		WebElement mcmilan=ReadFilee.getElement(driver, "macmilan", "locator.txt");
 		System.out.println("locator of macmilan");
 		Thread.sleep(2000);
 		mcmilan.click();
 		System.out.println("click on macmilan");
 	}
}
