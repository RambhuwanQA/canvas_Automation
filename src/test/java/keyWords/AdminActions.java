package keyWords;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;

public class AdminActions {
	WebDriver driver;
	
	public AdminActions(WebDriver driver) {
		this.driver=driver;
	}

	public void admin() throws InterruptedException {
		WebElement admin=ReadFilee.getElement(driver, "admin", "course.txt");
		Thread.sleep(2000);
		admin.click();
		System.out.println("click on admin");
		WebElement visibleAdmin=ReadFilee.getElement(driver,"visibleAdmin","course.txt");
		String text=visibleAdmin.getText();
		System.out.println(text);
		assertEquals(text.trim(),"Admin");
	}
}
