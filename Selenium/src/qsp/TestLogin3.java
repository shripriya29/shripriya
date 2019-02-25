package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		LoginPage c1=new LoginPage(driver);
		c1.setUserName("admin");
		c1.setPassword("manager");
		c1.loginBTN();
		
		c1.setUserName("abcd");
		c1.setPassword("xyz");
		c1.loginBTN();
		
	}

}
