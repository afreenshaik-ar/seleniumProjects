package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enterData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		//String filepath="C:\\Users\\afree\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", filepath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys("afreenshaik");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("pwd123");
		Thread.sleep(2000);
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
		

	}

}
