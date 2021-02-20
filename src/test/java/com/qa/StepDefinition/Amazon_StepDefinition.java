package com.qa.StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Amazon_StepDefinition {
	
	WebDriver driver;
	AmazonPages AmazonOR;
	
	/* @Before
	public void setUp() {
		System.out.println("I am @Before Method");
	}
	
	@After
	public void tearDown() {
		System.out.println("I am @After Method");
	} */
	
	
	@Given("^the user opens the browser$")
	public void the_user_opens_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		AmazonOR = new AmazonPages(driver);
	}
	
	@Then("^the user runs the URL$")
	public void the_user_runs_the_URL(){
		driver.get("https://www.amazon.in/");
	}
	
	@Given("^The user is an amazon home page$")
	public void the_user_is_an_amazon_home_page() {
		
		String title = driver.getTitle();
		boolean status = title.contains("Amazon");
		Assert.assertTrue(status);
		System.out.println("The user is an amazon home pages");
		
	}
	
	@When("^the user select category as \"([^\"]*)\"$")
	public void the_user_select_category_as(String Category) {
		AmazonOR.SetCategoryList(Category);
	}

	@Then("^enter the \"([^\"]*)\"$")
	public void enter_the(String itemName){
		AmazonOR.setSearchInput(itemName);
	};


	/*
	 * @When("^the user select category as books$") public void
	 * the_user_select_category_as_books() { AmazonOR.SetCategoryList("Books"); }
	 * 
	 * @Then("^enter the da vinci code$") public void enter_the_da_vinci_code() {
	 * AmazonOR.setSearchInput("Da vinci code"); }
	 */

	@Then("^click the magnifier button$")
	public void click_the_magnifier_button() {
		AmazonOR.setMagnifierBtn();
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() {
		String title = driver.getTitle();
		boolean status = title.contains("Amazon");
		Assert.assertTrue(status);
		//Assert.assertEquals(title, "Da vinci code");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}

	
	  @Then("^check the total number of footerlinks present the page$") 
	  public void check_the_total_number_of_footerlinks_present_the_page() { 
	  List<WebElement> FooterLinks = AmazonOR.getAllFooterLinks(); 
	  int count = FooterLinks.size();
	  System.out.println("Total no. of footer links present are:" + count); 
	  boolean status = count<=200; 
	  Assert.assertTrue(status); 
	  }
	 


}
