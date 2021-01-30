package pages.airbnb;

import core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import org.openqa.selenium.By;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    //Locators
    //Where are u going text
    @AndroidFindBy(accessibility = "Where are you going? Navigate to start your search.")
    private AndroidElement whereAreYouText;

    //Methods

    /**
     * Check if home screen is displayed method
     * @return true if value is displayed
     */
    public boolean isHomeScreenDisplayed() {
        System.out.println("Check if Home screen is displayed");
        return driver.findElementsByAccessibilityId("Where are you going? " +
                "Navigate to start your search.").size() > 0;
    }

    public void clickProfile(){
        System.out.println("Trying to click the profile element");
        List<AndroidElement> elements = driver.findElements(By.id("2131429446"));
        elements.get(1).click();
        System.out.println("Profile element clicked.");
    }



}
