package MyMavenProject.MyMavenProjectPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsTestYahooLaunch {

    @Test
    public void verifyTitle() throws Exception {
    System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\Chrome\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();
	driver.get("https://www.yahoo.com");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	Dimension n = new Dimension(360,592);
	driver.manage().window().setSize(n);
	String pageTitle = driver.getTitle();
	
	Assert.assertEquals(pageTitle, "Yahoo");
	
	Thread.sleep(2000);
	driver.close();
	
	}
	}