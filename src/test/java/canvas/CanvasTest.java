package canvas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import testInitiator.ObjectInitilizer;

public class CanvasTest {

	WebDriver driver;
	String url="https://macmillan2.instructure.com/login/canvas";
	ObjectInitilizer objectInit;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rambhuwanrajpoot\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		objectInit=new ObjectInitilizer(driver);
	}
	
	@Test(priority = 1)
	public void email() {
		System.out.println("Executing 1st test case");
		objectInit.emailActions.SendEmail();
	}
	@Test(priority = 2)
	public void passWord() {
		objectInit.passWordActions.SendPassWord();
	}
	@Test (priority = 3)
	public void admin() {
		objectInit.adminActions.admin();
	}
	@Test (priority = 4)
	public void mcmillan() throws InterruptedException  {
		objectInit.macActions.mcmillan();
	}

	@Test(priority = 5)
	public void course() {
		objectInit.courseActions.course();
	}
	@Test(priority = 6)
	public void newCourse() {
		objectInit.newCourseActions.newCourse();
		
	}
	@Test(priority = 7)
	public void macmilan() {
		objectInit.mac2Actions.macmilan();
	}
	@Test(priority = 8)
	public void addCourse() throws InterruptedException {
		objectInit.addActions.addCourse();
	}
	@Test(priority = 9)
	public void addPeople() throws InterruptedException {
		objectInit.peopleActions1.clickOnPeople();
	}
	@Test(priority = 10)
	public void searchCourse() throws InterruptedException   {
		objectInit.searchActions.searchCourse();
	}
	@Test(priority = 11)
	public void publish() throws InterruptedException {
		objectInit.publishActions.publishCourse();
	}
	//@Test(priority = 12)
	public void people() throws InterruptedException {
		objectInit.peopleActions2.clickOnPeople();
	}
  @AfterTest
	public void quit() {
	driver.quit(); 
	System.out.println("driver end here"); 
	}
	 
}
