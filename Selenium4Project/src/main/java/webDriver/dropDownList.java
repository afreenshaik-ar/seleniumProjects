package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("ate Ac")).click();
		WebElement lstcity= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select Day=new Select(lstcity);
		Day.selectByVisibleText("01");
		Thread.sleep(2000);
		Day.selectByIndex(6);
		Thread.sleep(2000);
		Day.selectByValue("21");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
