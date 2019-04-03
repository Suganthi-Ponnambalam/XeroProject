package com.Xero.XeroTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase8 extends ReusuableMethods{

	public static void TestCase8a() throws InterruptedException 
	{
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement Login = FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Login");
		ClickButton(Login,"login");
		WebElement Uname = FindElement(By.xpath("//input[@id='email']"),"Username");
		EnterText(Uname,"suganthi.vpp@gmail.com","Username");
		WebElement Pwd = FindElement(By.xpath("//input[@id='password']"),"password");
		EnterText(Pwd,"xero2019","Password");
		WebElement Signin=FindElement(By.xpath("//button[@id='submitButton']"),"Signin");
		ClickButton(Signin,"Signin");
		//WebElement MyXero = driver.findElement(By.xpath("//h2[@class='org-name']//a[contains(text(),'My Xero')]"));
		//MyXero.click();
		WebElement OrganName=FindElement(By.xpath("//span[@class='xrh-appbutton--text']"),"OrganizationName");
		ClickButton(OrganName,"OrganizationName");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Find element by link text and store in variable "Element MyXero"        		
		WebElement MyXero = driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		//This will scroll the page till the element is found		
		js.executeScript("arguments[0].scrollIntoView();", MyXero);
		MyXero.click();
		//WebElement MyXeroDropDown =driver.findElement(By.xpath("//a[@class='selected myxero-link']"));
		//MyXeroDropDown.click();
		WebElement AddOrganization =driver.findElement(By.xpath("//a[@id='ext-gen1042']"));
		AddOrganization.click();
		WebElement NameofOrgan =driver.findElement(By.xpath("//input[@id='text-1022-inputEl']"));
		NameofOrgan.sendKeys("self");
		WebElement Timezone = driver.findElement(By.xpath("//div[@id='ext-gen1100']"));
		Timezone.click();
		Select s5 =new Select(Timezone);
		s5.selectByValue("x-boundlist-item x-boundlist-selected");


		WebElement WhatOrgando =driver.findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"));
		WhatOrgando.sendKeys("Accounting");

		WebElement previousSoftware = driver.findElement(By.xpath("//input[@id='combo-1029-inputEl']"));
		Select s3= new Select(previousSoftware);
		s3.selectByVisibleText("Zoho Books");

		WebElement StartTrial =driver.findElement(By.xpath("//a[@id='simplebutton-1035']"));
		StartTrial.click();
		Thread.sleep(3000);
		driver.close();


	}

	public static void TestCase8b() throws InterruptedException {

		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement Login = FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Login");
		ClickButton(Login,"login");
		WebElement Uname = FindElement(By.xpath("//input[@id='email']"),"Username");
		EnterText(Uname,"suganthi.vpp@gmail.com","Username");
		WebElement Pwd = FindElement(By.xpath("//input[@id='password']"),"password");
		EnterText(Pwd,"xero2019","Password");
		WebElement Signin=FindElement(By.xpath("//button[@id='submitButton']"),"Signin");
		ClickButton(Signin,"Signin");

		WebElement organdropdown1 = driver.findElement(By.xpath("//*[@class='xrh-icon xrh-appbutton--caret xrh-icon-svg']"));
		organdropdown1.click();
		Select s4 =new Select(organdropdown1);
		s4.selectByVisibleText("Add a new organization");

		WebElement Organname =driver.findElement(By.xpath("//input[@id='text-1022-inputEl']"));
		Organname.sendKeys("self1");

		WebElement Timezone1 = driver.findElement(By.xpath("//div[@id='ext-gen1100']"));
		Timezone1.click();
		Select s6 =new Select(Timezone1);
		s6.selectByValue("x-boundlist-item x-boundlist-selected");

		WebElement whatfor =driver.findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"));
		whatfor.sendKeys("Accounting");

		WebElement previousSoftware1 = driver.findElement(By.xpath("//input[@id='combo-1029-inputEl']"));
		Select s7= new Select(previousSoftware1);
		s7.selectByVisibleText("QuickBooks Desktop");

		WebElement buynow =driver.findElement(By.xpath("//a[@id='simplebutton-1036']"));
		buynow.click();

		WebElement Subscription= driver.findElement(By.xpath("//button[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		String Actual6 = Subscription.getText();
		Thread.sleep(3000);
		driver.close();


	}

}