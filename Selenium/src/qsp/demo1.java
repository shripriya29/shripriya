package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	//driver.get(url);
	//driver.close();
}
}
