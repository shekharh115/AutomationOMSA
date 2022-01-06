package com.AutomationOMSA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snaps {
	public static void snaps(String doc) throws IOException{
		try{
    File scr = ((TakesScreenshot)Executors.driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(scr, new File("D:\\Users\\XY59005\\Desktop\\Himanshu\\SeleniumAdvance\\" +  doc + ".jpg"));
		} catch (Exception e){
			System.out.println("An exception occured ");
		}
}
	public static void ExplicitWait(By locator){
		WebDriverWait wait = new WebDriverWait(Executors.driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
}
