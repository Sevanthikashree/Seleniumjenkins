package onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.findElement(By.name("userName")).sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("mercury");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  }
}
