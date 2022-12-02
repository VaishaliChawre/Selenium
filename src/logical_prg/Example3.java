package logical_prg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Example3 
{

	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("file:///C:/Users/chawr/Desktop/selenium/html/multiple%20select%20list%20box.html");
		
		
		WebElement country= d.findElement(By.xpath("//select[@id=\"abc\"]"));
		
		Select s=new Select(country);
		
		Thread.sleep(3000);
		s.selectByIndex(0);
//		s.selectByValue("2");
		s.selectByVisibleText("shrilanka");
		
		List<WebElement> alloption = s.getAllSelectedOptions();
		for(WebElement w:alloption)
		{
			System.out.println(w.getText());
		}
		
		s.deselectByVisibleText("shrilanka");
		
		
		
		
		
	}
}
