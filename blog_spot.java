package Automation_projects;

import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class blog_spot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.id("name")).sendKeys("Jayesh");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("jayeshabhang27@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("phone")).sendKeys("9819334491");
		Thread.sleep(2000);
		d.findElement(By.id("textarea")).sendKeys("Mumbai Maharashtra");
		Thread.sleep(2000);
		d.findElement(By.id("male")).click();
		Thread.sleep(2000);
		d.findElement(By.id("sunday")).click();
		Thread.sleep(2000);
		WebElement cntry=d.findElement(By.id("country"));
		Select sel=new Select(cntry);
		sel.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement dtp=d.findElement(By.id("datepicker"));
		dtp.sendKeys("01/14/2024");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[1]")).click();
		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/a[2]")).click();
		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input")).click();
		d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input")).click();
		d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input")).click();
		d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input")).click();
		d.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input")).click();
		d.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium (software)");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		Thread.sleep(2000);
//		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
		Thread.sleep(2000);
//		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
		Thread.sleep(2000);
		d.navigate().back();
		d.navigate().to("https://testautomationpractice.blogspot.com/");
		
		
//		ArrayList tabs=new ArrayList(d.getWindowHandles());
//		d.switchTo().window(tabs.get(0));
		d.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
		Alert a=d.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
		Alert b=d.switchTo().alert();
		System.out.println(b.getText());
		Thread.sleep(2000);
		b.accept();
		Thread.sleep(2000);
//		WebElement doubleclick=d.findElement(By.id("field1"));
//		Actions a1=new Actions(d);
//		Thread.sleep(2000);
//		a1.doubleClick(doubleclick).build().perform();
//		WebElement dclick=d.findElement(By.id("field2"));
//		Actions b1=new Actions(d);
//		Thread.sleep(2000);
//		b1.doubleClick(dclick).perform();
//		Thread.sleep(2000);
		WebElement dclick = d.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions d1=new Actions(d);
		Thread.sleep(2000);
		d1.doubleClick(dclick).perform();
//		d.switchTo().frame(0);
		Actions j=new Actions(d);
//		j.clickAndHold(d.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(d.findElement(By.xpath("//*[@id=\"droppable\"]"))).release(d.findElement(By.xpath("//*[@id=\"droppable\"]")).build().perform();
//		Action dragAndDrop=j.clickAndHold(d.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(d.findElement(By.xpath("//*[@id=\"droppable\"]"))).release(d.findElement(By.xpath("//*[@id=\"droppable\"]")).build();
//		dragAndDrop.perform();
		WebElement Source = d.findElement(By.id("draggable"));
		WebElement dest=d.findElement(By.id("droppable"));
//		Actions a2=new Actions(d);
		Thread.sleep(2000);
		j.dragAndDrop(Source, dest).perform();
		WebElement slider =d.findElement(By.id("slider"));
		int desider=70;
		Actions slid=new Actions(d);
		slid.dragAndDropBy(slider, desider,0 ).build().perform();
		
//		a2.dragAndDrop(d.findElement(By.id("draggable")),d.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(2000);
		d.switchTo().frame(0);
		d.findElement(By.name("RESULT_TextField-0")).sendKeys("Jayesh");
		Thread.sleep(1000);
//		d.switchTo().frame(0)
		d.findElement(By.xpath("//*[@id=\"q2\"]/table/tbody/tr[1]/td/label")).click();
		Thread.sleep(1000);
		WebElement datepic = d.findElement(By.name("RESULT_TextField-2"));
		Thread.sleep(2000);
		datepic.sendKeys("27/12/2000");
		d.findElement(By.cssSelector("span[class='icon_calendar']")).click();
		WebElement dropdown= d.findElement(By.id("RESULT_RadioButton-3"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Automation Engineer");
		d.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		WebElement rsz=d.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions act=new Actions(d);
		int xoffset=100;
		int ypffset=50;
		act.dragAndDropBy(rsz, 500, 400);
		act.clickAndHold(rsz).moveByOffset(100+rsz.getSize().getWidth(), 50+rsz.getSize().getHeight()).release().build().perform();
		Thread.sleep(2000);
		d.findElement(By.name("Submit")).click();
//		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,1000)");
		d.quit();
//		d.close();
		
		
	}

}
