package Automation_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
//		JavascriptExecutor jay=(JavascriptExecutor)d;
//		jay.executeScript("window.scrollBy(0,500)");
		d.findElement(By.id("nav-link-accountList")).click();
		d.findElement(By.id("ap_email")).sendKeys("jayeshabhang27@gmail.com");
		d.findElement(By.id("continue")).click();
		d.findElement(By.id("ap_password")).sendKeys("Jayesh@27");
		d.findElement(By.id("signInSubmit")).click();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
		d.findElement(By.id("nav-search-submit-button")).click();
//		JavascriptExecutor jse=(JavascriptExecutor)d;
//		jse.executeScript("window.scrollBy(0,1000)");
		d.findElement(By.xpath("//span[text()='Apple iPhone 14 (256 GB) - (Product) RED']")).click();
//		String price = d.findElement(By.xpath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[3]/span[2]/span[2]")).getText();
//		System.out.println("price="+price);
//		d.close();
	}

}
