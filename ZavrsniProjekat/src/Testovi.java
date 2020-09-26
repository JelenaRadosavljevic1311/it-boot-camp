import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Testovi {

    @Test
    public void metodaTestSummerDressesUrlIzDugmetaWomen() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");

        Metode.dugmeWomen(wd);
        Metode.prevlacenjeWomen(wd);
        Metode.summerDresses(wd);
        Metode.klikSummerDresses(wd);
        Assert.assertEquals(wd.getCurrentUrl(), Metode.summerDressUrl);
        Thread.sleep(1000);
        wd.close();
    }

    @Test
    public void metodaTestSummerDressesUrlIzDugmetaDresses() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");

        Metode.dugmeDresses(wd);
        Metode.prevlacenjeDugmetaDresses(wd);
        Metode.summerDressesIzDugmeta(wd);
        Metode.klikSummerDressesIzDugmeta(wd);
        Assert.assertEquals(wd.getCurrentUrl(), Metode.summerDressUrl);
        Thread.sleep(1000);
        wd.close();
    }

    @Test
    public void metodaTestUporedjivanjeDvaUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd1 = new org.openqa.selenium.chrome.ChromeDriver();
        wd1.get("http://automationpractice.com/index.php");

        Metode.dugmeDresses(wd1);
        Metode.prevlacenjeDugmetaDresses(wd1);
        Metode.summerDressesIzDugmeta(wd1);
        Metode.klikSummerDressesIzDugmeta(wd1);

        org.openqa.selenium.WebDriver wd2 = new org.openqa.selenium.chrome.ChromeDriver();
        wd2.get("http://automationpractice.com/index.php");
        Metode.dugmeWomen(wd2);
        Metode.prevlacenjeWomen(wd2);
        Metode.summerDresses(wd2);
        Metode.klikSummerDresses(wd2);

        Assert.assertEquals(wd1.getCurrentUrl(), wd2.getCurrentUrl());
        Thread.sleep(1000);
        wd1.close();
        wd2.close();
    }

    @Test
    public void metodaStaJeUKorpi() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        Metode.dugmeDresses(wd);
        Metode.prevlacenjeDugmetaDresses(wd);
        Metode.summerDressesIzDugmeta(wd);
        Metode.klikSummerDressesIzDugmeta(wd);
        Thread.sleep(2000);
        wd.manage().window().fullscreen();
        Metode.haljina2(wd);
        Metode.izaberiHaljinu(wd);
        Metode.odaberiKolicinuHaljina(wd);
        Metode.izaberiVelicinu(wd, "M");
        Metode.izaberiBojuHaljine(wd);
        Metode.ubaciSveUKorpu(wd);
        Thread.sleep(3000);
        Metode.izadjiIzPopUpProzora(wd);
        Metode.udjiUKorpu(wd);
        WebElement opis = wd.findElement(By.xpath("//td[@class='cart_description']//a[contains(text(),'Color : White, Size : M')]"));
        String opis2 = opis.getText();
        Assert.assertEquals(opis2, "Color : White, Size : M");
        wd.close();
    }

    @Test
    public void metodaKolikoJeHaljinaUKorpi() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        Metode.dugmeDresses(wd);
        Metode.prevlacenjeDugmetaDresses(wd);
        Metode.summerDressesIzDugmeta(wd);
        Metode.klikSummerDressesIzDugmeta(wd);
        Thread.sleep(2000);
        wd.manage().window().fullscreen();
        Metode.haljina2(wd);
        Metode.izaberiHaljinu(wd);
        Metode.odaberiKolicinuHaljina(wd);
        Metode.izaberiVelicinu(wd, "M");
        Metode.izaberiBojuHaljine(wd);
        Metode.ubaciSveUKorpu(wd);
        Thread.sleep(3000);
        Metode.izadjiIzPopUpProzora(wd);
        Metode.udjiUKorpu(wd);
        WebElement opis = wd.findElement(By.xpath("//input[@name='quantity_6_41_0_0']"));
        String opis2 = opis.getAttribute("value");
        Assert.assertEquals(opis2, "2");
        wd.close();
    }

    @Test
    public void kolikoZutihRezultataJePronadjeno() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");

        Metode.dohvatiSearchBar(wd);
        Metode.klikniSearchBar(wd);
        Thread.sleep(3000);
        Metode.unesiUSearchBar(wd, "yellow");
        Thread.sleep(3000);
        Metode.potvrdaUnosa(wd);
        WebElement broj = wd.findElement(By.xpath("//span[@class='heading-counter']"));
        String kolicina = broj.getText();
        Assert.assertEquals(kolicina, "3 results have been found.");
        wd.close();
    }

    @Test
    public void bojaRezultataJePronadjeno() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        Metode.dohvatiSearchBar(wd);
        Metode.klikniSearchBar(wd);
        Thread.sleep(3000);
        Metode.unesiUSearchBar(wd, "yellow");
        Thread.sleep(3000);
        Metode.potvrdaUnosa(wd);

        boolean rec = false;
        List<WebElement> rezultati = wd.findElements(By.className("color_to_pick_list"));
        for (int i = 0; i < rezultati.size(); i++) {
            List<WebElement> rezultatiListaBoja = rezultati.get(i).findElements(By.className("color_pick"));
            for (int j = 0; j < rezultatiListaBoja.size(); j++) {
                if (rezultatiListaBoja.get(j).getAttribute("style").contains("background: rgb(241, 196, 15);")) {
                    rec = true;
                }
            }
        }
        Assert.assertEquals(rec, true);
        wd.close();
    }

    @Test
    public void testSlanjaPorukaIzContactUs() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");

        Metode.dohvatiDugmeContactUs(wd);
        Metode.klikniContactUs(wd);
        Thread.sleep(3000);
        MetodeContactUs.izaberiSubject(wd, "Webmaster");
        MetodeContactUs.dohvatiEmailBar(wd);
        MetodeContactUs.klikniEmailBar(wd);
        MetodeContactUs.unesiEmail(wd, "jelena@gmail.com");
        MetodeContactUs.dohvatiOrderReference(wd);
        MetodeContactUs.klikniOrderReference(wd);
        MetodeContactUs.unesiOrderReference(wd, "order neki");
        MetodeContactUs.ubaciSliku(wd);
        MetodeContactUs.dohvatiDaUbacisTekstPoruke(wd);
        MetodeContactUs.klikniDaUbacisTekstPoruke(wd);
        MetodeContactUs.unesiTekstPoruke(wd, "Ovo je neki tekst. Proba tekst.");
        MetodeContactUs.dohvatiSendDugme(wd);
        MetodeContactUs.klikniSendDugme(wd);

        WebElement tekstPoslatogMaila = wd.findElement(By.xpath("//p[@class='alert alert-success']"));
        String tekst = tekstPoslatogMaila.getText();
        Assert.assertEquals(tekst, "Your message has been successfully sent to our team.");
        wd.close();
    }
}
