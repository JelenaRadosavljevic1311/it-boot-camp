import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestDrustveneMreze {
    @Test
    public void testIkoniceFb() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(1000);
        MetodeSocialNetworks.dohvatiDugmeFacebook(wd);
        MetodeSocialNetworks.klikniDugmeFacebook(wd);
        String newWindow = wd.getWindowHandle();

        ArrayList<String> tabs = new ArrayList<String> (wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)); //switches to new tab
        wd.get(wd.getCurrentUrl());
        Assert.assertEquals(wd.getCurrentUrl(), "https://www.facebook.com/groups/525066904174158/");
        wd.close();
    }
    @Test
    public void testIkoniceTwitter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(1000);
        MetodeSocialNetworks.dohvatiDugmeTwitter(wd);
        MetodeSocialNetworks.klikniDugmeTwitter(wd);
        String newWindow = wd.getWindowHandle();

        ArrayList<String> tabs = new ArrayList<String> (wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)); //switches to new tab
        wd.get(wd.getCurrentUrl());
        Assert.assertEquals(wd.getCurrentUrl(), "https://twitter.com/seleniumfrmwrk");
        wd.close();
    }
    @Test
    public void testIkoniceYoutube() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(1000);
        MetodeSocialNetworks.dohvatiDugmeYouTube(wd);
        MetodeSocialNetworks.klikniDugmeYouTube(wd);
        String newWindow = wd.getWindowHandle();

        ArrayList<String> tabs = new ArrayList<String> (wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)); //switches to new tab
        wd.get(wd.getCurrentUrl());
        Assert.assertEquals(wd.getCurrentUrl(), "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
        wd.close();
    }
    @Test
    public void testIkoniceGooglePlus() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");
        org.openqa.selenium.WebDriver wd = new org.openqa.selenium.chrome.ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
        Thread.sleep(1000);
        MetodeSocialNetworks.dohvatiDugmeGooglePlus(wd);
        MetodeSocialNetworks.klikniDugmeGooglePlus(wd);
        String newWindow = wd.getWindowHandle();

        ArrayList<String> tabs = new ArrayList<String> (wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)); //switches to new tab
        wd.get(wd.getCurrentUrl());
        Assert.assertEquals(wd.getCurrentUrl(), "https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&followup=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        wd.close();
    }
}

