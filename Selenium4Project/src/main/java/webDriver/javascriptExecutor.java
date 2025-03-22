package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("history.go(0)");
//		String apttl=js.executeScript("return document.title", args).toString();
//		System.out.println(apttl);
//		js.executeScript("window.scrollBy(0,2000)");
		WebElement link=driver.findElement(By.partialLinkText("So Gautam Gambhir Can Smile!"));
		js.executeScript("arguments[0].scrollIntoView(true)",link);

	}

}
