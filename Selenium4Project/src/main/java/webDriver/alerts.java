package webDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\afree\\OneDrive\\Desktop\\Selenium Class\\t.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("prompt")).click();
		Alert popup=driver.switchTo().alert();
		Thread.sleep(2000);
		popup.sendKeys("Afreen");
		popup.accept();
//		popup.dismiss();
		System.out.println(driver.findElement(By.id("promptdemo")).getText());
		driver.close();
		

	}

}
