package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 
{

	public static void main(String[]args)
	{
		
		String s="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",s);
		
		WebDriver w=new ChromeDriver();
		
		w.get(" http://www.amazon.in/");
		WebElement  b= w.findElement(By.xpath("(//span[@class=\"nav-icon nav-arrow\"])[1]"));
		
		Actions act=new Actions(w);
		
//		//move to element 
	act.moveToElement(b).perform();
//		act.click().perform();
		
		act.contextClick().perform();
		
		
	}
}
