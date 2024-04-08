package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	@FindBy(name="firstname")
	WebElement txtFirstname;
	
	@FindBy(name="lastname")
	WebElement txtLastname;
	
	@FindBy(name="email")
	WebElement txtemail;
	
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	
	@FindBy(name="agree")
	WebElement chkPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	//Action Methods
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	public void setPrivayPolicy()
	{
		chkPolicy.click();
	}
	public void clickContinue()
	{
		//sol1
		btnContinue.click();
		
		//sol2
		//btnContinue.submit();
		
		//sol3
		/*Actions act = new Actions(driver);
		act.moveToElement(btnContinue).click().perform();
		//sol4
		btnContinue.sendKeys(Keys.RETURN);
		
		//sol5
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
		//Sol6
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnContinue); */
		
		
		
		
	}
	public String getConfirmationMsg()
	{
		try {
			return(msgConfirmation.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	
	
	
	
	
	
	

}
