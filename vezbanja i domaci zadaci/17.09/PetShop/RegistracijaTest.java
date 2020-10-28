package PetShopKlaseSelenium;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;

public class RegistracijaTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.get(Home.url);
        Home.clickEnterTheStore(wd);
        Katalog.clickSignIn(wd);
        LogIn.RegisterNow(wd);
        Registration.getUserID(wd);
        Registration.setUserID(wd,"a1Acd");
        Registration.getUserPass(wd);
        Registration.setUserPass(wd,"anelej1");
        Registration.getUserPassRepeat(wd);
        Registration.setUserPassRepeat(wd,"anelej1");
        AccountInfo.getFirstName(wd);
        AccountInfo.setFirstName(wd,"Jelena");
        AccountInfo.getLastName(wd);
        AccountInfo.setLastName(wd,"Radosavljevic");
        AccountInfo.getEmail(wd);
        AccountInfo.setEmail(wd,"jelena@gmail.com");
        AccountInfo.getPhone(wd);
        AccountInfo.setPhone(wd,"061554875");
        AccountInfo.getAddress1(wd);
        AccountInfo.setAddress1(wd,"Cara Dusana 5");
        AccountInfo.getAddress2(wd);
        AccountInfo.setAddress2(wd,"Kralja Petra 5");
        AccountInfo.getCity(wd);
        AccountInfo.setCity(wd,"Beograd");
        AccountInfo.getState(wd);
        AccountInfo.setState(wd,"Srbija");
        AccountInfo.getZip(wd);
        AccountInfo.setZip(wd,"11000");
        AccountInfo.getCountry(wd);
        AccountInfo.setCountry(wd,"Srbija");
        ProfileInfo.chooseLanguage(wd, "japanese");
        ProfileInfo.chooseCategory(wd,"CATS");
        ProfileInfo.enableList(wd);
        ProfileInfo.enableBanner(wd);
        ProfileInfo.saveInformation(wd);

    }
}

