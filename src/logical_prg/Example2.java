package logical_prg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		Thread.sleep(4000);
		
		WebElement year=d.findElement(By.xpath("//select[@title=\"Year\"]"));
		
		Select s=new Select(year);
		
		
		List<WebElement> option = s.getOptions();
		
		for(WebElement w:option)
		{
			System.out.println(w.getText());
			
		}
		Thread.sleep(3000);
		
		WebElement month = d.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Select a = new Select(month);
		//a.selectByIndex(0);
	//	a.selectByValue("3");
		
		a.selectByVisibleText("Aug");
		
		String  firstoption = a.getFirstSelectedOption().getText();
		System.out.println(firstoption);
		
		
	
	}
	

}
