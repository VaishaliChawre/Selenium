package logical_prg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Example1
{
	public static void main(String[]args) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver v=new ChromeDriver();
		
		v.get(" http://www.amazon.in/");
		
		File f=((TakesScreenshot)v).getScreenshotAs(OutputType.FILE);
		
		File s= new File("C:\\Users\\chawr\\Desktop\\selenium\\Screenshot\\v.jpg");
		
		FileHandler.copy(f, s);
		
		WebElement r =v.findElement(By.xpath("//span[@class=\"nav-icon nav-arrow\"][1]"));
		
		Actions a=new Actions(v);
				
		a.moveToElement(r).perform();
		
		WebElement w= v.findElement(By.xpath("//input[@type=\"text\"]"));
		
		a.click(w).sendKeys("mobiles").sendKeys(Keys.ENTER).perform();
		
		
		
		
	}
	
}
