public class Domaci {
    public static void main(String[] args){
//Koristeci Selenium webdriver otici na sajt https://www.techlistic.com/p/selenium-practice-form.html i popuniti formu
// (idealno celu, ako ne ide onda probajte bar do kontinenta)
//Potrudite se da koristite vise nacina (lokatora) za pronalazenje elemenata.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jelena\\Desktop\\Selenium\\chromedriver.exe");// Putanja do chrome drivera
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        org.openqa.selenium.WebElement txtFirstName = driver.findElement(org.openqa.selenium.By.xpath("//input[@name='firstname']"));
        txtFirstName.sendKeys("Jelena");

        org.openqa.selenium.WebElement txtLastName = driver.findElement(org.openqa.selenium.By.cssSelector("body.item-view.version-1-3-0:nth-child(2) div.page:nth-child(2) div.page_body.has-vertical-ads div.centered main.centered-bottom div.main.section div.widget.Blog:nth-child(1) div.blog-posts.hfeed.container article.post-outer-container div.post-outer div.post div.post-body.entry-content.float-container:nth-child(6) div:nth-child(1) div:nth-child(1) div.control-group:nth-child(15) > input:nth-child(2)"));
        txtLastName.sendKeys("Radosavljevic");

        org.openqa.selenium.WebElement dugme = driver.findElement(org.openqa.selenium.By.cssSelector("#sex-1"));
        dugme.click();

        org.openqa.selenium.WebElement txtYearsOfExperience = driver.findElement(org.openqa.selenium.By.id("exp-6"));
        txtYearsOfExperience.click();

        org.openqa.selenium.WebElement txtDate = driver.findElement(org.openqa.selenium.By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[18]/input[1]"));
        txtDate.sendKeys("13.09.2020.");

        org.openqa.selenium.WebElement Profession = driver.findElement(org.openqa.selenium.By.cssSelector("#profession-0"));
        Profession.click();

        org.openqa.selenium.WebElement AutomationTools = driver.findElement(org.openqa.selenium.By.id("tool-2"));
        AutomationTools.click();

        org.openqa.selenium.support.ui.Select drpContinent = new org.openqa.selenium.support.ui.Select(driver.findElement(org.openqa.selenium.By.xpath("//select[@id='continents']")));
        drpContinent.selectByVisibleText("Europe");

        org.openqa.selenium.support.ui.Select drpSeleniumComm = new org.openqa.selenium.support.ui.Select(driver.findElement(org.openqa.selenium.By.id("selenium_commands")));
        drpSeleniumComm.selectByIndex(3);

        org.openqa.selenium.WebElement addFile = driver.findElement(org.openqa.selenium.By.id("photo"));
        addFile.sendKeys("C:\\Users\\Jelena\\Desktop\\pexels.jpeg");

        org.openqa.selenium.WebElement Button = driver.findElement(org.openqa.selenium.By.xpath("//button[@id='submit']"));
        Button.click();














    }
}
