package com.Xero.XeroTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase6 extends ReusuableMethods{

	public static void TestCase6a() throws InterruptedException {

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


		WebElement profilename =FindElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-8']"),"profilename");
		ClickButton(profilename,"profilename");


		WebElement EditProfile=FindElement(By.xpath("//span[@class='xrh-verticalmenuitem--subheading']"),"EditProfile");
		ClickButton(EditProfile,"EditProfile");

		WebElement ProfileSetting =FindElement(By.xpath("//h1[contains(text(),'Profile Settings')]"),"ProfileSetting");
		String Actual5 = ProfileSetting.getText();
		System.out.println(Actual5);

		WebElement uploadimage = FindElement(By.xpath("//span[@id='button-1041-btnInnerEl']"),"uploadimage");
		ClickButton(uploadimage,"uploadimage");
		WebElement UploadImageFrame =FindElement(By.xpath("//span[@id='ext-comp-1167_header_hd-textEl']"),"UploadimageFrame");
		driver.switchTo().frame(UploadImageFrame);
		WebElement browse = FindElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']"),"browseimage");
		ClickButton(browse,"browseimage");
		browse.sendKeys("C:\\Users\\suganthi\\Desktop\\download.jpg");

		WebElement Upload = FindElement(By.xpath("//div[@id='button-1178']"),"uploadbutton");
		ClickButton(Upload,"uploadbutton");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement Save =FindElement(By.xpath("//div[@id='button-1164-btnWrap']"),"save");
		ClickButton(Save,"save");
		Thread.sleep(3000);
		driver.close();


	}
}
