package WebDriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5
{
public static void main(String[]args) throws InterruptedException
{
	String s="C:\\Users\\chawr\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", s);
	
	WebDriver a=new ChromeDriver();
	
	a.get(" https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjYs-u6-fX6AhVEBCsKHQWWA6kYABAAGgJzZg&ohost=www.google.com&cid=CAESauD2O0YR6KG2JHS-3NKjaV-w4fUucfvHAq667d6ty2kqgtLRDIR5-bqoYe3rLXgFfk1WEuc4i24u1Ec_v9TOEO48iaHkG9-qXHk8oX-QOj3pBnwwo0rn6w5nvXOFG21zuaMMMeJJp7Iz1wk&sig=AOD64_2ycFLKQic6qdgJkY4Q8_3LV7ayOw&q&adurl&ved=2ahUKEwjl6uO6-fX6AhVETnwKHfFaAtsQ0Qx6BAgJEAE");
	
	a.manage().window().maximize();
	Thread.sleep(2000);
	a.manage().window().minimize();
	
	a.quit();
	
	
	
	
}
}
