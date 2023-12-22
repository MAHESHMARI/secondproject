package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiontrail {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\marit\\eclipse-workspace\\actionsam[le\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Actions v =new Actions(driver);
		WebElement flip = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
//		flip.click();
		v.moveToElement(flip).perform();
	       
		}
	}


