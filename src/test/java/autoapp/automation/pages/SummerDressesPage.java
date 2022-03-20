package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummerDressesPage extends BasePage {

    public static String categoryName_class = "category-name";

    public SummerDressesPage(BrowserDriver driver) {
        super(driver);
    }

    public static boolean verifyCategoryName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(categoryName_class)));

        Boolean isDisplayed = driver.findElement(By.className(categoryName_class)).isDisplayed();
        return isDisplayed;
    }
    
}
