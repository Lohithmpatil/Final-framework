package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class prcticeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edgedriver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com/");

	}

}
