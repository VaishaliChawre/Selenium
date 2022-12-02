package WebDriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 
{
	public static void main(String[]args)
	{
		String h="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",h);
		WebDriver s=new ChromeDriver();
		
		s.get("https://www.instagram.com/accounts/login/");
		
		s.manage().window().maximize();
		
		s.close();
	}

}
