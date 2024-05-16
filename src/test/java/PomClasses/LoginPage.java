package PomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
WebDriver driver;

    public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement LoginButton;
	

	
	public void Login(String usernam,String password) throws InterruptedException {
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		
		username.click();
		username.sendKeys(usernam);
		
		Thread.sleep(2000);
		
		Password.click();
		Password.sendKeys(password);
		
		Thread.sleep(2000);
		
		LoginButton.click();
	}



}
