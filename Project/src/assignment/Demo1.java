package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.goodreads.com/");
driver.findElement(By.xpath("//a[.='Sign In']")).click();
driver.findElement(By.xpath("//button[@class='gr-button gr-button--dark gr-button--auth authPortalConnectButton authPortalSignInButton']")).click();
driver.findElement(By.id("ap_email")).sendKeys("nandinisv1998@gmail.com");     
driver.findElement(By.id("ap_password")).sendKeys("Nandu@123");
driver.findElement(By.id("signInSubmit")).click();
driver.findElement(By.xpath("//input[@placeholder='Search books']")).sendKeys("Think like a monk");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//span[.='Want to Read']")).click();
driver.findElement(By.xpath("//a[.='My Books']")).click();
driver.findElement(By.xpath("//img[@title='Remove from my books']")).click();
Alert a=driver.switchTo().alert();
a.accept();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='siteHeader__topLine gr-box gr-box--withShadow']/div[1]/div[3]/ul[1]/li[5]/div[1]/a[1]/span[1]/img")).click();
driver.findElement(By.xpath("//a[.='Sign out']")).click();
	}
}
