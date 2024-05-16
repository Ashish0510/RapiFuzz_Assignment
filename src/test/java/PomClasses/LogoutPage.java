package PomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath="//div[text()='Employee Management']")
	WebElement headingElement;
	
	@FindBy(xpath="//span[text()=\"Log Out\"]")
	WebElement logoutElement;*/
	
	
	public void Logout() throws InterruptedException {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Employee Management']")));
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//span[text()='Log Out']"));
		element.click();
	}
	
	

}
