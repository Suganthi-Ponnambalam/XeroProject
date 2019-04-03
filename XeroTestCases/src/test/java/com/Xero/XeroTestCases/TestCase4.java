package com.Xero.XeroTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4 extends ReusuableMethods {
	
	public static void TestCase4a() throws InterruptedException{
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
		WebElement Homepage=FindElement(By.xpath("//div[@class='xui-page-title xdash-setupwidget__setup--header-title___1obD5']"),"Homepage");
		ExpectedTextDisplay(Homepage,"Welcome to Xero");
		WebElement Profilename=FindElement(By.xpath("//img[@class='xrh-avatar']"),"profilename");
		ClickButton(Profilename,"profilename");
		WebElement Logout=FindElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"),"Logout");
		ClickButton(Logout,"Logout");
		Thread.sleep(3000);
		driver.close();
	}	

}
