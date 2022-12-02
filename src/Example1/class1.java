package Example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		String v="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", v);
		
		WebDriver d=new ChromeDriver();
		
	 d.get(" https://www.flipkart.com/");
		
	 d.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 d.manage().window().minimize();
	 Thread.sleep(2000);
	 d.manage().window().maximize();
	 Thread.sleep(2000);
	 d.close();
	 
	 
	 
	}

}
