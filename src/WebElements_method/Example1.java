package WebElements_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1
{
	
public static void main(String[]aregs) throws InterruptedException

{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver w=new ChromeDriver();

w.navigate().to(" https://www.facebook.com/");
Thread.sleep(2000);
//w.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vaishali kashyap");

//w.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("kashyap");
//w.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();

w.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();

Thread.sleep(2000);
   w.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("vaishu");
 
   w.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("kapur");
   
   Thread.sleep(2000);
   w.findElement(By.xpath(" (//input[@data-type=\"text\"])[3]")).sendKeys("8857069876");
   
   Thread.sleep(2000);
   
  boolean a=w.findElement(By.xpath("//div[text()='Sign Up']")).isDisplayed();
       
  System.out.println(a);
  Thread.sleep(2000);
 boolean s= w.findElement(By.xpath("//label[text()='Female']")).isSelected();
 System.out.println(s);
  
}
	
	
	
	
}
