package casosDePruebaBTS.com.automationexercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BeforeAndAfter;
import java.util.List;


public class SearchProducts extends BeforeAndAfter {
    @Test
    public void testProducts() {


        //ii. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");


        //  iii. Verify that home page is visible successfully
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=' Home']"))
                .isDisplayed());

        //  iv. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[text()=' Products']")).click();



        //  v. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='title text-center']"))
                .isDisplayed());

        // vi. Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Jeans");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();


        // vii. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());

        // viii. Verify all the products related to search are visible
        List<WebElement>list = driver.findElements(By.xpath("//div[@class='product-overlay']"));
        Assert.assertFalse(list.isEmpty());
    }
}
