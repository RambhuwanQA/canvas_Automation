package canvas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import keyWords.AddActions;
import keyWords.AdminActions;
import keyWords.CourseActions;
import keyWords.EmailActions;
import keyWords.Macmilan2Actions;
import keyWords.MacmilanActions;
import keyWords.NewCourseActions;
import keyWords.PassWordActions;
import keyWords.PeopleActions2;
import keyWords.PublishActions;
import keyWords.SearchCourseActions;

public class CanvasTest {

	WebDriver driver;
	String url="https://macmillan2.instructure.com/login/canvas";
	EmailActions emailActions;
	PassWordActions passWordActions;
	AdminActions adminActions;
	MacmilanActions macActions;
	CourseActions courseActions;
	NewCourseActions newCourseActions;
	Macmilan2Actions mac2Actions;
	AddActions addActions;
	SearchCourseActions searchActions;
	PublishActions publishActions;
	PeopleActions2 peopleActions;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rambhuwanrajpoot\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		emailActions=new EmailActions(driver);
		passWordActions=new PassWordActions(driver);
		adminActions=new AdminActions(driver);
		macActions=new MacmilanActions(driver);
		courseActions=new CourseActions(driver);
		newCourseActions=new NewCourseActions(driver);
		mac2Actions=new Macmilan2Actions(driver);
		addActions=new AddActions(driver);
		searchActions=new SearchCourseActions(driver);
		publishActions=new PublishActions(driver);
		peopleActions=new PeopleActions2(driver);
	}
	
	@Test(priority = 1)
	public void email() {
		emailActions.SendEmail();
	}
	@Test(priority = 2)
	public void passWord() {
		passWordActions.SendPassWord();
	}
	@Test (priority = 3)
	public void admin() {
		adminActions.admin();
	}
	@Test (priority = 4)
	public void mcmillan() throws InterruptedException  {
		macActions.mcmillan();
	}
	@Test(priority = 5)
	public void course() {
		courseActions.course();
	}
	@Test(priority = 6)
	public void newCourse() {
		newCourseActions.newCourse();
		
	}
	@Test(priority = 7)
	public void macmilan() {
		mac2Actions.macmilan();
	}
	@Test(priority = 8)
	public void addCourse() throws InterruptedException {
		addActions.addCourse();
	}
	@Test(priority = 9)
	public void searchCourse() throws InterruptedException   {
		searchActions.searchCourse();
	}
	@Test(priority = 10)
	public void publish() throws InterruptedException {
		publishActions.publishCourse();
	}
	@Test(priority = 11)
	public void people() throws InterruptedException {
		peopleActions.clickOnPeople();
	}
  @AfterTest
	public void quit() {
	driver.quit(); 
	System.out.println("driver end here"); 
	}
	 
}
