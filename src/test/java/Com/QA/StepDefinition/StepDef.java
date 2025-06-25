package Com.QA.StepDefinition;

import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import Com.QA.Pages.Login_Page;
import Com.QA.Pages.SignUp_Page;
import Com.Utilities.Driver_Factory;
import Com.Utilities.Property_Loader;
import Com.Utilities.WaitUtils;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;

public class StepDef {

	static WebDriver driver;
	static Properties pro;
	static SignUp_Page sign;
	static Login_Page login;
	static Logger log;
	static String Email;
	static String pass;
	static String fn;
	static String ln;
	static Faker faker;

	@BeforeAll
	public static void set_Up() {
		driver = Driver_Factory.init_driver();
		pro = Property_Loader.init_Prop();
		sign = new SignUp_Page(driver);
		login = new Login_Page(driver);
		log = LogManager.getLogger(StepDef.class);
		faker=new Faker();
		Email=faker.internet().emailAddress().toString();
		pass=faker.internet().password().toString();
		fn=faker.name().firstName().toString();
		ln=faker.name().lastName().toString();
		
		log.debug("--------------- Test Suite Started ----------------");
	}

	@AfterAll
	public static void tear_Down() {
		//driver.quit();
		log.debug("--------------- Test Suite Ended ----------------");
	}

	// === Step Definitions ===
	@Given("user should open application")
	public void user_should_open_application() {
		driver.get(pro.getProperty("url"));
		log.info("Application Launched Successfully....");
	}

	@When("user verify title of Application")
	public void user_verify_title_of_application() {
		sign.verify_Title();
		log.info("Title Verified Successfully....");
	}

	@When("user  click on creteAccount")
	public void user_click_on_crete_account() {
		sign.click_on_Create_Account();
		log.info("Clicked on create account successfully....");
		WaitUtils.Ad_Blocker(driver);
	}

	@When("user enter FirstName")
	public void user_enter_first_name() {
		sign.Enter_First_Name(fn);
		log.info("First Name entered successfully....");
	}

	@When("user enter lastName")
	public void user_enter_last_name() {
		sign.Enter_Last_Name(ln);
		log.info("Last Name entered successfully....");
	}

	@When("user enter email address")
	public void user_enter_email_address() {
		sign.Enter_Email(Email);
		log.info("Email entered successfully....");
	}

	@When("user enter password")
	public void user_enter_password() {
		sign.Enter_Password(pass);
		log.info("Password entered successfully....");
	}

	@When("user confirm entered password")
	public void user_confirm_entered_password() {
		sign.Enter_Confirm_Password(pass);
		log.info("Confirm Password entered successfully....");
	}

	@Then("user click on create Account button")
	public void user_click_on_create_account_button() {
		sign.click_On_confirm_Button();
		log.info("Clicked on Confirm Button....");
	}

	@Then("Account creation should be success")
	public void account_creation_should_be_success() {
		log.info("Account created successfully....");
	}

	@Given("user click on SignIn button")
	public void user_click_on_sign_in_button() {
		login.click_on_Sign_Link();
		log.info("Clicked on Sign In Button....");
	}

	@When("user enter login_email")
	public void user_enter_login_email() {
		login.enter_login_un(Email);
		log.info("Login email entered....");
	}

	@Then("user enter login_password")
	public void user_enter_login_password() {
		login.enter_login_ps(pass);
		log.info("Login password entered....");
	}

	@Then("login should be success")
	public void login_should_be_success() {
		login.click_on_Sign_Button();
		log.info("LoggedIn Done successfully....");
	}
}
