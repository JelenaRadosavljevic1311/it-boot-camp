package PetShopKlaseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

    private static String registerNowXpath ="//a[contains(text(),'Register Now!')]";

public static void RegisterNow(WebDriver wd){
    WebElement element = wd.findElement(By.xpath(registerNowXpath));
    element.click();
 }
}
