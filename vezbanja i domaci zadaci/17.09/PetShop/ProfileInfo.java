package PetShopKlaseSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProfileInfo {
    public static String languageByXpath = "//select[@name='account.languagePreference']";
    public static String categoryByXpath = "//select[@name='account.favouriteCategoryId']";
    public static String anableListByXpath ="//input[@name='account.listOption']";
    public static String bannerByXpath ="//input[@name='account.bannerOption']";
    public static String saveInfoByXpath ="//input[@name='newAccount']";


    public static void chooseLanguage (WebDriver wd,String language){
        Select languageL = new Select(wd.findElement(By.xpath(languageByXpath)));
        languageL.selectByVisibleText(language);
    }

    public static void chooseCategory (WebDriver wd, String category){
        Select categoryAnimals = new Select(wd.findElement(By.xpath(categoryByXpath)));
        categoryAnimals.selectByVisibleText(category);
    }

    public static void  enableList (WebDriver wd){
         WebElement enable = wd.findElement(By.xpath(anableListByXpath));
            enable.click();
            }

    public static void  enableBanner (WebDriver wd) {
        WebElement enable = wd.findElement(By.xpath(bannerByXpath));
        enable.click();
    }

    public static void  saveInformation (WebDriver wd) {
        WebElement saveI = wd.findElement(By.xpath(saveInfoByXpath));
        saveI.click();
    }

 }






