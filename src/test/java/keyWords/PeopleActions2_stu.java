package keyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.ReadFilee;


public class PeopleActions2_stu{
	WebDriver driver;
	public PeopleActions2_stu(WebDriver driver) {
	this.driver=driver;	
	}
	String str=PeopleActions_stu.ema;
	String str1=PeopleActions_stu. full;
	public void clickOnPeople1() throws InterruptedException {
		System.out.println("finding element");
		Thread.sleep(2000);
		WebElement people1=ReadFilee.getElement(driver, "people_stu", "user.txt");
		System.out.println("people adding process stat");
	    Thread.sleep(4000);
		people1.click();
		
		WebElement peoples=ReadFilee.getElement(driver, "peoples_stu", "user.txt");
		Thread.sleep(1000);
		peoples.click();
		
		WebElement clickOnAdd_stu=ReadFilee.getElement(driver, "clickonAdd_stu", "user.txt");
		Thread.sleep(2000);
		clickOnAdd_stu.click();
		clickOnAdd_stu.sendKeys(str);
		WebElement clickOnNext=ReadFilee.getElement(driver, "clickOnNext_stu", "user.txt");
		Thread.sleep(1000);
		clickOnNext.click();
		
		WebElement addUser=ReadFilee.getElement(driver, "addUser_stu", "user.txt");
		Thread.sleep(1000);
		addUser.click();
		
		WebElement clickOn_Stu=ReadFilee.getElement(driver, "clickOn_stu", "user.txt");
		Thread.sleep(1000);
		clickOn_Stu.click();
		
		WebElement clickOnUSerMore=ReadFilee.getElement(driver, "clickOnUSerMore_stu", "user.txt");
		Thread.sleep(1000);
		clickOnUSerMore.click();
		
		WebElement addLogIn=ReadFilee.getElement(driver, "login", "user.txt");
		
		Actions action = new Actions(driver);
		action.moveToElement(addLogIn).perform();
		Thread.sleep(3000);
		addLogIn.click();
		
		WebElement login=ReadFilee.getElement(driver, "login1_stu", "user.txt");
		Thread.sleep(2000);
		login.click();
		login.sendKeys(str1);
		
		WebElement pass=ReadFilee.getElement(driver, "pass_stu", "user.txt");
		Thread.sleep(3000);
		pass.sendKeys("12345678");
		
		WebElement confirm=ReadFilee.getElement(driver, "confirm_stu", "user.txt");
		Thread.sleep(2000);
		confirm.sendKeys("12345678");
	
		WebElement addLogin1=ReadFilee.getElement(driver, "addLogin_stu", "user.txt");
		Thread.sleep(3000);
		addLogin1.click();
		
		System.out.println("credinatial added succesfully");
		
	}

}
