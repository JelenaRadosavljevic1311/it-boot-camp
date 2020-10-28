package PetShopKlaseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountInfo {
    public static String firstNameByName ="account.firstName";
    public static String lastNameByName ="account.lastName";
    public static String emailByXpath ="//input[@name='account.email']";
    public static String phoneByXpath ="//input[@name='account.phone']";
    public static String addres1ByName ="account.address1";
    public static String addres2ByName ="account.address2";
    public static String cityXpath ="//input[@name='account.city']";
    public static String stateByXpath ="//input[@name='account.state']";
    public static String zipByXpath ="//input[@name='account.zip']";
    public static String countryByXpath ="//input[@name='account.country']";


    public static WebElement getFirstName(WebDriver wd){
        return wd.findElement(By.name(firstNameByName));
    }
    public static void setFirstName(WebDriver wd, String name){
        getFirstName(wd).sendKeys(name);
    }

    public static WebElement getLastName(WebDriver wd){
        return wd.findElement(By.name(lastNameByName));
    }
    public static void setLastName(WebDriver wd, String lastName){
        getLastName(wd).sendKeys(lastName);
    }
    public static WebElement getEmail(WebDriver wd){
        return wd.findElement(By.xpath(emailByXpath));
    }
    public static void setEmail(WebDriver wd, String email){
        getEmail(wd).sendKeys(email);
    }
    public static WebElement getPhone(WebDriver wd){
        return wd.findElement(By.xpath(phoneByXpath));
    }
    public static void setPhone(WebDriver wd, String phone){
        getPhone(wd).sendKeys(phone);
    }
    public static WebElement getAddress1(WebDriver wd){
        return wd.findElement(By.name(addres1ByName));
    }
    public static void setAddress1(WebDriver wd, String address){
        getAddress1(wd).sendKeys(address);
    }
    public static WebElement getAddress2(WebDriver wd){
        return wd.findElement(By.name(addres2ByName));
    }
    public static void setAddress2(WebDriver wd, String address) {
        getAddress2(wd).sendKeys(address);
    }
    public static WebElement getCity(WebDriver wd){
        return wd.findElement(By.xpath(cityXpath));
    }
    public static void setCity(WebDriver wd, String city) {
        getCity(wd).sendKeys(city);
    }
    public static WebElement getState(WebDriver wd){
        return wd.findElement(By.xpath(stateByXpath));
    }
    public static void setState(WebDriver wd, String state) {
        getState(wd).sendKeys(state);
    }
    public static WebElement getZip(WebDriver wd){
        return wd.findElement(By.xpath(zipByXpath));
    }
    public static void setZip(WebDriver wd, String zip) {
        getZip(wd).sendKeys(zip);
    }
    public static WebElement getCountry(WebDriver wd){
        return wd.findElement(By.xpath(countryByXpath));
    }
    public static void setCountry(WebDriver wd, String country) {
        getCountry(wd).sendKeys(country);
    }

}
