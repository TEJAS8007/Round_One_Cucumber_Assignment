package Com.QA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Com.Utilities.WaitUtils;

public class Login_Page {

	WebDriver driver;
	
	By Sign_in_Link=By.xpath("//header//li[@class='authorization-link']/a");
	By un=By.cssSelector("input#email");
	By ps=By.cssSelector("input[name='login[password]']");
	By Sign_in_Button=By.cssSelector("//*[@class='fieldset login']/div[4]/div/button");
	
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void click_on_Sign_Link() {
		WaitUtils.WaitForElementToclick(Sign_in_Button, driver);
		WebElement signIn=driver.findElement(Sign_in_Link);
		signIn.click();
	}
	
	public void enter_login_un(String username) {
		WebElement uname=driver.findElement(un);
		uname.sendKeys(username);
	}
	
	public void enter_login_ps(String password) {
		WebElement pass=driver.findElement(ps);
		pass.sendKeys(password);
	}
}
