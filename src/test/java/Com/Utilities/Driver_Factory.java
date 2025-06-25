package Com.Utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Factory {

	static WebDriver driver;
	
	public static WebDriver init_driver() {
		
		Properties pro=Property_Loader.init_Prop();
		
		if(pro.getProperty("browser").trim().equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(pro.getProperty("browser").trim().equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("Unable to launch Browser....Error");
		}
		
		
		return driver;
	}
}
