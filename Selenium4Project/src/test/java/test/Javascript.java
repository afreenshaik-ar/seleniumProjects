package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://google.com");
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement button = driver.findElement(By.name("btnI"));
js.executeScript("arguments[0].click()", button);
js.executeScript("console.log('.. Hello World..')");

	}

}
