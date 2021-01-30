package pages.airbnb;

import core.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    //Locators
    //Continue with google button
    @AndroidFindBy(id = "2131429078")
    private AndroidElement continueBtn;

    //Avatar name text
    @AndroidFindBy(id = "com.google.android.gms:id/account_display_name")
    private AndroidElement avatarNameTx;

    //Methods

    /**
     * Click Continue with google method
     */
    public void clickContinueGoogleBtn(){
        System.out.println("Trying to click the Continue with Google button...");
        continueBtn.click();
        System.out.println("Continue with google button clicked.");
    }

    /**
     * Click avatar name method
     */
    public void clickAvatarNameTx(){
        System.out.println("Trying to click the avatar name text...");
        avatarNameTx.click();
        System.out.println("Avatar name text clicked.");
    }
}
