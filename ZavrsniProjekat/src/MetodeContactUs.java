import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MetodeContactUs {
    public static String subjectHeadingByCss= "#id_contact";
    public static String emailByPath = "//input[@id='email']";
    public static String orderReferenceByPath = "//input[@id='id_order']";
    public static String uploadImageByPath = "//input[@id='fileUpload']";
    public static String klikniSendButtonByPath = "//span[contains(text(),'Send')]";
    public static String tekstPorukeByPath = "//textarea[@id='message']";

    public static void izaberiSubject (WebDriver wd, String subject){
        Select categorySubject = new Select(wd.findElement(By.cssSelector(subjectHeadingByCss)));
        categorySubject.selectByVisibleText(subject);
    }
    public static WebElement dohvatiEmailBar(WebDriver wd){
        return wd.findElement(By.xpath(emailByPath));
    }
    public static void klikniEmailBar(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiEmailBar(wd)).perform();
        dohvatiEmailBar(wd).click();
    }

    public static void unesiEmail(WebDriver wd, String email) {
        dohvatiEmailBar(wd).sendKeys(email);
    }

    public static WebElement dohvatiOrderReference(WebDriver wd){
        return wd.findElement(By.xpath(orderReferenceByPath));
    }

    public static void klikniOrderReference(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiOrderReference(wd)).perform();
        dohvatiOrderReference(wd).click();
    }

    public static void unesiOrderReference(WebDriver wd, String rec) {
        dohvatiOrderReference(wd).sendKeys(rec);
    }
    public static void ubaciSliku(WebDriver wd){
        WebElement addFile = wd.findElement(By.xpath(uploadImageByPath));
        addFile.sendKeys("C:\\Users\\Jelena\\Desktop\\pexels.jpeg");
    }
    public static WebElement dohvatiSendDugme(WebDriver wd){
        return wd.findElement(By.xpath(klikniSendButtonByPath));
    }

    public static void klikniSendDugme(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiSendDugme(wd)).perform();
        dohvatiSendDugme(wd).click();
    }
    public static WebElement dohvatiDaUbacisTekstPoruke(WebDriver wd){
        return wd.findElement(By.xpath(tekstPorukeByPath));
    }

    public static void klikniDaUbacisTekstPoruke(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiDaUbacisTekstPoruke(wd)).perform();
        dohvatiDaUbacisTekstPoruke(wd).click();
    }

    public static void unesiTekstPoruke(WebDriver wd, String tekst) {
        dohvatiDaUbacisTekstPoruke(wd).sendKeys(tekst);
    }
}
