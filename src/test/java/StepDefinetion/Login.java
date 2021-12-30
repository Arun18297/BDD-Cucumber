package StepDefinetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;

	@Given("launch the browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("enter URL")
	public void enter_url() {
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	}

	@Then("enter username")
	public void enter_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("enter password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@Then("click on loginbtn")
	public void click_on_loginbtn() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("click on logoutbtn")
	public void click_on_logoutbtn() {
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

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

	@When("enter URL {string}")
	public void enter_url(String URL) {
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@Then("enter username {string}")
	public void enter_username(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@Then("enter password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}
}
