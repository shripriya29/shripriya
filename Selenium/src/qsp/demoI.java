package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class demoI 
{
static{
	//System.setProperty("webdriver.geco.driver","./driver.gecodriver.exe");
	System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
}
public static void main(String[] args) {
	File f=new File("Desktop");
	String absolutePath=f.getAbsolutePath();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/dell/Desktop/naukri.html");
	WebElement browserButton = driver.findElement(By.id("cv"));
	browserButton.sendKeys(absolutePath);
}
}
