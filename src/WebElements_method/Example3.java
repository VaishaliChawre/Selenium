package WebElements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 
{
	public static void main(String[]args) throws InterruptedException
	{
		String v="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", v);
		WebDriver s=new ChromeDriver();
		
		s.get("http://www.amazon.in/");
		
		s.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("saadi");
		
		Thread.sleep(2000);
		
		s.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String a=s.findElement(By.xpath("//span[text()='Customer Review']")).getText();
		
		System.out.println(a);
		s.manage().window().maximize();
		
	
		boolean b =s.findElement(By.xpath("//a[contains(@class,\"nav-logo-link'')]")).isEnabled();

		System.out.println(b);
		
		boolean d=s.findElement(By.xpath("//a[contains(@class,\"nav-logo-link'')]")).isDisplayed();
		System.out.println(d);
		
		
		
	                           
		
	}

}
