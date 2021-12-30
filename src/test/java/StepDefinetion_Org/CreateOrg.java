package StepDefinetion_Org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrg {

	WebDriver driver;

	@Given("launch the Browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("enter the url {string}")
	public void enter_the_url(String URL) {
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@Then("enter UserName {string}")
	public void enter_user_name(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@Then("enter Password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}

	@Then("click on Loginbtn")
	public void click_on_loginbtn() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("verify Home Page")
	public void verify_home_page() {
		Assert.assertEquals(" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM", driver.getTitle());
	}

	@Then("click on Organization Module")
	public void click_on_organization_module() {
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	}

	@Then("click on Plus Button")
	public void click_on_plus_button() {
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}

	@Then("enter Organization Name {string}")
	public void enter_organization_name(String OrgName) {
		driver.findElement(By.name("accountname")).sendKeys(OrgName);
	}

	@Then("enter Phone Number {string}")
	public void enter_phone_number(String PhNo) {
		driver.findElement(By.id("phone")).sendKeys(PhNo);
	}

//	@Then("click on Save Button")
//	public void click_on_save_button() {
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//	}

	@Then("click on signOut")
	public void click_on_sign_out() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"))).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

	@Then("close the Browser")
	public void close_the_browser() {
		driver.close();
	}
}
