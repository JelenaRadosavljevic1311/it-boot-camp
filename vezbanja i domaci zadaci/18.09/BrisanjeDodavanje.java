package Domaci2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrisanjeDodavanje {
    public static void main(String[] args) throws InterruptedException {
        //Na stranici https://demoqa.com/webtables :
        //- obrisati 2 od 3 postojece tabele
        //- preostalu tabelu editovati sa random parametrima
        //- napraviti jednu tabelu sa svojim random parametrima

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/webtables");


        WebElement prviRed = wd.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) > div.rt-tr.-odd"));
        prviRed.click();
        Thread.sleep(1000);
        WebElement prviObrisi = wd.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(1) div.rt-tr.-odd div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)"));
        prviObrisi.click();

        WebElement drugiRed = wd.findElement(By.xpath("//div[@class='rt-tr -even']"));
        drugiRed.click();
        Thread.sleep(1000);
        WebElement drugiObrisi = wd.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(2) div.rt-tr.-even div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)"));
        drugiObrisi.click();

        WebElement dodaj = wd.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        dodaj.click();

        WebElement inputIme = wd.findElement(By.xpath("//input[@id='firstName']"));
        inputIme.sendKeys("Jelena");

        WebElement inputPrezime = wd.findElement(By.xpath("//input[@id='lastName']"));
        inputPrezime.sendKeys("Radosavljevic");

        WebElement inputEmail = wd.findElement(By.xpath("//input[@id='userEmail']"));
        inputEmail.sendKeys("jelena@gmail.com");

        WebElement inputGodine = wd.findElement(By.xpath("//input[@id='age']"));
        inputGodine.sendKeys("32");

        WebElement inputPlata = wd.findElement(By.xpath("//input[@id='salary']"));
        inputPlata.sendKeys("900");

        WebElement inputDepartman = wd.findElement(By.xpath("//input[@id='department']"));
        inputDepartman.sendKeys("QA");

        WebElement proslediPodatak = wd.findElement(By.xpath("//button[@id='submit']"));
        proslediPodatak.click();

    }
}
