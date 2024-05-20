package SitePractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

/*Login to Site. Enter user name and Password. Click on Forget Passpord. Reset Password. Again Login and Welcome Page will Appear

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Opening the URL
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		//Provide username and password in textbox
		driver.findElement(By.id("inputUsername")).sendKeys("admin");	
		driver.findElement(By.name("inputPassword")).sendKeys("Hello");
		
		//click on checkbox
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		//click on Button
		driver.findElement(By.className("submit")).click();
		
		//Apply Wait if any item is not loaded 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		//Read Error Message from Login Page
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//System.out.println("Error");
		
		//click on Link on Error Message
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Forgot Your Password & Reset Password
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dhiru");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dhiru@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("897867678");
		//Click on Reset Button
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click(); 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); 
		
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 

		//Try to Login 
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Dhiru"); 
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); 

		//click on checkbox 
		driver.findElement(By.id("chkboxOne")).click(); 
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); 
		
		
		
	}

}
