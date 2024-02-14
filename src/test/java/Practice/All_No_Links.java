package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class All_No_Links {

	public static void main(String[] args) {
		
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>links=driver.findElements(By.xpath("//span[text()=\"All\"]"));
		 for(WebElement i:links)
		 {
			 System.out.println(i.getText());
		 }
		

	}

}
