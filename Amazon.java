package org.task1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Jayashree java\\NewProject\\driver\\chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.amazon.in/");
WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
searchbox.sendKeys("iphone",Keys.ENTER);
WebElement iphoneclick = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus 128GB Purple'][1]"));
iphoneclick.click();
//get prtwindow
String prtwin = driver.getWindowHandle();
System.out.println(prtwin);

	Set<String> allWin = driver.getWindowHandles();
	System.out.println(allWin);
	
for (String string : allWin) {
	if (!(prtwin.equals(string))) {
		driver.switchTo().window(string);
		System.out.println(string);
	}
	
}
		WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
		addcart.click();
		
	}
	


}
	
	