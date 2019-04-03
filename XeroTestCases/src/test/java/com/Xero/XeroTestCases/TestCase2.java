package com.Xero.XeroTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2 extends ReusuableMethods {

	public static void TestCase2a() {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement FreeTrial =driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrial.click();
		WebElement FN =driver.findElement(By.xpath("//input[@name='FirstName']"));
		FN.clear();
		FN.sendKeys("John");
		WebElement LN =driver.findElement(By.xpath("//input[@name='LastName']"));
		LN.clear();
		LN.sendKeys("Smith");
		WebElement EmailAdd =driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		EmailAdd.clear();
		EmailAdd.sendKeys("suganthi.vpp@gmail.com");
		WebElement PN =driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		PN.clear();
		PN.sendKeys("5103703100");
		WebElement Robotcatcha =driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		Robotcatcha.click();
		WebElement RadioButton =driver.findElement(By.xpath("//input[@value='true']"));
		RadioButton.click();
	}
	public static void TestCase2b() {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement getstarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		getstarted.click();
		WebElement EmptyFN = driver.findElement(By.xpath("//span[@id='signup-form-error-message-1']"));
		EmptyFN.getText();
		WebElement EmptyLN = driver.findElement(By.xpath("//span[@id='signup-form-error-message-2']"));
		EmptyLN.getText();
		WebElement EmptyEmailAdd = driver.findElement(By.xpath("//span[@id='signup-form-error-message-3']"));
		EmptyEmailAdd.getText();
		WebElement EmptyPN = driver.findElement(By.xpath("//span[@id='signup-form-error-message-4']"));
		EmptyPN.getText();
	}

	public static void TestCase2c() throws InterruptedException {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement FreeTrial =FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"FreeTrialLink");
		ClickButton(FreeTrial,"FreeTrialLink");
		WebElement termsofuse =FindElement(By.xpath("//a[contains(text(),'terms of use')]"),"TermsofUseLink");
		ClickButton(termsofuse,"TermsofUseLink");
		String TOUwindow = driver.getCurrentUrl();
		driver.switchTo().window(TOUwindow);
		System.out.println(TOUwindow);
		WebElement termsofusepage= FindElement(By.xpath("//h1[@class='title title-1']"),"termsofusepage");
		ExpectedTextDisplay(termsofusepage,"Terms of use");
		WebElement privacynotice =FindElement(By.xpath("//a[contains(text(),'privacy notice')]"),"privacynotice");
		ClickButton(privacynotice,"PrivacyNoticeLink");
		String PNwindow = driver.getCurrentUrl();
		driver.switchTo().window(PNwindow);
		System.out.println(PNwindow);
		WebElement privacynoticepage= FindElement(By.xpath("//h1[@class='title title-1']"),"privacynoticepage");
		ExpectedTextDisplay(privacynoticepage,"Privacy notice");
		Thread.sleep(3000);
		driver.close();
	}

	public static void TestCase2d() throws InterruptedException {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement FreeTrial =FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"FreeTrialLink");
		ClickButton(FreeTrial,"FreeTrialLink");
		WebElement offerdetails =FindElement(By.xpath("//a[contains(text(),'offer details')]"),"OfferDetailsLink");
		ClickButton(offerdetails,"OfferDetailsLink");
		String ODwindow = driver.getCurrentUrl();
		driver.switchTo().window(ODwindow);
		System.out.println(ODwindow);
		WebElement offerdetailspage= FindElement(By.xpath("//h1[@class='title title-1']"),"offerdetailspage");
		ExpectedTextDisplay(offerdetailspage,"Offer details");
		Thread.sleep(3000);
		driver.close();

	}
	
	public static void TestCase2e() throws InterruptedException {
		Initializedriver();
		Launch("https://www.xero.com/us/");
		WebElement FreeTrial =FindElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"),"FreeTrialLink");
		ClickButton(FreeTrial,"FreeTrialLink");
		WebElement Bookkeeper =FindElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"),"BookKeeperLink");
		ClickButton(Bookkeeper,"BookKeeperLink");
		String BKwindow = driver.getCurrentUrl();
		//driver.switchTo().window(BKwindow);
		System.out.println(BKwindow);
		WebElement Newstartpage= FindElement(By.xpath("//h2[@class='title title-2']"),"newstartpage");
		ExpectedTextDisplay(Newstartpage,"Let�s get started");
		Thread.sleep(3000);
		driver.close();

	}
}
