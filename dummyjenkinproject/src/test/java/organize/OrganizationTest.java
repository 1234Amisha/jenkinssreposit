package organize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganizationTest {
	@Test
	public void OrganizationTest() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./programmm.properties");
		Properties p=new Properties();
		p.load(fis);
		String Url=p.getProperty("url");
		driver.get(Url);
		
		System.out.println(Url);
		System.out.println("jenkins");
		System.out.println("welcome");
		
	}

}
