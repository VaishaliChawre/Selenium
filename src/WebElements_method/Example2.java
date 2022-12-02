package WebElements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String s="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s);
		
		WebDriver w=new ChromeDriver();
		
		w.navigate().to("https://www.instagram.com/accounts/login/");
	//	w.findElement(By.xpath("(//label[@class=\"_aa48\"])[2]")).sendKeys("vaishu");
		Thread.sleep(2000);
	w.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("vaishali");
	
	Thread.sleep(2000);
	
	String i=w.findElement(By.xpath("//p[@class=\"_ab25\"]")).getText();
		
	System.out.println(i);
	Thread.sleep(2000);
	
	boolean h=w.findElement(By.xpath("//i[@aria-label=\"Instagram\"]")).isDisplayed();
	
	System.out.println(h);
	}

}
