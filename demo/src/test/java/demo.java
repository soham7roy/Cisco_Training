import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class demo {
	WebDriver driver;
	String s="https://www.google.com/";
  @Test
  public void f() {
	  driver.get(s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			driver=new ChromeDriver();
			
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
