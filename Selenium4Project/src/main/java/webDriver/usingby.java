package webDriver;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usingby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		pom p=new pom();
//		By uid=p.username();
		
		entertext(driver,p.username,"affz");
		entertext(driver, p.password,"pswd");
		
//		driver.findElement(By.id("login1")).sendKeys("");
//		driver.findElement(By.id("password")).sendKeys("");
//		

	}
	public static void entertext(WebDriver driver,By appelement,String txt) {
		try {
			driver.findElement(appelement).sendKeys(txt);
		}
		catch(Exception e) {
			
		}
	}

}
