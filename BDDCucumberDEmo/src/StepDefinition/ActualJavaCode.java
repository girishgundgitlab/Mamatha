package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActualJavaCode {
	
	WebDriver driver;
	
	@Given("^User open chrome browser$")
	public void user_open_chrome_browser(){
	    
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\Drivers\\chromedriver_96.exe");
		 driver = new ChromeDriver();
	   
	}

	@Given("^Enter Url$")
	public void enter_Url() {
	    driver.get("https://www.facebook.com/");
	    
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() {
	    //give username
		//give password
	   
	}

	@When("^Click on login button$")
	public void click_on_login_button() {
		
		//click login button
	   
	   
	}

	@Then("^Login should be succesfull$")
	public void login_should_be_succesfull(){
	   
		System.out.println("Login is sucessful");
	    
	}

	@Then("^click on home hyperlink$")
	public void click_on_home_hyperlink() throws Throwable {
	    //click on home button -- driver.find
	    
	}

}
