package keyWords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadFilee;
import util.ReadFilee1;

public class PeopleActions2_stu{
	WebDriver driver;
	public PeopleActions2_stu(WebDriver driver) {
	this.driver=driver;	
	}
	String str=PeopleActions_stu.ema;
	String str1=PeopleActions_stu. full;
	public void clickOnPeople() throws InterruptedException {
		WebElement people=ReadFilee.getElement(driver, "people", "course.txt");
		people.click();
		Thread.sleep(1000);
		
		WebElement peoples=ReadFilee.getElement(driver, "peoples", "course.txt");
		peoples.click();
		
		WebElement clickOnAdd_stu=ReadFilee1.getElement(driver, "clickonAdd_stu", "user.txt");
		Thread.sleep(2000);
		clickOnAdd_stu.click();
		clickOnAdd_stu.sendKeys(str);
		WebElement clickOnNext=ReadFilee1.getElement(driver, "clickOnNext", "user.txt");
		Thread.sleep(1000);
		clickOnNext.click();
		
		WebElement addUser=ReadFilee1.getElement(driver, "addUser", "user.txt");
		Thread.sleep(10000);
		addUser.click();
		
		WebElement clickOn_Stu=ReadFilee1.getElement(driver, "clickOn_stu", "user.txt");
		Thread.sleep(1000);
		clickOn_Stu.click();
		
		WebElement clickOnUSerMore=ReadFilee1.getElement(driver, "clickOnUSerMore", "user.txt");
		Thread.sleep(1000);
		clickOnUSerMore.click();
		
		WebElement addLogIn=ReadFilee1.getElement(driver, "addLogIn", "user.txt");
		Thread.sleep(1000);
		addLogIn.click();
		
		WebElement login=ReadFilee1.getElement(driver, "login", "user.txt");
		login.click();
		login.sendKeys(str1);
		
		WebElement pass=ReadFilee1.getElement(driver, "pass", "user.txt");
		Thread.sleep(1000);
		pass.sendKeys("12345678");
		
		WebElement confirm=ReadFilee1.getElement(driver, "confirm", "user.txt");
		Thread.sleep(1000);
		confirm.sendKeys("12345678");
	
		WebElement addLogin=ReadFilee1.getElement(driver, "addLogin", "user.txt");
		Thread.sleep(3000);
		addLogin.click();
		
		System.out.println("credinatial added succesfully");
		
	}

}
