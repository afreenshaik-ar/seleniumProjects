package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String originaldriver =  driver.getWindowHandle();
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageFrame");
		WebElement element = driver.findElement(By.linkText("Action"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		//driver.findElement(By.linkText("Alert")).click();
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		
		Dimension size= driver.manage().window().getSize();
		
		
		driver.manage().window().setSize(new Dimension(800,600));
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point position=driver.manage().window().getPosition();
		
		driver.manage().window().setPosition(new Point(50, 40));
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		System.out.println("Width000"+size.getWidth());
		System.out.println("Height="+size.getHeight());
		
		Thread.sleep(2000);
		driver.close();
	}



}
