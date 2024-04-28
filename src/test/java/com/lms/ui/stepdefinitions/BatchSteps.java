package com.lms.ui.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lms.ui.pageobjects.BatchPage;
import com.lms.ui.utilities.Base;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchSteps {
	//WebDriver driver=new ChromeDriver();
	Base base=new Base();
	private BatchPage batchPage=new BatchPage(base.WebDriverManager());
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    
	    batchPage.loginPage();
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
		batchPage.clickBatch();
	    
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
	    
		batchPage.batchURL();
		
	}
		
	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
	    
	    batchPage.manageBatch();
		//Assert.assertEquals(batchPage.manageBatch(), true);
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    
	    batchPage.paginationControl();
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
	    
	    batchPage.headersBatch();
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	    
	    batchPage.deleteDisable();
	    
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    
		 batchPage.aNewBatch();
		 // Assert.assertEquals(batchPage.aNewBatch(),true);
		    
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	   
	  batchPage.rowCheckButton();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    
	    
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    
	    
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
	    
	    
	}



}



