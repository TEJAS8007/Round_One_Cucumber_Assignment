package Com.QA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Com.Utilities.WaitUtils;

public class SignUp_Page {


	WebDriver driver;

	By create_account_Button=By.xpath("//header//a[text()='Create an Account']");
	By fn=By.cssSelector("input#firstname");
	By ln=By.cssSelector("input#lastname");
	By email=By.cssSelector("input#email_address");
	By password=By.cssSelector("input#password");
	By confirm_Password=By.cssSelector("input#password-confirmation");
	By confirm_button=By.xpath("//*[@title='Create an Account']");

	public SignUp_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void verify_Title() {
		String expected_Title=driver.getTitle();
		System.out.println("Expected_Title : "+expected_Title);
	}

	public void click_on_Create_Account() {
		WaitUtils.WaitForElementToclick(create_account_Button, driver);
		WebElement clickonAccount=driver.findElement(create_account_Button);
		clickonAccount.click();
	}

	public void Enter_First_Name(String name) {

		WebElement fname=driver.findElement(fn);
		fname.sendKeys(name);
	}

	public void Enter_Last_Name(String name) {

		WebElement lname=driver.findElement(ln);
		lname.sendKeys(name);
	}
	
	public void Enter_Email(String em) {

		WebElement eml=driver.findElement(email);
		eml.sendKeys(em);
	}
	
	public void Enter_Password(String pass) {

		WebElement ps=driver.findElement(password);
		ps.sendKeys(pass);
	}
	
	public void Enter_Confirm_Password(String conpass) {

		WebElement ps=driver.findElement(confirm_Password);
		ps.sendKeys(conpass);
	}
	
	public void click_On_confirm_Button() {
	    try {
	        Thread.sleep(1000); // Let UI settle
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    try {
	        
	        WaitUtils.Ad_Blocker(driver);
	    } catch (Exception e) {
	        System.out.println("Ad not found or already handled.");
	    }

	    WaitUtils.WaitForElementToclick(confirm_button, driver);    
	    WebElement confirmbutton = driver.findElement(confirm_button);
	    
	    // ✅ using JavScriptExecutor to avoid element.clickInterceptException
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmbutton);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmbutton);
	}


}
