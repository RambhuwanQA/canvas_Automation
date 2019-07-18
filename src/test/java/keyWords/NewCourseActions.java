package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class NewCourseActions {
	WebDriver driver;
	public NewCourseActions(WebDriver driver) {
		this.driver=driver;
	}
public void newCourse()  {
		
		WebElement newCourse =ReadFilee.getElement(driver, "newCourse", "locator.txt");
		newCourse.click();
		newCourse.sendKeys("newCourse18july");
		//String str=Course.addNewCourse();
		//System.out.println(str+"++++++++++===========");
		WebElement refre=ReadFilee.getElement(driver, "refrelCode", "locator.txt");
		refre.click();
		System.out.println("click on refrel");
		refre.sendKeys("1234");
	}

}
