package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException {
		
	// TODO Auto-generated method stub\
	//String filepath="C:\\Users\\afree\\chromedriver_win32\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", filepath);
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
//	Thread.sleep(3000);
//	WebElement drag= driver.findElement(By.id("draggable"));
//	WebElement drop= driver.findElement(By.id("droppable"));
//	Actions a= new Actions(driver);
//	a.dragAndDrop(drag,drop).build().perform();
	System.out.println("before entering method but in main");
	draganddrop(driver);
	System.out.println("after method call");
	wait(3);
	
}
	public static void draganddrop(WebDriver driver)
	{
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(drag,drop).build().perform();
		System.out.println("Iam in draganddrop method");
	}
	public static void wait(int time) throws InterruptedException
	{
		Thread.sleep(time*1000);
	}

}
