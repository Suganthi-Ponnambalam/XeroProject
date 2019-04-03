package com.Xero.XeroTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 extends ReusuableMethods{

	public static void TestCase3a() throws InterruptedException {
		//WebElement trialpage = driver.findElement(By.xpath("//span[@class='xrh-banner--text']"));
		//String Actual4 = trialpage.getText();
		//System.out.println(Actual4);

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

		WebElement Dashboard = FindElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"),"Dashboard");
		Dashboard.click();

		WebElement Accounting =FindElement(By.xpath("//button[contains(text(),'Accounting')]"),"Accounting");
		Accounting.click();
		Select s1 = new Select(Accounting);
		s1.selectByVisibleText("Reports");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement Contacts =FindElement(By.xpath("//button[contains(text(),'Contacts')]"),"Contacts");
		Contacts.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement organdropdown =FindElement(By.xpath("//*[@class='xrh-icon xrh-appbutton--caret xrh-icon-svg']"),"OrganisationDropDown");
		organdropdown.click();
		Select s2= new Select(organdropdown);
		s2.selectByVisibleText("Settings");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		s2.selectByVisibleText("Files");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement NewTab =FindElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"NewTab");
		NewTab.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement Notification =FindElement(By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"Notification");
		Notification.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement SearchTab =FindElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"SearchTab");
		SearchTab.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);


		WebElement HelpTab=FindElement(By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"HelpTab");
		HelpTab.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		Thread.sleep(3000);
		driver.close();


	}

}
