package week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContactW4D2 {
	public static void main(String[] args) {
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']//following::img")).click();
		String firstwin = driver.getTitle();
		System.out.println("Title of the page : "+firstwin);
		
		Set<String> parentwin = driver.getWindowHandles();
		ArrayList<String> Handles = new ArrayList<String>(parentwin);
		driver.switchTo().window(Handles.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		

		driver.switchTo().window(Handles.get(0));
		//click to contact
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following::img")).click();
		
		Set<String> contactTo = driver.getWindowHandles();
		ArrayList<String> Handles2 = new ArrayList<String>(contactTo);
		driver.switchTo().window(Handles2.get(1));
		String secondwin = driver.getTitle();
		System.out.println("Title of the nextpage : "+secondwin);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='dontship2me']")).click();
		driver.switchTo().window(Handles.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert conformAlert=  driver.switchTo().alert();
		
		conformAlert.accept();
		String pTitle = driver.getTitle();
		System.out.println("Title of the page : "+pTitle);
		
		
	}
	}

		
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 	
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 
		 * 7. Click on Widget of From Contact
		 * 
		 * 8. Click on First Resulting Contact
		 * 
		 * 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page
		 */
	

