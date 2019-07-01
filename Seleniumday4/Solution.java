package Seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solution {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\B.L.MURALI\\eclipse-workspace\\Problem1\\lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement log=driver.findElement(By.xpath(//div[@id='article-wrapper"]'));
		String name=log.getText();
		System.out.println(name);
		
			
	}	
}
	