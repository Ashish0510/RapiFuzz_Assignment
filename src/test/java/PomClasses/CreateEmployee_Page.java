package PomClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.BaseClass;

public class CreateEmployee_Page extends BaseClass {
	WebDriver driver;

	public CreateEmployee_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[contains(text(),'Employee List' )])[2]")
	WebElement CreateTab;

	@FindBy(xpath = "//i[text()='add']")
	WebElement AddButton;

	@FindBy(id = "first-name-box")
	WebElement firstName;

	@FindBy(id = "middle-name-box")
	WebElement middleName;

	@FindBy(id = "last-name-box")
	WebElement lastName;

	@FindBy(xpath = "//i[text()='date_range']")
	WebElement dateRangeButton;

	@FindBy(xpath = "(//div[@class=\"filter-option-inner-inner\"])[1]")
	WebElement expandDropdownElement;

	public void FormFill() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Employee Management']")));

		CreateTab.click();
		Thread.sleep(2000);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[text()='add']")));
		AddButton.click();
		Thread.sleep(2000);

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Employee Full Name']")));
		Thread.sleep(5000);
		firstName.sendKeys("Ashish");
		Thread.sleep(2000);
		middleName.sendKeys("Kumar");
		Thread.sleep(2000);
		lastName.sendKeys("Srivastava");
		Thread.sleep(2000);
		dateRangeButton.click();
		Thread.sleep(8000);
		expandDropdownElement.click();
		Thread.sleep(5000);

		List<WebElement> elements1 = driver.findElements(By.xpath(" (//ul[@role=\"presentation\"])[1]/li/a"));
		for (WebElement ele : elements1) {
			// ele.getText();
			if (ele.getText().contains("February")) {
				Thread.sleep(2000);
				ele.click();

				break;

			}
			System.out.println("The month is clicked or selected ");
		}

		Thread.sleep(8000);
		System.out.println("The expand dropdown for year is now getting started ");
		// expandYearDropdownElement.click();

		driver.findElement(By.xpath("(//div[@class='filter-option-inner-inner'])[2]")).click();
		System.out.println("The expand drown for yesr has been clicked ");
		Thread.sleep(8000);
		List<WebElement> elements2 = driver.findElements(By.xpath("(//ul[@role=\"presentation\"])[2]/li/a"));

		for (WebElement ele2 : elements2) {

			if (ele2.getText().contains("2023")) {
				ele2.click();
				break;
			}
			System.out.println("The Year is clicked or selected ");
		}

		Thread.sleep(7000);
		List<WebElement> elements3 = driver.findElements(By.xpath("//table[@class='picker__table']//td/div"));

		for (WebElement ele3 : elements3) {
			if (ele3.getText().contains("10")) {
				ele3.click();
				break;
			}
		}

		System.out.println("date has been selected");
		Thread.sleep(10000);

		System.out.println("dropdown is getting started");

		driver.findElement(By.xpath("(//i[text()='arrow_drop_down'])[2]")).click();
		System.out.println("dropdown has been clicked");
		Thread.sleep(3000);
		System.out.println("Starting of find of  the india from dropdown");
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait5.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//ul[@class='dropdown-menu inner show'])[3]//span")));
		List<WebElement> elements4 = driver
				.findElements(By.xpath("(//ul[@class='dropdown-menu inner show'])[3]//span"));
		System.out.println(elements4.size());
		System.out.println("Dropdown locator is found now starting the loop");
		for (WebElement ele4 : elements4) {
			// Thread.sleep(3000);
			if (ele4.getText().contains("India Office")) {
				ele4.click();
				break;
			}
		}

		Thread.sleep(5000);

		WebElement radioButton = driver.findElement(By.xpath("//input[@id='hasLoginDetails']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Execute JavaScript code to click on the radio button
		js.executeScript("arguments[0].click();", radioButton);
		System.out.println("Radio button clicked");

		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Ashish");
		System.out.println("username is filled");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password@123");
		System.out.println("Password is filled ");

		Thread.sleep(2000);
		driver.findElement(By.id("confirmPassword")).sendKeys("Password@123");
		System.out.println("Confirm passsword is filled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[text()='arrow_drop_down'])[5]")).click();

		System.out.println("dropdown button iks clicked");

		Thread.sleep(5000);
		List<WebElement> elements5 = driver
				.findElements(By.xpath("(//ul[@class=\"dropdown-menu inner show\"])[4]//span"));

		System.out.println(elements5.size());

		for (WebElement ele5 : elements5) {
			if (ele5.getText().contains("Global Admin")) {
				ele5.click();
				break;
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.id("modal-save-button")).click();

		System.out.println("Next Button is clicked");

	}

}
