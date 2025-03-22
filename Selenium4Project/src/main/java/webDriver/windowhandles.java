package webDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\google.com");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Actions lnkrightclick=new Actions(driver);
		Thread.sleep(3000);
		lnkrightclick.contextClick(gmail).build().perform();
		Robot r=new Robot();
		int ln=1;
		for(int i=1;i<ln;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		Iterator<String> ite=allwindows.iterator();
		ite.next();
		driver.switchTo().window(ite.next());
		driver.findElement(By.id("For Work")).click();
		
		

	}

}
