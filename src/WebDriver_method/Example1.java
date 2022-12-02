package WebDriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{

	public static void main(String[]args) throws InterruptedException
	{
		String v="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", v);
		
		WebDriver s=new ChromeDriver();
		
		s.navigate().to("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiWwPG69fX6AhWUDisKHatxBM8YABAAGgJzZg&ohost=www.google.com&cid=CAESauD2B5qHxsQnm2uNOx9FVR8nT6ExmpbdSUBegYI-0JKeEciH6RKGylbEB-SLpOcX2bKF3VsXFpEKm4gDSPHu7ktsiixjN7wZYjlr6Oo_QGJebXvv-7BzNFFHRrJyygv7oKePuTjXyXyxL60&sig=AOD64_1WB1O3BMpryQiGHqRxq5rXrpgYqQ&q&adurl&ved=2ahUKEwiH8Oi69fX6AhViXHwKHTrnDLQQ0Qx6BAgJEAE");
		Thread.sleep(2000);
	
		s.navigate().forward();
		Thread.sleep(2000);
		s.navigate().back();
		Thread.sleep(2000);
		s.navigate().refresh();
		
				
	}
}
