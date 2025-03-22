package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\afree\\OneDrive\\Desktop\\Selenium Class\\t.html");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("/html/body/select"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("HTC");
		s.selectByVisibleText("Nokia");
		Thread.sleep(2000);
		s.deselectByVisibleText("HTC");

	}

}
