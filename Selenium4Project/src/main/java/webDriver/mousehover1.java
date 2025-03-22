package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub// TODO Auto-generated method stub
		// TODO Auto-generated method stub\
		//String filepath="C:\\Users\\afree\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", filepath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Actions mousemove= new Actions(driver);
		WebElement a=driver.findElement(By.linkText("Electronics"));
		mousemove.moveToElement(a).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Video Games")).click();
		driver.quit();

	}

}
