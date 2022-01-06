package com.AutomationOMSA;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.ous.jtoml.ParseException;

public class Executors {
	
	public static WebDriver driver;
	public static ScenarioPro1 sp = new ScenarioPro1();
	public static String path = "D:\\Users\\XY59005\\chromedriver.exe";
	public static JSONOR JOr = new JSONOR();
	public static Snaps snap = new Snaps();
	public static dataClass dp=new dataClass();
	//public static Select sl =new Select((WebElement) driver);
	

	public static void main(String[] args) throws InterruptedException, ParseException, IOException, org.json.simple.parser.ParseException {
		// TODO Auto-generated method stub
         Launch();
         Login();
         searchCustomer();
         Close();
         ScenarioPro1.main(args);
		
		
         
	}
	
	public static void Launch() throws InterruptedException, IOException{
		 System.setProperty("webdriver.chrome.driver", path);
         driver = new ChromeDriver();
         driver.get("https://secure.advisorweb.snist.oldmutual.co.za.dev/adviser-workbench/landing");
        driver.manage().window().maximize();
         Thread.sleep(12000);
         Snaps.snaps("Launch");
        
	}
	
	public static void Login() throws ParseException, IOException, org.json.simple.parser.ParseException, InterruptedException{
		String A = JOr.LoginOR_Username();
		String B = JOr.LoginOR_Password();
		String C = JOr.LoginOR_Login();
		String D = JOr.LoginOR_StandaloneQuote();
		String E = JOr.LoginOR_CreateNewQuote();
		String F = JOr.LoginOR_Investment();
		String G = JOr.LoginOR_Nextt();
		String IMED = dp.dataSheet(1,0);
		String Pass = dp.dataSheet(1, 1);
		driver.findElement(By.xpath(A)).sendKeys(IMED);
		Snaps.snaps("IMED");
		driver.findElement(By.xpath(B)).sendKeys(Pass);
		 Snaps.snaps("Password");
		driver.findElement(By.xpath(C)).click();
		//System.out.println(A + B + C);
		Thread.sleep(15000);
		Snaps.snaps("Login");
		driver.findElement(By.xpath(D)).click();
		 Snaps.snaps("Login1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(E)).click();
		 Snaps.snaps("Login2");
		Thread.sleep(5000);
		driver.findElement(By.xpath(F)).click();
		 Snaps.snaps("Login3");
		Thread.sleep(5000);
		driver.findElement(By.xpath(G)).click();
		 Snaps.snaps("Login4");
		Thread.sleep(5000);
		
		
	}
	public static void searchCustomer() throws ParseException, IOException, org.json.simple.parser.ParseException, InterruptedException{
		String A = JOr.SearchCustomer_Individual();
		
		String B = JOr.SearchCustomer_FName();
		
		String C = JOr.SearchCustomer_SName();
		String D = JOr.SearchCustomer_IDNum();
		String E = JOr.SearchCustomer_DOB();
		String F = JOr.SearchCustomer_Search();
		String G = JOr.LoginOR_Nextt();
		String create = JOr.SearchCustomer_CreateCustomer();
		String Male = JOr.SearchCustomer_SelectMale();
		String Titl = JOr.SearchCustomer_Salutation();
		String Cont = JOr.SearchCustomer_Continue();
		String firstName = dp.dataSheet(1,2);
		String lastName = dp.dataSheet(1,3);
		String IdNum = dp.dataSheet(1,4);
		String Salute = dp.dataSheet(1,5);
	    driver.findElement(By.xpath(A)).click();
	    Snaps.snaps("Search");
	    Thread.sleep(2000);
		driver.findElement(By.xpath(B)).sendKeys(firstName);
		 Snaps.snaps("Fname");
		driver.findElement(By.xpath(C)).sendKeys(lastName);
		 Snaps.snaps("Sname");
		driver.findElement(By.xpath(D)).sendKeys(IdNum);
		Thread.sleep(1000);
		//driver.findElement(By.xpath(E)).sendKeys("01011985");
		Thread.sleep(5000);
		driver.findElement(By.xpath(F)).click();
		Thread.sleep(5000);
	    Snaps.snaps("SCust");
	   driver.findElement(By.xpath(create)).click();
	   Thread.sleep(5000);
	    Snaps.snaps("Create");
	   Select sl = new Select(driver.findElement(By.xpath(Titl)));
	   sl.selectByVisibleText(Salute);
	    Thread.sleep(5000);
	    Snaps.snaps("Salute");
	    driver.findElement(By.xpath(Male)).click();
	    Thread.sleep(5000);
	    Snaps.snaps("Male");
	  driver.findElement(By.xpath(G)).click();
		 Snaps.snaps("Next");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Cont)).click();
		 Snaps.snaps("Continue");
		Thread.sleep(5000);
		String TitlePage = driver.getTitle();
		System.out.println(TitlePage);
	    
	}
	
	
	
	public static void Close () throws InterruptedException, IOException{
		Thread.sleep(2000);
		Snaps.snaps("Close");
		driver.quit();
		
	}
	
	

}
