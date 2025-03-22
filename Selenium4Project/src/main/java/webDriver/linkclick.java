package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
//		WebElement link=driver.findElement(By.linkText("Sign in"));
//		link.click();
		driver.findElement(By.partialLinkText("ate Ac")).click();
		driver.quit();

	}

}
