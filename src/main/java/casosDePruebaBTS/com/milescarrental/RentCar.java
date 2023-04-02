package casosDePruebaBTS.com.milescarrental;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BeforeAndAfter;


public class RentCar extends BeforeAndAfter {

    @Test
    public void ChooseLocator () {
        Actions actions = new Actions(driver);

       // a. Open page
       driver.get("https://milescarrental.com");

       //b. Fill information: Location: find Florida and select Airport Key Marathon, select pick up a next month and same day, select drop off 6 days next();
       WebElement locator = driver.findElement(By.xpath("(//input[@data-target='.modal-location'])[1]"));
       locator.clear();
       actions.moveToElement(locator).click().perform();
       locator.sendKeys("Florida");
       locator.sendKeys(Keys.ENTER);
       driver.findElement(By.xpath("//span[contains(text(),'Aeropuerto de Florida Keys Marathon, Marathon, Flo')]")).click();
       driver.findElement(By.xpath("(//input[@placeholder='dd/mm/yy'])[1]")).click();
       driver.findElement(By.xpath("(//div[text()='1'])[2]")).click();
       driver.findElement(By.xpath("(//div[text()='7'])[1]")).click();

        //c. Click Search
       driver.findElement(By.xpath("(//span[@data-text='BUSCAR TU CARRO']//i)[1]")).click();


        //d. Select second card (supongo que se refiere a car)
       driver.findElement(By.xpath("(//button[text()='RESERVAR AHORA'])[2]")).click();


        //e. Complete driver information
       WebElement setName = driver.findElement(By.xpath("//input[@id='inpName']"));
       setName.sendKeys("Anderson Camacho");
       WebElement setPhoneNumber = driver.findElement(By.xpath("//input[@id='phoneCustom']"));
       setPhoneNumber.sendKeys("3016206743");
       WebElement setEmail = driver.findElement(By.xpath("//input[@id='inpEmail']"));
       setEmail.sendKeys("arex2407@gmail.com");


        //f. Click next
       driver.findElement(By.xpath("//span[text()='Siguiente']")).click();




    }
}
