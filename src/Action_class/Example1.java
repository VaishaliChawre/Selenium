package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1
{
public static void main(String[]args)
{
	String s="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", s);
	
	WebDriver w=new ChromeDriver();
	
  w.navigate().to(" https://www.facebook.com/");	
  
  WebElement create=  w.findElement(By.xpath(" (//a[@role=\"button\"])[2]"));
  
  
  //Action class to perform keybord nad mouse related operation.
	Actions a=new Actions(w);
	
	//Move to Create button 
	a.moveToElement(create).perform();
	
//	a.click(create).perform();
	
	
	
  
}
}