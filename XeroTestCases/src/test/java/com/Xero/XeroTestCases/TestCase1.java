package com.Xero.XeroTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase1 extends ReusuableMethods{
	//public static void main(String[] args) throws InterruptedException {

	
	public static void TestCase1a() throws InterruptedException{
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
		Thread.sleep(3000);
		driver.close();
	}

	public static void TestCase1b() throws InterruptedException {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement Login = FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Login");
		ClickButton(Login,"login");
		WebElement Uname = FindElement(By.xpath("//input[@id='email']"),"Username");
		EnterText(Uname,"suganthi.vpp@gmail.com","Username");
		WebElement Pwd = FindElement(By.xpath("//input[@id='password']"),"password");
		EnterText(Pwd,"abc2019","Password");
		WebElement Signin=FindElement(By.xpath("//button[@id='submitButton']"),"Signin");
		ClickButton(Signin,"Signin");
		WebElement ErrorMsg = FindElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"),"ErrorMsg");
		ExpectedTextDisplay(ErrorMsg,"Your email or password is incorrect");
		Thread.sleep(3000);
		driver.close();
	}

	public static void TestCase1c() throws InterruptedException {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement Login = FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Login");
		ClickButton(Login,"login");
		WebElement Uname = FindElement(By.xpath("//input[@id='email']"),"Username");
		EnterText(Uname,"abc@gmail.com","Username");
		WebElement Pwd = FindElement(By.xpath("//input[@id='password']"),"password");
		EnterText(Pwd,"abc2019","Password");
		WebElement Signin=FindElement(By.xpath("//button[@id='submitButton']"),"Signin");
		ClickButton(Signin,"Signin");
		WebElement ErrorMsg = FindElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"),"ErrorMsg");
		ExpectedTextDisplay(ErrorMsg,"Your email or password is incorrect");
		Thread.sleep(3000);
		driver.close();
	}
	public static void TestCase1d() throws InterruptedException {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement Login = FindElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Login");
		ClickButton(Login,"login");
		WebElement Uname = FindElement(By.xpath("//input[@id='email']"),"Username");
		EnterText(Uname,"abc@gmail.com","Username");
		WebElement forgotpwd =FindElement(By.xpath("//a[contains(@class,'forgot-password-advert')]"),"Forgot password");
		ClickButton(forgotpwd,"Forgot Password");
		WebElement FPEmail=FindElement(By.xpath("//input[@id='UserName']"),"FPEmail");
		EnterText(FPEmail,"Suganthi.vpp@gmail.com","Username");
		WebElement SendLink = FindElement(By.xpath("//span[contains(@class,'text')]"),"SendLink");
		ClickButton(SendLink,"Sendlink");
		WebElement LinkMsg = FindElement(By.xpath("//p[contains(text(),'A link to reset your password has been sent to:')]"),"LinkMessage");
		ExpectedTextDisplay(LinkMsg,"Your email or password is incorrect");
		Thread.sleep(3000);
		driver.close();
	}
	

}
