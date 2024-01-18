package Demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.foundit.in/");
		d.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();
		File f=new File("C:/Users/Jayesh%20Abhang/Documents/Jayesh%20Abhang%20Passport.pdf");
		String path=f.getAbsolutePath();
		d.findElement(By.id("file-upload")).sendKeys(path);
		
	}
	
	}

