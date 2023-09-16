package week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Amazon {
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		List<WebElement> mobilePriceList = driver.findElements(By.className("a-price-whole"));
	
		int listsize = mobilePriceList.size();
		System.out.println("List size"+listsize);
		
		List<Integer> list2 = new ArrayList<Integer>();
	
		
for (WebElement each : mobilePriceList) {
			
			String text = each.getText();
			String replacethecomma = text.replaceAll(",", "");
			int pricelist = Integer.parseInt(replacethecomma);	
			list2.add(pricelist);
			
		}
System.out.println(list2);
int sizeoflist = list2.size();
System.out.println(sizeoflist);
Integer firstmobile = list2.get(0);
System.out.println("first mobile"+firstmobile);

//WebElement customerRating = driver.findElement(By.xpath("//span[text()='12']"));
//System.out.println("Customer rating of first ptoduct:"+customerRating);

driver.findElement(By.xpath("//img[@class='s-image']")).click();
String pTitle = driver.getTitle();
System.out.println("Parent Title is : "+pTitle);

Set<String> windowHandles = driver.getWindowHandles();
ArrayList<String> Handles = new ArrayList<String>(windowHandles);
driver.switchTo().window(Handles.get(1));


driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();

driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
WebElement cartSubtotal = driver.findElement(By.xpath("//span[text()='Subtotal']"));
System.out.println("Verified cartSubtotal"+cartSubtotal);
driver.close();



//Collections.sort(list);
//System.out.println(list);		


}
}
