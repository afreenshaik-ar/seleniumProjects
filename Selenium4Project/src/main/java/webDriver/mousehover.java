package webDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub\
		//String filepath="C:\\Users\\afree\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", filepath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmaillink=driver.findElement(By.linkText("Gmail"));
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.contextClick(gmaillink).build().perform();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);

	}

}
