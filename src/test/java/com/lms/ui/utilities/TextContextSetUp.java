package com.lms.ui.utilities;

import com.lms.ui.pageobjects.PageObjectManager;

//import com.lms.ui.stepdefinitions.PageObjectManager;

public class TextContextSetUp {

	public PageObjectManager pageObjManager;
	public Base base;
	
	public  TextContextSetUp() throws Throwable {
		base = new Base();
		pageObjManager = new PageObjectManager(base.WebDriverManager(), base.getConfigs());
	}


}
