package qaclickacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OneCognizantLogin {
	@Parameters({"id", "pass"})
	@Test
	public void login(String userid, String password)
	{
		
		System.out.println("Loging to one Cognizant");
		WebDriver dri=new ChromeDriver();
		dri.get("https://onecognizant.cognizant.com");
		dri.findElement(By.xpath("//input[@id='username']")).sendKeys(userid);
		dri.findElement(By.xpath("//input[@id='PasswordInternal']")).sendKeys(password);
		dri.findElement(By.xpath("//input[@id='Log_On1']")).click();
		dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("login Successfull");
		//dri.findElement(By.xpath("//input[@id='txtPlatformBarSearch']")).sendKeys("timesheet");
		//dri.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//System.out.println("Hello World6");
		//dri.findElement(By.xpath("//input[@id='btnsearch']")).click();	
	}
}
