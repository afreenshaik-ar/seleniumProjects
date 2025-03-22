package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	public static void main(String [] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String originaldriver =  driver.getWindowHandle();

		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://fb.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.switchTo().window(originaldriver);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
