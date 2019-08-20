package mystepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmelogin_param {
WebDriver driver;
@Given("TestMe App is launched")
public void testme_App_is_launched() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.manage().window().maximize();
}

@Then("User clicks on SignIn link")
public void user_clicks_on_SignIn_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@When("User enters valid username {string}")
public void user_enters_valid_username(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("userName")).sendKeys(string);
	
}

@When("user enters valid password {string}")
public void user_enters_valid_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("password")).sendKeys(string);
}

@When("clicks on login button")
public void clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("Login")).click();;
}

@Then("verify the login status")
public void verify_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	boolean b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).isDisplayed();
	Assert.assertTrue(b);
}

@Then("clicks on signout")
public void clicks_on_signout() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	driver.close();
}



}
