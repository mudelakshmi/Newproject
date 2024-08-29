package Selenium;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;


public class FindElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//findelement Scenario
		/*System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();
		//driver.close();*/
		
		
		//findelements Scenario
		/*System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement>  list=driver.findElements(By.name("name"));
		System.out.println(list.size());
		
		for (int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("id"));
		}
		*/
		
		
		/*textbox, click, pwd webelements	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html ");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement email= driver.findElement(By.id("email"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement pwd=driver.findElement(By.id("passwd"));
		email.sendKeys("lakshmimude@gmail.com");
		pwd.sendKeys("asdfghjkl");
		email.clear();
		email.sendKeys("abc@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement login=driver.findElement(By.id("SubmitLogin"));
		login.click();*/
		
		
		/* radio buttons and check box--used to toggle the element on/off
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.guru99.com/test/radio.html");
		WebElement radio1= driver.findElement(By.id("vfb-7-1"));
	    radio1.click();	
	    WebElement radio2= driver.findElement(By.id("vfb-7-2"));
	    radio2.click();	
	    WebElement cb1= driver.findElement(By.id("vfb-6-0"));
	    cb1.click();
	    WebElement cb2= driver.findElement(By.id("vfb-6-1"));
	    cb2.click();
	    WebElement cb3;
	    driver.findElement(By.id("vfb-6-2")).click();*/
	    
	    /* check box on/off
	    WebElement cb1= driver.findElement(By.id("vfb-6-0"));
	    for(int i=0; i<1;i++)
	    {
	    	cb1.click();
	    	System.out.println(cb1.isSelected());
	    }*/
	   
		/* how to click on image in selenium webdriver
		String baseurl="https://www.facebook.com/login/identify?ctx=recover";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }	
        */	
		
		
		/*String baseurl="https://www.facebook.com/login/identify?ctx=recover";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		WebElement image=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[1]/div/div[2]/div[1]"));
		image.getText();
		System.out.println(image);*/
		
		/*dropdown
		step1 - import the package 
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		//step-2 instantiate the drop down box as an object , select in selenium  webdriver
		Select country =new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("AUSTRALIA");
		//country.selectByValue("ARGENTINA");
		System.out.println(country);
		//System.out.println(country);*/
		
		/*actions classes
		//String baseurl="http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement email=driver.findElement(By.name("email"));
		Actions a=new Actions(driver);
		Action abc= a.moveToElement(email).click().keyDown(email,Keys.SHIFT).sendKeys(email,"hello").build();
		abc.perform();*/
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement email=driver.findElement(By.className("email"));*/
		
		/* upload a file in the selenium webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.name("uploadfile_0"));
		upload.sendKeys("C:\\Users\\laksh\\Downloads\\abc.html");
		WebElement checkbox= driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement subbtn= driver.findElement(By.id("submitbutton"));
		subbtn.click();*/
		
		/* downlaod of files can be done by using the wget command line  prg */
		
		/* handling the alert conditions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement Cuid=driver.findElement(By.name("cusid"));
		Cuid.sendKeys("12344556");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();	
		String msg =driver.switchTo().alert().getText();
		System.out.println(msg); 
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement Cuid=driver.findElement(By.name("cusid"));
		Cuid.sendKeys("12344556");
		Thread.sleep(5000);
		WebElement reset=driver.findElement(By.name("res"));
	    reset.click();
		//driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().accept();	
		//String msg =driver.switchTo().alert().getText();
		//System.out.println(msg); */
		
		/* handling multiple windows
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@href,\"../articles_popup.php\" )]")).click();
	   
		String mainWindow=driver.getWindowHandle();
	    
	    Set<String> s1=driver.getWindowHandles();
	    Iterator<String> i1=s1.iterator();
	    
	    while(i1.hasNext())
	    {
	    	String childWindow=i1.next();
	    	
	    	if(!mainWindow.equalsIgnoreCase(childWindow))
	    	{
	    		driver.switchTo().window(childWindow);
	    		driver.findElement(By.name("emailid")).sendKeys("lakshmi@gmail.com");
	    		driver.findElement(By.name("btnLogin")).submit();
	    		driver.close();
	    		   
	    	}
	    	    	
	    	}
	    
	  driver.switchTo().window(mainWindow); */
		
		
	    /*data to fetch no of coloums and rows in the web page
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		System.out.println("no of coloums" + col.size());
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("no of rows" + rows.size());
		driver.close();	*/
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		    //driver.close();*/
		
		
		
		/* Get all the values of a Dynamic Table
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\laksh\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/table.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//to locate table 
		WebElement table=driver.findElement( By.xpath("/html/body/table/tbody"));
		String msg=table.getText();
		System.out.println(msg);
		//to calculate no of rows in a table 
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		int rows_count=rows.size();
		System.out.println("the size of rows are:" + rows_count);
		//loop will execute last row of table
		for (int i=0; i<rows_count;i++)
		{
			//To locate columns(cells) of that specific row.
			List<WebElement> coloums= rows.get(i).findElements(By.tagName("td"));
			int coloums_count=coloums.size();
			System.out.println("No of cerlls in rows are: "+coloums_count);
			//loop will execute till last cell of sepecific row
			for(int j=0; j<coloums_count;j++)
			{
				String celtext=coloums.get(j).getText();
				System.out.println("Cell Value of row number " + i + " and column number " + j + " Is " + celtext);
			}
			
			System.out.println("-------------");*/
		
	
		
	
		}
		
	
		
		}


