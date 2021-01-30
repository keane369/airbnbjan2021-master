package airbnb;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.airbnb.HomePage;
import pages.airbnb.LoginPage;

public class TC_01_AppLogin extends BaseTest {

    LoginPage login = new LoginPage(getDriver());
    HomePage home = new HomePage(getDriver());

    @Test(priority = 0)
    public void testLogin(){
        //Objects


        //Click continue with button element
        login.clickContinueGoogleBtn();

        //Click avatar name text
        login.clickAvatarNameTx();

        //Check if Home screen is displayed
        Assert.assertTrue(home.isHomeScreenDisplayed());

        home.clickProfile();
    }

    @Test(priority = 1)
    public void testLogOut(){

    }
}
