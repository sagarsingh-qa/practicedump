package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase 
{
	
	public WebDriver driver = null;

@Test
public void LaunchDriver() throws IOException
{

	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Sagar\\eclipse-workspace\\practice\\src\\main\\java\\config\\config.properties");
	prop.load(fis);
	
	String url = prop.getProperty("testurl");
	
	//Launch the browser
	if(prop.getProperty("browser").contains("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(prop.getProperty("browser").contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar\\eclipse-workspace\\practice\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	//Open the Page
	driver.get(url);

	}

	
}
