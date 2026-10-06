package flow_booking_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conform_book_details_page_automation {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demohospital.revalomni.com/");
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[@class='container py-4']//div[1]//div[1]//div[1]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[contains(text(),'Select')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//img")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[contains(text(),'Select')]")).click();
		
	}
}
