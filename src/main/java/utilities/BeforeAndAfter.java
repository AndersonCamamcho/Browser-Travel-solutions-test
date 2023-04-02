package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BeforeAndAfter {

    protected WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addExtensions(new File("C:\\Users\\A R E X\\IdeaProjects\\Browser Travel Solutions\\src\\main\\resources\\utilities\\cfhdojbkjhnklbpkdaibdccddilifddb-3.16.2-Crx4Chrome.com.crx"));

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){

        //driver.quit();
    }
}


