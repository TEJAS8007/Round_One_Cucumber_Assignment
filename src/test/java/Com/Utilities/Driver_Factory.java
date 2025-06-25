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
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("user-data-dir=/path/to/new/profile");
		
		if(pro.getProperty("browser").trim().equals("chrome")) {
			driver=new ChromeDriver(options);
		}
		
		else if(pro.getProperty("browser").trim().equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("Unable to launch Browser....Error");
		}
		
		driver.get(pro.getProperty("url"));
		
		return driver;
	}
}
