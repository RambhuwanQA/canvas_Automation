package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.ReadFilee;

public class MacmilanActions {
	WebDriver driver;
	
     public MacmilanActions(WebDriver driver) {
	 this.driver=driver;
	 
     }
     public void mcmillan() throws InterruptedException  {
 		WebElement mcmilan=ReadFilee.getElement(driver, "macmilan", "course.txt");
 		
 		Actions action = new Actions(driver);
		action.moveToElement(mcmilan).perform();
 		//Thread.sleep(3000);
 		mcmilan.click();
 		System.out.println("click on macmilan");
 	}
}
