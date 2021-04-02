package mtlPizzaTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtlPizzaSearchBar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/views/dashboard.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"mySearch\"]")).sendKeys("The Bros");
//		driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/input")).click();

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
