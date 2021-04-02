package mtlPizzaTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtlcontactForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/views/dashboard.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("i//*[@id=\"name\"]")).sendKeys("pawan");
		driver.findElement(By.id("//*[@id=\"email\"]")).sendKeys("pkp@gmail.com");
		driver.findElement(By.id("//*[@id=\"Phone-Number\"]")).sendKeys("4382254488");
		driver.findElement(By.id("//*[@id=\"message\"]")).sendKeys("helloTesting hello testing");

		driver.findElement(By.xpath("//*[@id=\"cf-button\"]")).click();


		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "Mtl-Pizza";
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
