package Domaci2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ObrnutiRedosled {
    public static void main(String[] args) throws InterruptedException {
        //Sortirati dugmice obrnutim redosledom sa stranice https://demoqa.com/sortable (iz opcije grid)
        String prvoDugmeByXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'One')]";
        String drugoDugmeByXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Two')]";
        String treceDugmeByXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Three')]";
        String cetvrtoDugmeByXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Four')]";
        String petoDugmeByXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Five')]";
        String sestoDugmeByXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Six')]";
        String sedmoDugmeByXpath = "//div[contains(text(),'Seven')]";
        String osmoDugmeByXpath = "//div[contains(text(),'Eight')]";
        String devetoDugmeByXpath = "//div[contains(text(),'Nine')]";


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/sortable");

        WebElement gridOpcija = wd.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        gridOpcija.click();

        WebElement prvoDugme = wd.findElement(By.xpath(prvoDugmeByXpath));
        WebElement drugoDugme = wd.findElement(By.xpath(drugoDugmeByXpath));
        WebElement treceDugme = wd.findElement(By.xpath(treceDugmeByXpath));
        WebElement cetvrtoDugme = wd.findElement(By.xpath(cetvrtoDugmeByXpath));
        WebElement petoDugme = wd.findElement(By.xpath(petoDugmeByXpath));
        WebElement sestoDugme = wd.findElement(By.xpath(sestoDugmeByXpath));
        WebElement sedmoDugme = wd.findElement(By.xpath(sedmoDugmeByXpath));
        WebElement osmoDugme = wd.findElement(By.xpath(osmoDugmeByXpath));
        WebElement devetoDugme = wd.findElement(By.xpath(devetoDugmeByXpath));

        Actions akcija = new Actions(wd);
        akcija.dragAndDrop(devetoDugme,prvoDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,drugoDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,treceDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,cetvrtoDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,petoDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,sestoDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,sedmoDugme).build().perform();
        Thread.sleep(500);
        akcija.dragAndDrop(devetoDugme,osmoDugme).build().perform();

    }
}
