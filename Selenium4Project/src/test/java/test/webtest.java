package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				driver.get("https://google.com");
				driver.close();

	}

}
