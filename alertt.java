package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertt {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert act=d.switchTo().alert();
		System.out.println(act.getText());
		act.accept();
	}

}
