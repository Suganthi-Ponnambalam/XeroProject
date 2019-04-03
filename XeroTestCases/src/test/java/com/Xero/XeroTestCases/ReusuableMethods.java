package com.Xero.XeroTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReusuableMethods {
	
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;

	
	public static void StartReport(String path, String testname) {
		report = new ExtentReports(path);
		logger = report.startTest(testname);
	}

	public static void EndReport() {
		report.endTest(logger);
		report.flush();
	}
	
	public static void Initializedriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suganthi\\git\\Xero\\XeroTestCases\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void  Launch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logger.log(LogStatus.PASS,"TestStep is Pass -Chromebrowser navigates to given Url");
}
	
	public static  WebElement FindElement(By location, String objname) {
		WebElement obj = null;
		try {
			obj =driver.findElement(location);
			logger.log(LogStatus.PASS,"TestStep is Pass: "+objname+" is found on the page.");
		}
		catch(NoSuchElementException errmsg){
			System.out.println(errmsg);
			logger.log(LogStatus.FAIL,"TestStep is Fail: "+objname+" is not found on the page.");
		}
		return obj;
	}
	
	public static void ClickButton(WebElement obj, String objname) {
		if(obj.isDisplayed()) {
			obj.click();
			logger.log(LogStatus.INFO,"Teststep: "+objname+"is displayed and clicking action is performed");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		else {
			logger.log(LogStatus.INFO,"Teststep: "+objname+"is not displayed");
		}
	}
	public static void EnterText(WebElement obj, String textvalue, String objname ) {
		if(obj.isDisplayed()) {
			obj.clear();
			obj.sendKeys(textvalue);
			logger.log(LogStatus.PASS,"TestStep is Pass: "+textvalue+" is passed in "+objname+".");
		}
		else {
			logger.log(LogStatus.FAIL,"TestStep is Fail: "+objname+ "is not found and so no value is passed.");
		}

	}

	public static void ExpectedTextDisplay(WebElement obj, String Expect) {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		String Actual = obj.getText();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		System.out.println(Actual);
		logger.log(LogStatus.INFO, Actual);
		if(Actual.equalsIgnoreCase(Expect)) {
			System.out.println(" ExpectedTextDisplay TestStep is pass: Actualresult is same as ExpectedResult.");
			logger.log(LogStatus.PASS,"ExpectedTextDisplay TestCase is Pass: Actualresult is same as ExpectedResult.");
		}
		else {
			System.out.println("ExpectedTextDisplay TestStep is fail: Actualresult is not same as ExpectedResult");
			logger.log(LogStatus.FAIL,"ExpectedTextDisplay TestCase is Fail: Actualresult is not same as ExpectedResult");
		}
	}
   public static  String[][] ReadExceldata(String dt_path, String Sheetname ) throws IOException {
    	 //Get the Xl path.
    	//String dt_path = "C:\\Users\\suganthi\\eclipse-workspace\\XEROusingJava\\TestData\\TestData.xls";
		File xlfile= new File(dt_path);
		//Access the XLfile
		FileInputStream XLDoc = new FileInputStream(xlfile);
		//Access the workbook
		HSSFWorkbook wb = new HSSFWorkbook(XLDoc);
		//Access the sheet
		HSSFSheet sheet = wb.getSheet(Sheetname);
		int iRowCount = sheet.getLastRowNum()+1;
		int iColCount = sheet.getRow(0).getLastCellNum();
		String[][] XLdata = new String[iRowCount][iColCount];
		for(int i=0;i<iRowCount;i++)
		{
			for(int j=0;j<iColCount;j++) {
				XLdata[i][j]=sheet.getRow(i).getCell(i).getStringCellValue();
			}
		}
		return XLdata;
	}
		
	}

