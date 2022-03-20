package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage extends BasePage {

    public static String dresses_xpath = "//*[@id='block_top_menu']/ul/li[2]/a";
    public static String summerDresses_xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a";

    public LandingPage(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplicaiton() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void clickSummerDressesMenu() {
        WebElement megaMenu = driver.findElement(By.xpath(dresses_xpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(megaMenu);

        WebElement subMenu = driver.findElement(By.xpath(summerDresses_xpath));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }

}
