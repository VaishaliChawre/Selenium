package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3 
{

	public static void main(String[]args) throws InterruptedException
	{
		String s="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s);
		
		WebDriver w=new ChromeDriver();
		
		w.navigate().to("https://www.flipkart.com/");
		
		w.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

		Thread.sleep(2000);
		
		w.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobiles");
		
		WebElement click =w.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		Actions a=new Actions(w);
		Thread.sleep(2000);
		a.moveToElement(click).click().build().perform();
	}
}
