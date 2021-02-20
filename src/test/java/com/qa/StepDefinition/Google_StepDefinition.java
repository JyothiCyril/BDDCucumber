package com.qa.StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.GooglePages;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_StepDefinition {
	
	WebDriver driver;
	GooglePages GoogleOR;
	
	
	@Given("^the user is on google page$")
	public void the_user_is_on_google_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		GoogleOR = new GooglePages(driver);
		driver.get("https://www.google.com/");
	}

	@Then("^enter \"([^\"]*)\" in the search text box$")
	public void enter_in_the_search_text_box(String input) throws InterruptedException {
		GoogleOR.setinputSearchTextBox(input);
		Thread.sleep(3000);
		//System.out.println(input);
	}

	@Then("^get all the items from auto suggest$")
	public void get_all_the_items_from_auto_suggest() {
		List<WebElement> autoSuggest = GoogleOR.getAutoSuggest();
		for(WebElement item : autoSuggest) {
			System.out.println(item.getText());
		}
		
	}

	@Then("^submit the input$")
	public void submit_the_input() {
		GoogleOR.setinputSearchTextBoxSubmit();
		
	}

	@Then("^get the title and print$")
	public void get_the_title_and_print() {
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Then("^close the google browser$")
	public void close_the_google_browser() {
		driver.close();
	}
	
	
	@Then("^enter item in the search text box$")
	public void enter_item_in_the_search_text_box(DataTable SearchItem) throws InterruptedException {
		
		List<String> Count = SearchItem.asList(String.class);
		
		for(String item : Count) {
			GoogleOR.setinputSearchTextBox(item);
			Thread.sleep(3000);
		}
		
	}
	
	@Then("^type \"([^\"]*)\" in the search text box$")
	public void type_in_the_search_text_box(String input) {
		GoogleOR.setinputSearchTextBox(input);
	}

}
