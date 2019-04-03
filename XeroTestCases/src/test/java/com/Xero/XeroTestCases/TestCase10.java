package com.Xero.XeroTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase10 extends ReusuableMethods{

	public static void TestCase10a() throws InterruptedException {

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

		WebElement Profilename = driver.findElement(By.xpath("//button[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		Profilename.click();

		WebElement SubAndBill =driver.findElement(By.xpath("//a[contains(text(),'Subscriptions & Billing')]"));
		SubAndBill.click();
		Thread.sleep(3000);
		driver.close();

	}

}
