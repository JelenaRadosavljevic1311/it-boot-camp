import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExcel {
    @Test
    public void testSlanjaPorukaIzExcela() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");

        XSSFWorkbook wb;
        FileInputStream ubacivanjeFajla;
        try {
            ubacivanjeFajla = new FileInputStream("C:\\Users\\Jelena\\Desktop\\automatskiSpisakOd30Pitanja.xlsx");
            wb = new XSSFWorkbook(ubacivanjeFajla);

            Sheet list = wb.getSheetAt(0);

            for (int i = 1; i <= 30; i++) {

                Row red = list.getRow(i);

                Metode.dohvatiDugmeContactUs(wd);
                Metode.klikniContactUs(wd);
                Thread.sleep(3000);

                MetodeContactUs.izaberiSubject(wd, "Webmaster");
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

                WebElement tekstPoslatogMaila = wd.findElement(By.xpath("//p[@class='alert alert-success']"));
                String tekst = tekstPoslatogMaila.getText();
                Assert.assertEquals(tekst, "Your message has been successfully sent to our team.");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        wd.close();
    }
}
