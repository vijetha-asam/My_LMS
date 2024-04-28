package com.lms.ui.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;


public class BatchPage {
	
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//button[@id='login']");
	By batchbtn = By.xpath("//button[@id='batch']");
	By managebatch=By.xpath("//mat-card-title[@class='mat-card-title']/div[1]");
	By batchName=By.xpath("//thead[@class='p-datatable-thead']/tr/th[2]");
	By batchDesc=By.xpath("//thead[@class='p-datatable-thead']/tr/th[3]");
	By batchStatus=By.xpath("//thead[@class='p-datatable-thead']/tr/th[4]");
	By noOfClass=By.xpath("//thead[@class='p-datatable-thead']/tr/th[5]");
	By programName=By.xpath("//thead[@class='p-datatable-thead']/tr/th[6]");
	By editDelete=By.xpath("//thead[@class='p-datatable-thead']/tr/th[7]");
	By deleteIcon=By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	By addBatch=By.xpath("//button[@id='new']");	
	By checkbox=By.xpath("//div[@role='checkbox']");
	By enable_pageBtn=By.xpath("//button[@class='p-paginator-next p-paginator-element p-link p-ripple']");
	By disable_pageBtn=By.xpath("//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']");
	
	
	
private WebDriver driver;
	
	public BatchPage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void loginPage() {
		driver.findElement(username).sendKeys("sdetorganizers@gmail.com");
		driver.findElement(password).sendKeys("UIHackathon@02");
		driver.findElement(login).click();
	}
	
	public void clickBatch() {
		driver.findElement(batchbtn).click();
		
	}
	public void batchURL() {
		//String expectedURL=driver.findElement(managebatch).getAttribute("herf");
		//String URL=driver.getCurrentUrl();
		boolean text=driver.getPageSource().contains("Manage Batch");
		
		if(text== true) {
		
		System.out.println("Manage Batch Present");
	}
		else {
			System.out.println("Manage Batch not Present");
		}
	}
		
     public void manageBatch() {
    	 
    	WebElement visible1= driver.findElement(batchbtn);
    	System.out.println(visible1.getText());
    	
     }
    	public void headersBatch() {
    		
    		WebElement present1= driver.findElement(batchName);
    		System.out.println(present1.getText());
    		
    		

    		WebElement present2= driver.findElement(batchDesc);
    		System.out.println(present2.getText());
    		
    		WebElement present3= driver.findElement(batchStatus);
    		System.out.println(present3.getText());
    		

    		WebElement present4= driver.findElement(noOfClass);
    		System.out.println(present4.getText());
    		
    		WebElement present5= driver.findElement(programName);
    		System.out.println(present5.getText());
    		
    		WebElement present6= driver.findElement(editDelete);
    		System.out.println(present6.getText());
    		
    			}
    	
    	public void deleteDisable() {
    		WebElement  ele= driver.findElement(deleteIcon);//.isEnabled();
    		if(ele.isDisplayed()) {
    			System.out.println("Delete Button Disable");
    		}
    		else {
    			System.out.println("Delete Button Enable");
    		}
    		}
    	public boolean aNewBatch() {
    		return driver.findElement(addBatch).isDisplayed();
    		
    	}
    	
    	public void paginationControl() {
    		
    		while(true) {
    		List<WebElement> enable=driver.findElements(enable_pageBtn);
    		List<WebElement> disable=driver.findElements(disable_pageBtn);
    		
    		if(enable.size()>0) {
    			enable.get(0).click();
    		}
    		else if (disable.size()>0) {
    			System.out.println("No more Pages");
    			break;
    		}
    		}
    		
    		
    		
    	}
    	
    	public void rowCheckButton() {
    		/*List<WebElement> checkboxEnable=driver.findElements(checkbox);
   		 String nextButtonClassName=driver.findElement(enable_pageBtn).getAttribute("class");
   		
   		while(!nextButtonClassName.contains("disable")) {
   			
   driver.findElement(enable_pageBtn).click();
   			for(int i=1; i<checkboxEnable.size(); i++) {
   				if(checkboxEnable.get(i).isDisplayed() && checkboxEnable.get(i).isEnabled()) {
   					checkboxEnable.get(i).click();
   					checkboxEnable.get(i).click();
   				}
   				nextButtonClassName=driver.findElement(enable_pageBtn).getAttribute("class");
   			
   		}
    	}*/
    		List<WebElement> checkboxEnable=driver.findElements(checkbox);
    		while(true) {
        		List<WebElement> enable=driver.findElements(enable_pageBtn);
        		List<WebElement> disable=driver.findElements(disable_pageBtn);
        		
        		driver.findElement(enable_pageBtn).click();
       			for(int i=1; i<checkboxEnable.size(); i++) {
       				if(checkboxEnable.get(i).isDisplayed() && checkboxEnable.get(i).isEnabled()) {
       					checkboxEnable.get(i).click();
       					checkboxEnable.get(i).click();
       				}
        		
        		if(enable.size()>0) {
        			enable.get(0).click();
        		}
        		else if (disable.size()>0) {
        			System.out.println("No more Pages");
        			break;
        		}
        		}
    		
    	}
    	
}
}
    	 
     

