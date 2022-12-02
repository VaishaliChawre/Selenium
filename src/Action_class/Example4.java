package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4 
{
	
	public static void main(String[]args)
	{
		String s="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", s);
		WebDriver d=new ChromeDriver();
		
	d.get("https://www.primevideo.com/");
	
	WebElement e =d.findElement(By.xpath("id=\"pv-nav-channels\""));
	
	Actions a=new Actions(d);
	
	a.moveToElement(e).click().build().perform();
	
	
	}
	
}
