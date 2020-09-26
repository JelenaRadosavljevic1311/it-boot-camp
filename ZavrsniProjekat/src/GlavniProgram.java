import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GlavniProgram {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

         // Testirati da li kada se na početnoj stranici sajta mišem stane na dugme WOMEN,
        // a zatim odatle odabere SummerDresses odlazi na korektnu stranu.
        Metode.dugmeWomen(wd);
        Metode.prevlacenjeWomen(wd);
        Metode.summerDresses(wd);
        Metode.klikSummerDresses(wd);
        Thread.sleep(1000);
        Metode.logo(wd); //povratak na homepage

        //Testirati da li kada se na početnoj stranici sajta mišem stane na dugme DRESSES,
        // a zatim odatle odabere SUMMER DRESSES odlazi na korektnu stranu.
        Metode.dugmeDresses(wd);
        Metode.prevlacenjeDugmetaDresses(wd);
        Metode.summerDressesIzDugmeta(wd);
        Metode.klikSummerDressesIzDugmeta(wd);
        Thread.sleep(2000);

        //Odabrati drugu haljinu koja se nalazi u Summer Dresses ponudi. Staviti u korpu dve
        // takve haljine, M veličine u beloj boji.
        wd.manage().window().fullscreen();
        Metode.haljina2(wd);
        Metode.izaberiHaljinu(wd);
        Metode.odaberiKolicinuHaljina(wd);
        Metode.izaberiVelicinu(wd,"M");
        Metode.izaberiBojuHaljine(wd);
        Metode.ubaciSveUKorpu(wd);
        Thread.sleep(3000);
        Metode.izadjiIzPopUpProzora(wd);
        Thread.sleep(3000);
        Metode.udjiUKorpu(wd);
        Metode.logo(wd);

         // Testirati da li radi ‘search’ bar. Ukucati ‘yellow’ i ispitati rezultat pretrage.
         // Očekivan ishod je prikaz tri artikla, pri čemu svaki od njih ima mogućnost odabira žute boje.
         Metode.dohvatiSearchBar(wd);
         Metode.klikniSearchBar(wd);
         Thread.sleep(3000);
         Metode.unesiUSearchBar(wd,"yellow");
         Thread.sleep(3000);
         Metode.potvrdaUnosa(wd);
         Metode.logo(wd);

         //Kliknuti na “Contact us” i proveriti formu za slanje korisničkih pitanja.
        Metode.dohvatiDugmeContactUs(wd);
        Metode.klikniContactUs(wd);
        Thread.sleep(3000);
        MetodeContactUs.izaberiSubject(wd,"Webmaster");
        MetodeContactUs.dohvatiEmailBar(wd);
        MetodeContactUs.klikniEmailBar(wd);
        MetodeContactUs.unesiEmail(wd,"jelena@gmail.com");
        MetodeContactUs.dohvatiOrderReference(wd);
        MetodeContactUs.klikniOrderReference(wd);
        MetodeContactUs.unesiOrderReference(wd,"order neki");
        MetodeContactUs.ubaciSliku(wd);
        MetodeContactUs.dohvatiDaUbacisTekstPoruke(wd);
        MetodeContactUs.klikniDaUbacisTekstPoruke(wd);
        MetodeContactUs.unesiTekstPoruke(wd,"Ovo je neki tekst. Proba tekst.");
        MetodeContactUs.dohvatiSendDugme(wd);
        MetodeContactUs.klikniSendDugme(wd);

        //Proveriti da li ikonice koje se nalaze u meniju na kraju stranice vode na odgovarajuće adrese
        //(ikonice za Facebook, Twitter, YouTube...)
        MetodeSocialNetworks.dohvatiDugmeFacebook(wd);
        MetodeSocialNetworks.klikniDugmeFacebook(wd);

        MetodeSocialNetworks.dohvatiDugmeTwitter(wd);
        MetodeSocialNetworks.klikniDugmeTwitter(wd);

        MetodeSocialNetworks.dohvatiDugmeYouTube(wd);
        MetodeSocialNetworks.klikniDugmeYouTube(wd);

        MetodeSocialNetworks.dohvatiDugmeGooglePlus(wd);
        MetodeSocialNetworks.klikniDugmeGooglePlus(wd);

        // Poslati 30 pitanja pri čemu se podaci o svakoj poruci čitaju iz xlsx ili xls fajla.
        //Za svaku poruku proveriti da li je slanje bilo uspešno.
        Metode.logo(wd);
        XSSFWorkbook wb;
        FileInputStream ubacivanjeFajla;
        try {
            ubacivanjeFajla = new FileInputStream("C:\\Users\\Jelena\\Desktop\\automatskiSpisakOd30Pitanja.xlsx");
            wb = new XSSFWorkbook(ubacivanjeFajla);

            Sheet list = wb.getSheetAt(0);

            for(int i=1; i<=30; i++){

                Row red = list.getRow(i);

                Metode.dohvatiDugmeContactUs(wd);
                Metode.klikniContactUs(wd);
                Thread.sleep(3000);

                MetodeContactUs.izaberiSubject(wd,"Webmaster");
                MetodeContactUs.dohvatiEmailBar(wd);
                MetodeContactUs.klikniEmailBar(wd);
                Cell celija = red.getCell(0);
                WebElement inputEmail = wd.findElement(By.xpath(MetodeContactUs.emailByPath));
                inputEmail.sendKeys(celija.toString());

                MetodeContactUs.dohvatiOrderReference(wd);
                MetodeContactUs.klikniOrderReference(wd);
                Cell celija2 = red.getCell(1);
                WebElement inputOrderReference = wd.findElement(By.xpath(MetodeContactUs.orderReferenceByPath));
                inputOrderReference.sendKeys(celija2.toString());

                MetodeContactUs.ubaciSliku(wd);
                MetodeContactUs.dohvatiDaUbacisTekstPoruke(wd);
                MetodeContactUs.klikniDaUbacisTekstPoruke(wd);

                Cell celija3 = red.getCell(2);
                WebElement inputMessage = wd.findElement(By.xpath(MetodeContactUs.tekstPorukeByPath));
                inputMessage.sendKeys(celija3.toString());

                MetodeContactUs.dohvatiSendDugme(wd);
                MetodeContactUs.klikniSendDugme(wd);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
