package cucumber.cucumberdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	@FindBy(how=How.ID,using="name")
	WebElement 	name;
	@FindBy(how=How.ID,using="email")
	WebElement 	email;
	@FindBy(how=How.ID,using="mobile")
	WebElement 	phone;
	@FindBy(how=How.ID,using="office")
	WebElement 	office;
	@FindBy(how=How.ID,using="subject")
	WebElement 	subject;
	@FindBy(how=How.ID,using="message")
	WebElement 	message;
	@FindBy(how=How.ID,using="submit")
	WebElement 	submit;
	@FindBy(how=How.XPATH,using="//a[@id='footer-home']")
	WebElement 	footerhome;
	@FindBy(how=How.XPATH,using="//a[@id='footer-search']")
	WebElement 	footersearch;
	@FindBy(how=How.XPATH,using="//a[@id='footer-contact-us']")
	WebElement 	footercotact;
	@FindBy(how=How.XPATH,using="//a[text()='Home']")
	WebElement 	headerhome;
	@FindBy(how=How.XPATH,using="//a[text()='Search']")
	WebElement 	headersearch;
	@FindBy(how=How.XPATH,using="//a[text()='Contact Us']")
	WebElement 	headercotact;
	
	
	WebElement error,valid;
	public HomePage()
	{
		System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://mock.agiletrailblazers.com/contact.html");
		PageFactory.initElements(driver, this);
	}
	
	public void fillAllData()
	{
		name.sendKeys("myname");
		email.sendKeys("myemail.email.com");
		phone.sendKeys("1234567893");
		office.sendKeys("my office");
		Select select=new Select(subject);
		select.selectByValue("Agile");
		message.sendKeys("sending my message");
	
	}
	public void fillMandatoryData()
	{
		name.sendKeys("myname");
		email.sendKeys("myemail.email.com");
		Select select=new Select(subject);
		select.selectByValue("Agile");
		message.sendKeys("sending my message");
	
	}
	public void skipMandatoryData()
	{
		name.sendKeys("myname");
		
	}
	public void clickSubmit()
	{
		submit.click();
	}
	
	public String getValidMessage()
	{
		valid=driver.findElement(By.id("success-message"));
		return valid.getText();
	}
	public String getErrorMessage()
	{
		error=driver.findElement(By.id("error-message"));
		return error.getText();
	}
	public void close()
	{
		driver.close();
	}
	
	public String validatefooterhome()
	{
		PageFactory.initElements(driver, this);
		footerhome.click();
		return driver.getCurrentUrl();
	}
	public String validatefootersearch()
	{
		PageFactory.initElements(driver, this);
		footersearch.click();
		return driver.getCurrentUrl();
	}
	public String validatefootercontact()
	{
		PageFactory.initElements(driver, this);
		footercotact.click();
		return driver.getCurrentUrl();
	}
	public String validateheaderhome()
	{
		PageFactory.initElements(driver, this);
		headerhome.click();
		return driver.getCurrentUrl();
	}
	public String validateheadersearch()
	{
		PageFactory.initElements(driver, this);
		headersearch.click();
		return driver.getCurrentUrl();
	}
	public String validateheadercontact()
	{
		PageFactory.initElements(driver, this);
		headercotact.click();
		return driver.getCurrentUrl();
	}
}
