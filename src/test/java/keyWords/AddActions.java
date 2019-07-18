package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class AddActions {
	WebDriver driver;
	public AddActions(WebDriver driver) {
		this.driver=driver;
	}
	public void addCourse() throws InterruptedException {
		WebElement add=ReadFilee.getElement(driver, "add", "locator.txt");
		add.click();
		System.out.println("new course added");
		//WebElement added=driver.findElement(By.xpath("//p[text()=\"newCourse18july successfully added!\"]"));
		//String text=added.getText();
		//System.out.println(text+" +++++++==================");
		Thread.sleep(5000);
		//assertEquals(added, "text");
	}

}
