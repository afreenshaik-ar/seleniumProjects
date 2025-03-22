package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\afree\\OneDrive\\Desktop\\Selenium Class\\t.html");
		driver.manage().window().maximize();
		String cellval;
		int row=driver.findElements(By.xpath("/html/body/p[1]/table[1]/tbody/tr[*]")).size();
		int col=driver.findElements(By.xpath("/html/body/p[1]/table[1]/tbody/tr[1]/th")).size();
		System.out.println("The rows in webtables are "+row);
		System.out.println("The cols in webtables are "+col);		
		for(int irow=1;irow<=row;irow++) {
			for(int icol=1;icol<=col;icol++) {
				cellval=driver.findElement(By.xpath("/html/body/p[1]/table[1]/tbody/tr["+irow+"]/td["+icol+"]")).getText();
				System.out.println(cellval);
			}
		}

	}

}
