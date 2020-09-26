import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MetodeSocialNetworks {
    public static String facebookByXpath = "//li[@class='facebook']//a";
    public static String twitterByXpath = "//li[@class='twitter']//a";
    public static String youTubeByXpath = "//li[@class='youtube']//a";
    public static String googlePlusByXpath = "//li[@class='google-plus']//a";

    public static WebElement dohvatiDugmeFacebook(WebDriver wd){
        return wd.findElement(By.xpath(facebookByXpath));
    }
    public static void klikniDugmeFacebook(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiDugmeFacebook(wd)).perform();
        dohvatiDugmeFacebook(wd).click();
    }
    public static WebElement dohvatiDugmeTwitter(WebDriver wd){
        return wd.findElement(By.xpath(twitterByXpath));
    }
    public static void klikniDugmeTwitter(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiDugmeTwitter(wd)).perform();
        dohvatiDugmeTwitter(wd).click();
    }
    public static WebElement dohvatiDugmeYouTube(WebDriver wd){
        return wd.findElement(By.xpath(youTubeByXpath));
    }
    public static void klikniDugmeYouTube(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiDugmeYouTube(wd)).perform();
        dohvatiDugmeYouTube(wd).click();
    }

    public static WebElement dohvatiDugmeGooglePlus(WebDriver wd){
        return wd.findElement(By.xpath(googlePlusByXpath));
    }
    public static void klikniDugmeGooglePlus(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiDugmeGooglePlus(wd)).perform();
        dohvatiDugmeGooglePlus(wd).click();
    }
}
