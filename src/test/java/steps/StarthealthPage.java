package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarthealthPage {
	

@Given("User open the chrome browser and starhealth application")
public void user_open_the_chrome_browser_and_starhealth_application() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User  waits for the Welcome to Star Health pop-up and closes it")
public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("validates the Star Health home page title using a JUnit assertion")
public void validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("clicks on the Buy Now button")
public void clicks_on_the_buy_now_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User enters following details")
public void user_enters_following_details(DataTable datatable) {
	
	// fetches the entire data table
			List<Map<String, String>> userList	= datatable.asMaps(String.class, String.class);
		// Now iterate over each row of the data table and get the value based on the columnname(key)
			
			//| URL | FullName | PhNo | PIN | OptionPlan |
			for(Map<String, String> e : userList) {
				// System.out.println(e);
				/*
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[1]")).clear();
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[1]"))
				 * .sendKeys(e.get("URL")); driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[2]"))
				 * .sendKeys(e.get("FullName")); driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[3]"))
				 * .sendKeys(e.get("PhNo")); driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
				 * .sendKeys(e.get("PIN"));
				 * 
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
				 * driver.findElement(By.xpath(
				 * "(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
				 * .sendKeys(e.get("OptionPlan"));
				 */
			}
			

}

@Then("User clicks on I need health insurance from the drop-down menu and select plan")
public void user_clicks_on_i_need_health_insurance_from_the_drop_down_menu_and_select_plan() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User click on the Plan for My Family page")
public void user_click_on_the_plan_for_my_family_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Validate the user mobile number")
public void validate_the_user_mobile_number() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User clicks on the Star Health logo")
public void user_clicks_on_the_star_health_logo() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Close all the browsers")
public void close_all_the_browsers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
