package testInitiator;

import org.openqa.selenium.WebDriver;

import keyWords.AddActions;
import keyWords.AdminActions;
import keyWords.CourseActions;
import keyWords.EmailActions;
import keyWords.Macmilan2Actions;
import keyWords.MacmilanActions;
import keyWords.NewCourseActions;
import keyWords.PassWordActions;
import keyWords.PeopleActions1;
import keyWords.PeopleActions2;
import keyWords.PublishActions;
import keyWords.SearchCourseActions;

public class ObjectInitilizer {
	WebDriver driver;
	
	public EmailActions emailActions;
	public PassWordActions passWordActions;
	public AdminActions adminActions;
	public MacmilanActions macActions;
	public CourseActions courseActions;
	public NewCourseActions newCourseActions;
	public Macmilan2Actions mac2Actions;
	public AddActions addActions;
	public SearchCourseActions searchActions;
	public PublishActions publishActions;
	public PeopleActions2 peopleActions2;
	public PeopleActions1 peopleActions1;
	
	public ObjectInitilizer(WebDriver driver) {
		
		this.driver=driver;
	
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
		peopleActions2=new PeopleActions2(driver);
		peopleActions1=new PeopleActions1(driver);
	}

}
