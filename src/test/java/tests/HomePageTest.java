package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase
{
	@BeforeTest
	public void driver() throws IOException
	{
		LaunchDriver();
	}
	
	@Test
	public void HomePage() throws IOException
	{
		driver.findElement(By.className("gLFyf gsfi")).sendKeys("My First testcase");
		driver.findElement(By.className("gNO89b")).click();
	}
}
