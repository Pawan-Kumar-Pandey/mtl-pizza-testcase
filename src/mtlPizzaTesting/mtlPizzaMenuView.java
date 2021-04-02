package mtlPizzaTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtlPizzaMenuView {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/views/home.html");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.className("menuTest"));
	    account.click();

		driver.findElement(By.xpath("//*[@id=\"createPizza-btn\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"signaturePizza-btn\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"sandwiches-btn\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"salad-btn\"]")).click();
		Thread.sleep(1500);

		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "mtlPizza";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("test fail");
		}
		else
		{
			System.out.println("test Success");
		}
	}

}
