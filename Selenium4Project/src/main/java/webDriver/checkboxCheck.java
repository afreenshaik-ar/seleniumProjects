package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub\
		//String filepath="C:\\Users\\afree\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", filepath);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement uid=driver.findElement(By.id("login1"));
		WebElement pwd=driver.findElement(By.id("password"));
		
		uid.sendKeys("afreenshaik");
		Thread.sleep(2000);
		pwd.sendKeys("pwd123");
		Thread.sleep(2000);
		WebElement rem=driver.findElement(By.id("remember"));
		System.out.println( rem.isSelected());
		if(rem.isSelected()==true) {
			rem.click();
			System.out.println( rem.isSelected());
		}
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
