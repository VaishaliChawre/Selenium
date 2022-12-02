package WebDriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3
{
	public static void main(String[] args)
	{
	String v="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", v);
	
	WebDriver w=new ChromeDriver();
	
	w.navigate().to(" https://translate.google.co.in/");
	
	w.navigate().forward();
	w.navigate().refresh();
	//w.navigate().back();
		
	}

}
