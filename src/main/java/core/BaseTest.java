package core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected AndroidDriver<AndroidElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        //Capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appActivity","com.airbnb.android.feat.homescreen.HomeActivity");
        capabilities.setCapability("appPackage","com.airbnb.android");

        //Driver
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        //Driver time out
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass
    public void close(){
        //Close driver
        driver.closeApp();
    }

    //Return Android driver
    public AndroidDriver getDriver(){
        return driver;
    }
}
