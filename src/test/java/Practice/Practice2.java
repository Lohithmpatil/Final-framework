package Practice;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class Practice2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("www.gggogle.com");
		List <WebElement> sugess=driver.findElements(By.xpath(""));
for(WebElement i: sugess)
{
	String s=i.getText();
	if(s.contains("amazon"))
	{
		i.click();
	}
	
}
driver.close();
}

}
