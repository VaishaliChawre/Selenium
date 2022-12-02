package WebDriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6
{

	public static void main(String[]args) throws InterruptedException
	{
		
		String h="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", h);
		
		WebDriver s=new ChromeDriver();
		
		s.navigate().to("https://www.primevideo.com/");
		s.navigate().forward();
		Thread.sleep(2000);
		s.manage().window().maximize();
		s.close();
		
		
	}
	
	
}
