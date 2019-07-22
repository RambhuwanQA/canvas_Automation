package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Course;
import util.ReadFilee;

public class NewCourseActions {
	WebDriver driver;
	public static String str=Course.addNewCourse();
	public NewCourseActions(WebDriver driver) {
		this.driver=driver;
	}
public void newCourse()  {
		
		WebElement newCourse =ReadFilee.getElement(driver, "newCourse", "course.txt");
		newCourse.click();
		//System.out.println(str+"++++++++++===========");
		newCourse.sendKeys(str);
		WebElement refre=ReadFilee.getElement(driver, "refrelCode", "course.txt");
		refre.click();
		System.out.println("click on refrel");
		refre.sendKeys("1234");
	}

}
