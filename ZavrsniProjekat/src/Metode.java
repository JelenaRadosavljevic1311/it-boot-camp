import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Metode {
    public static String logoNaStraniciByXpath = "//img[@class='logo img-responsive']";
    public static String dugmeWomenByXpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    public static String summerDressesPadajucaListaByXpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    public static String summerDressUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String dugmeDressesByXpath= "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
    public static String summerDressesIzDugmetaByPath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    public static String haljinaDvaByCss = "body.category.category-11.category-summer-dresses.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(4) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.last-item-of-tablet-line.last-mobile-line:nth-child(2) div.product-container div.left-block div.product-image-container a.product_img_link > img.replace-2x.img-responsive";
    public static String kolicinaByXpath = "//i[@class='icon-plus']";
    public static String velicinaById = "group_1";
    public static String bojaHaljineById = "color_8";
    public static String ubaciUKorpuByXpath = "//span[contains(text(),'Add to cart')]";
    public static String zatvoriPopUpByXpath = "//span[@class='cross']";
    public static String korpaByXpath = "//b[contains(text(),'Cart')]";
    public static String searchBarByXpath = "//input[@id='search_query_top']";
    public static String potvrdiUnosByXpath = "//button[@name='submit_search']";
    public static String dugmeContactUsByXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";

    public static WebElement dugmeWomen(WebDriver wd) {
        return wd.findElement(By.xpath(dugmeWomenByXpath));
    }
    public static void prevlacenjeWomen(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dugmeWomen(wd)).perform();
    }

    public static WebElement summerDresses(WebDriver wd){
        return wd.findElement(By.xpath(summerDressesPadajucaListaByXpath));
    }
    public static void klikSummerDresses(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(summerDresses(wd)).perform();
        summerDresses(wd).click();
    }

    public static WebElement dugmeDresses(WebDriver wd) {
        return wd.findElement(By.xpath(dugmeDressesByXpath));
    }
    public static void prevlacenjeDugmetaDresses(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dugmeDresses(wd)).perform();
    }

    public static WebElement summerDressesIzDugmeta(WebDriver wd){
        return wd.findElement(By.xpath(summerDressesIzDugmetaByPath));
    }

    public static void klikSummerDressesIzDugmeta(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(summerDressesIzDugmeta(wd)).perform();
        summerDressesIzDugmeta(wd).click();
    }

    public static void logo(WebDriver wd) {
        WebElement element = wd.findElement(By.xpath(logoNaStraniciByXpath));
        element.click();
    }

    public static WebElement haljina2(WebDriver wd){
        return wd.findElement(By.cssSelector(haljinaDvaByCss));
    }

    public static void izaberiHaljinu(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(haljina2(wd)).perform();
        haljina2(wd).click();
    }
    public static void odaberiKolicinuHaljina(WebDriver wd){
        WebElement element = wd.findElement(By.xpath(kolicinaByXpath));
        element.click();
    }
    public static void izaberiVelicinu (WebDriver wd, String category){
        Select categoryVelicine = new Select(wd.findElement(By.id(velicinaById)));
        categoryVelicine.selectByVisibleText(category);
    }
    public static void izaberiBojuHaljine(WebDriver wd){
        WebElement element = wd.findElement(By.id(bojaHaljineById));
        element.click();
    }
    public static void ubaciSveUKorpu(WebDriver wd){
        WebElement element = wd.findElement(By.xpath(ubaciUKorpuByXpath));
        element.click();
    }

   public static void izadjiIzPopUpProzora(WebDriver wd) {
       WebElement element = wd.findElement(By.xpath(zatvoriPopUpByXpath));
       element.click();
   }
    public static void udjiUKorpu(WebDriver wd) {
        WebElement element = wd.findElement(By.xpath(korpaByXpath));
        element.click();
    }
    public static WebElement dohvatiSearchBar(WebDriver wd){
        return wd.findElement(By.xpath(searchBarByXpath));
    }

    public static void klikniSearchBar(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiSearchBar(wd)).perform();
        dohvatiSearchBar(wd).click();
    }

    public static void unesiUSearchBar(WebDriver wd, String rec) {
        dohvatiSearchBar(wd).sendKeys(rec);
    }

    public static void potvrdaUnosa(WebDriver wd) {
        WebElement element = wd.findElement(By.xpath(potvrdiUnosByXpath));
        element.click();
    }
    public static WebElement dohvatiDugmeContactUs(WebDriver wd){
        return wd.findElement(By.xpath(dugmeContactUsByXpath));
    }

    public static void klikniContactUs(WebDriver wd) {
        Actions akcije = new Actions(wd);
        akcije.moveToElement(dohvatiDugmeContactUs(wd)).perform();
        dohvatiDugmeContactUs(wd).click();
    }
}
