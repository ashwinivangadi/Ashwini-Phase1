package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
				WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys("iphone 12");
				
				WebElement clicksearch =driver.findElement(By.id("nav-search-submit-button"));
				clicksearch.click();
				
				List<WebElement> iphonename= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
				List<WebElement> iphoneprice= driver.findElements(By.xpath("//span[@class='a-price-whole']"));	
				System.out.println("Search Results "+iphonename.size());
				
				for(int count=0;count<iphonename.size();count++)
					
				 {
					if(iphonename.get(count).getText().toLowerCase().contains("iphone 12"))
							 {		
						System.out.println("Iphone Name :"+iphonename.get(count).getText() + "Iphone Price:"+iphoneprice.get(count).getText());
						
							 }
				
				 }
				
	

}
}

	

