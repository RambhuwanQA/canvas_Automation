package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class CourseActions {
	
	WebDriver driver;
	public CourseActions(WebDriver driver) {
		this.driver=driver;
	}
	public void course() {
		WebElement course =ReadFilee.getElement(driver, "course", "locator.txt");
		course.click();
		System.out.println("click on course");
	}

}
