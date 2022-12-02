package WebDriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String v= "C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", v);
		
		WebDriver s=new ChromeDriver();
		
		
		s.navigate().to(" https://web.whatsapp.com/");
		Thread.sleep(2000);
		
		s.navigate().forward();
		Thread.sleep(2000);
		s.manage().window().maximize();
		
	}

}
