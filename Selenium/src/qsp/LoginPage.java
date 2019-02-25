package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebElement unTB;
	final String p="pwd";
			@FindBy(name=p)
			private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']") 
	private WebElement loginBTN;

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	
	}
	public void loginBTN()
	{
		loginBTN.click();
	
}
}