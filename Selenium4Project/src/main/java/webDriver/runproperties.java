package webDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String filepath=System.getProperty("user.dir")+"\\src\\webDriver\\t.properties";
		FileInputStream fis=new FileInputStream(filepath);
		Properties p=new Properties();
		p.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		//https://mail.rediff.com/cgi-bin/login.cgi
		

	}

}
