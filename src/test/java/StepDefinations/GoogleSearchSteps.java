package StepDefinations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver=null;
	
	
	@When("Browser is opend")
	public void browser_is_opend() {
		System.out.println("User opend Google Chrome");
		
		String projectPath=System.getProperty("user.dir");
		
		
		System.setProperty("webdriver.chrome.driver",
				projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		
	}

	@When("User is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("User is on Search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("User entered text in search box")
	public void user_entered_text_in_search_box() throws InterruptedException {
		System.out.println("User entered some text on Search page");
		driver.findElement(By.name("q")).sendKeys("github");
		Thread.sleep(2000);
	}

	@When("Hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("User has hit the enter button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("User is navigated to Search Page")
	public void user_is_navigated_to_search_page() throws InterruptedException {
		System.out.println("User is successfully navigated to relevant page");
		driver.getPageSource().contains("Git Hub Login");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
