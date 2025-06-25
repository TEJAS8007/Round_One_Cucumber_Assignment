package Com.Utilities;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	
	static WebDriverWait wait;
	
	public static void WaitForElementToclick(By locator,WebDriver driver) {
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		if(driver.findElement(locator).isEnabled()==true) {
			System.out.println(locator+" : is Visible✔✔");
		}
		else {
		    System.out.println(locator+" : is  not visible");	
		}
	}
	
	public static void Ad_Blocker(WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    
	    try {    
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe#aswift_5")));
	        
	        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe")));
	        
	        WebElement dismissBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#dismiss-button")));
	        dismissBtn.click();
	        
	        System.out.println("Ad popup closed successfully.");
	    } 
	    catch (Exception e) {
	        System.out.println("No ad popup found or already dismissed.");
	    } finally {
	        
	        driver.switchTo().defaultContent();
	    }
	}
	
	public static void takeScreenshot(String name,WebDriver driver) {
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    String fileName = "screenshots/" + name + "_" + timestamp + ".png";

	    try {
	        FileUtils.copyFile(src, new File(fileName));
	       
	    } catch (IOException e) {
	        System.out.println("Failure Capturing Screenshots......");
	    }
	}

}
