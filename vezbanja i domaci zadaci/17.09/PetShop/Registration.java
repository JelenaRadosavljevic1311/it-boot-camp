package PetShopKlaseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
    public static String userIdname ="username";
    public static String newPassXpath ="//input[@name='password']";
    public static String repeatPassXpath ="//input[@name='repeatedPassword']";

    public static WebElement getUserID(WebDriver wd){
        return wd.findElement(By.name(userIdname));
    }
    public static void setUserID(WebDriver wd, String id){
        getUserID(wd).sendKeys(id);
    }

    public static WebElement getUserPass(WebDriver wd){
        return wd.findElement(By.xpath(newPassXpath));
    }
    public static void setUserPass(WebDriver wd, String pass){
        getUserPass(wd).sendKeys(pass);
    }
    public static WebElement getUserPassRepeat(WebDriver wd){
        return wd.findElement(By.xpath(repeatPassXpath));
    }
    public static void setUserPassRepeat(WebDriver wd, String pass){
        getUserPassRepeat(wd).sendKeys(pass);
    }
}
