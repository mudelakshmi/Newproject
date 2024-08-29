package com.datadriven;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Datadriven {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.formstack.com/signup/forms-teams");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// reading data from excel
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\laksh\\eclipse-workspace\\Newproject\\src\\main\\java\\com\\testdata\\testdata1.xlsx");
		int rowcount = reader.getRowCount("RegData");
		reader.addColumn("RegData", "status");

		
		
		//data driven approach(parameterization) = used to create data driven framework: driving the data from excels files
		for (int rownum = 2; rownum <= rowcount; rownum++) {
			System.out.println("------------------------------");
			String firstname = reader.getCellData("RegData", "Firstname", rownum);
			System.out.println(firstname);

			String Lastname = reader.getCellData("RegData", "Lastname", rownum);
			System.out.println(Lastname);

			String Workemail = reader.getCellData("RegData", "Workemail", rownum);
			System.out.println(Workemail);

			String password = reader.getCellData("RegData", "password", rownum);
			System.out.println(password);

			String organizationname = reader.getCellData("RegData", "organizationname", rownum);
			System.out.println(organizationname);

			String organizationsize = reader.getCellData("RegData", "organizationsize", rownum);
			System.out.println(organizationsize);

			String Industry = reader.getCellData("RegData", "Industry", rownum);
			System.out.println(Industry);

			driver.findElement(By.xpath("//*[@id='firstName']")).clear();
			
			driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstname);

			driver.findElement(By.xpath("//*[@id='lastName']")).clear();
			driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(Lastname);

			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Workemail);

			driver.findElement(By.xpath("//*[@id='password']")).clear();
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);

			driver.findElement(By.xpath("//*[@id='companyName']")).clear();
			driver.findElement(By.xpath("//*[@id='companyName']")).sendKeys(organizationname);

			Select orgsize = new Select(driver.findElement(By.name("numberOfEmployees")));
			orgsize.selectByVisibleText(organizationsize);

			Select indus = new Select(driver.findElement(By.name("industry")));
			indus.selectByVisibleText(Industry);
			
			//write data into excel file
			reader.setCellData("RegData", "status", rownum, "pass");

		}

	}
}