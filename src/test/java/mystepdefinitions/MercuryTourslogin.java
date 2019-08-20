package mystepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MercuryTourslogin {

	WebDriver driver;
@Given("User has launched")
public void user_has_launched() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/");
	 driver.manage().window().maximize();
}

@Then("User enters the valid credentials")
public void user_enters_the_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("userName")).sendKeys("demo");
	driver.findElement(By .name("password")).sendKeys("demo");
}

@Then("User clicks on submit button")
public void user_clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("login")).click();
}

@Then("User verifies the login status")
public void user_verifies_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	boolean b=driver.findElement(By .linkText("SIGN-OFF")).isDisplayed();
	Assert.assertTrue(b);
}

@Given("User launched the app")
public void user_launched_the_app() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/");
	 driver.manage().window().maximize();
}

@Then("user clicks on sign up link")
public void user_clicks_on_sign_up_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .linkText("REGISTER")).click();
}

@When("user enters valid data in the form")
public void user_enters_valid_data_in_the_form() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	driver.findElement(By .name("firstName")).sendKeys("vishnuu");
	driver.findElement(By .name("lastName")).sendKeys("kakumani");
	driver.findElement(By .name("phone")).sendKeys("9287645637");
	driver.findElement(By .name("userName")).sendKeys("vishnu12345@gmail.com");
	driver.findElement(By .name("address1")).sendKeys("mehdipatnam,hyderabad");
	driver.findElement(By .name("city")).sendKeys("Hyderabad");
	driver.findElement(By .name("state")).sendKeys("Telangana");
	driver.findElement(By .name("postalCode")).sendKeys("500020");
	Select s=new Select(driver.findElement(By .name("country")));
    s.selectByValue("92");
	driver.findElement(By .name("email")).sendKeys("vishnupriyaa");
	driver.findElement(By .name("password")).sendKeys("vishnu123");
	driver.findElement(By .name("confirmPassword")).sendKeys("vishnu123");
	
}

@When("user clicks on submit button available")
public void user_clicks_on_submit_button_available() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("register")).click();
}

@Then("user verifies the registration status")
public void user_verifies_the_registration_status() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	boolean b=driver.findElement(By .linkText("SIGN-OFF")).isDisplayed();
	Assert.assertTrue(b);
}


}
