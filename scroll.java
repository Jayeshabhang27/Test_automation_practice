package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demo.automationtesting.in/Alerts.html");
//		JavascriptExecutor jse=(JavascriptExecutor) d ;
//		jse.executeScript("window.scrollBy(100,100)");
//		new tab
		
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.youtube.com/watch?v=5_gi2-SZZWM");
		
//		new window
		
		d.switchTo().newWindow(WindowType.WINDOW);
		d.navigate().to("https://demo.automationtesting.in/Windows.html");
		d.quit();
		
	}

}
